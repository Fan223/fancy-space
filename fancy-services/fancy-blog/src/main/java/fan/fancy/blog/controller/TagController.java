package fan.fancy.blog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.blog.converter.BlogConverter;
import fan.fancy.blog.pojo.dto.TagDTO;
import fan.fancy.blog.pojo.entity.TagDO;
import fan.fancy.blog.pojo.query.TagQuery;
import fan.fancy.blog.pojo.vo.TagVO;
import fan.fancy.blog.service.TagService;
import fan.fancy.toolkit.http.Response;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 博客标签控制器.
 *
 * @author Fan
 */
@RestController
@RequestMapping("/blog/tags")
@AllArgsConstructor
public class TagController {

    private final TagService tagService;

    private final BlogConverter blogConverter;

    @GetMapping
    public Response<Page<TagVO>> page(TagQuery query) {
        Page<TagDO> tags = tagService.page(query);
        return Response.success(blogConverter.convertTags(tags));
    }

    @GetMapping("/list")
    public Response<List<TagVO>> list(TagQuery query) {
        List<TagDO> tags = tagService.list(query);
        return Response.success(blogConverter.convertTags(tags));
    }

    @PostMapping
    public Response<Integer> create(@RequestBody TagDTO tagDTO) {
        TagDO tagDO = blogConverter.convertTag(tagDTO);
        return Response.success(tagService.create(tagDO));
    }

    @PutMapping("/{id}")
    public Response<Integer> update(@PathVariable String id, @RequestBody TagDTO tagDTO) {
        if (!id.equals(tagDTO.getId())) {
            return Response.fail("数据不匹配");
        }
        TagDO tagDO = blogConverter.convertTag(tagDTO);
        return Response.success(tagService.update(tagDO));
    }

    @DeleteMapping("/{id}")
    public Response<Integer> deleteById(@PathVariable String id) {
        return Response.success(tagService.deleteById(id));
    }

    @DeleteMapping
    public Response<Integer> deleteByIds(@RequestParam List<String> ids) {
        return Response.success(tagService.deleteByIds(ids));
    }
}
