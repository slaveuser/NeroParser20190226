package org.tinos.test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.tinos.engine.analysis.Analyzer;
import org.tinos.engine.analysis.imp.CogsBinaryForestAnalyzerImp;
import static java.lang.System.*;
@SuppressWarnings("unused")
public class DemoPOS {
	public static void main(String[] args) throws IOException {
		Analyzer analyzer = new CogsBinaryForestAnalyzerImp();
		analyzer.init();
		Map<String, String> nlp = analyzer.getPosCnToCn();
		List<String> sets = new ArrayList<>();
		String[] ss = new String[27];
		String[] ss1 = new String[27];
		ss[0] = "结婚的和尚未结婚的等和尚未成家之人都和尚未"
				+ "成佛的和尚未必一样和尚未来的和尚未和从容"
				+ "易开始念经那和尚未进行告别不显得从容易知"
				+ "和尚未结婚的施主一样其实都不和尚未成佛的"
				+ "心态有关因为这和尚未成佛";
		ss[1] = "沿海南方向逃跑";
		ss[2] = "他说的确实在理";
		ss[3] = "杨过和小龙女重逢了";
		ss[4] = "结婚的和尚未结婚的";
		ss[5] = "提高产品质量";
		ss[6] = "中外科学名著";
		ss[7] = "北京大学生前来应聘";
		ss[8] = "为人民服务";
		ss[9] = "独立自主和平等互利的原则";
		ss[10] = "为人民办公益";
		ss[11] = "这事的确定不下来";
		ss[12] = "这扇门把手";
		ss[13] = "把手抬起来";
		ss[14] = "学生会宣传部";
		ss[15] = "学生会主动完成作业";
		ss[16] = "学生会游戏";
		ss[17] = "研究生活水平";
		ss[18] = "中国有企业";
		ss[19] = "我爱美国手球";
		ss[20] = "中国喜欢狗";
		ss[21] = "中国热爱狗";
		ss[22] = "王军虎去广州了";
		ss[23] = "王军虎头虎脑的";
		ss[24] = "将军任命了一名中将";
		ss[25] = "产量三年中将增长两倍";
		ss[26] = "、 益母 、结婚益母";
		ss1[0] = "结婚 的 和 尚未 结婚 的 等 和 尚未 成家 之 人 都 和 尚未"
				+ " 成佛 的 和尚 未必 一样 和 尚未 来 的 和尚 未 和 从 容"
				+ "易 开始 念经 那 和尚 未 进行 告别 不 显得 从容 易 知 "
				+ "和 尚未 结婚 的 施主 一样 其实 都 不 和 尚未 成佛 的"
				+ " 心态 有关 因为 这 和尚 未 成佛";
		ss1[1] = "沿 海 南 方向 逃跑";
		ss1[2] = "他 说 的 确实 在理";
		ss1[3] = "杨过 和 小龙女 离婚 了";
		ss1[4] = "结婚 的 和 尚未 结婚 的";
		ss1[5] = "提高 产品 质量";
		ss1[6] = "中外 科学 名著";
		ss1[7] = "北京 大学生 前 来 应聘";
		ss1[8] = "为 人民 服务";
		ss1[9] = "独立 自主 和 平等 互利 的 原则";
		ss1[10] = "为 人民 办公益";
		ss1[11] = "这事 的确 定 不 下来";
		ss1[12] = "这 扇 门 把手";
		ss1[13] = "把 手 抬 起来";
		ss1[14] = "学生 会 宣传 部";
		ss1[15] = "学生 会 主动 完成 作业";
		ss1[16] = "学生 会 游戏";
		ss1[17] = "研究 生活 水平";
		ss1[18] = "中国 有 企业";
		ss1[19] = "我 爱 美国 手球";
		ss1[20] = "中国 喜欢 狗";
		ss1[21] = "中国 热爱 狗";
		ss1[22] = "王军虎 去 广州 了";
		ss1[23] = "王军 虎头虎脑 的";
		ss1[24] = "将军 任命 了 一名 中将";
		ss1[25] = "产量 三 年 中 将 增长 两倍";
		ss1[26] = "、 益母 、结婚益母";
		for (int i = 0; i < ss.length; i++) {
			System.out.println("超级变态复杂病句-->" + ss[i]);
			sets = analyzer.parserString(ss[i].replace(" ", ""));//词性分析
			out.print("分析处理真实结果-->");
			for (int j = 0; j < sets.size(); j++) {
				if (!sets.get(j).replaceAll("\\s+", "").equals("")) {
					out.print(sets.get(j) + " ");
				}
			}
			out.println();
			out.println("期望得到分词效果-->" + ss1[i]);
			for (int k = 0; k < sets.size(); k++) {
				if (!sets.get(k).replaceAll("\\s+", "").equals("")) {
					nlp.get(sets.get(k));
					out.println(sets.get(k) + "/" + nlp.get(sets.get(k)) + "  ");
				}
			}
			out.println("");
		}
	}
}