import java.util.ArrayList;
import java.util.List;

public class DataVisualizationController {

    private List<VisualizationData> visualizationDataList;

    public DataVisualizationController() {
        this.visualizationDataList = new ArrayList<>();
    }

    public void addDataPoint(String label, double value, String category) {
        VisualizationData dataPoint = new VisualizationData(label, value, category);
        visualizationDataList.add(dataPoint);
    }

    public void clearDataPoints() {
        visualizationDataList.clear();
    }

    public List<VisualizationData> getVisualizationDataList() {
        return visualizationDataList;
    }

    public static class VisualizationData {
        private String label;
        private double value;
        private String category;

        public VisualizationData(String label, double value, String category) {
            this.label = label;
            this.value = value;
            this.category = category;
        }

        public String getLabel() {
            return label;
        }

        public double getValue() {
            return value;
        }

        public String getCategory() {
            return category;
        }
    }
}