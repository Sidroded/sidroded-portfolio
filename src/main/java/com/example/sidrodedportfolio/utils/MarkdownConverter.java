package com.example.sidrodedportfolio.utils;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;

public class MarkdownConverter {
    public static String convertToHtml(String markdown) {
        Parser parser = Parser.builder().build();
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        return renderer.render(parser.parse(markdown));
    }
}
