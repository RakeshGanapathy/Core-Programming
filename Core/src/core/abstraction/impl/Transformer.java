package core.abstraction.impl;

public interface Transformer {
	void transform();
	default void analyze() {// adding this method will not affect other interfaces
		System.out.println("analysing the data");
	}
}

class MetricTransformer implements Transformer {
	public void captureMetrics() {
		System.out.println("capture application metric data");
	}

	@Override
	public void transform() {
		System.out.println("converts metric into logs");
	}
}

class XMLTransformer implements Transformer {
	public void transform() {
		System.out.println("converts the logs into xml file");
	}
}

class JsonTransformer implements Transformer {
	public void transform() {
		System.out.println("converts the logs into json file");
	}

}

class Impl {

	public static void main(String[] args) {
		XMLTransformer xml = new XMLTransformer();
		xml.transform();
		MetricTransformer metric = new MetricTransformer();
		metric.transform();
		metric.captureMetrics();
		JsonTransformer json = new JsonTransformer();
		json.transform();
		json.analyze();
	}
}