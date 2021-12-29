package WRSNSystem;

/**
 * @author Orust
 * @create 2021/8/16 12:37
 */

public class Node {
    private int id;
    private double x;
    private double y;

    private int hop; // 当前节点的数据转发跳数
    private double energy;
    private double dataRate;
    private double sendRate;
    private double energyRate;
    private double lifeTime;
    private double distanceToBase;
    private int clusterId;
    private boolean isDead;
    private double minEnergy; // ?
    private boolean chargeFlag;

//    private

    public Node(int id, double x, double y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public Node(int id, double x, double y, double dataRate) {
        this.id = id;
        this.x = x;
        this.y = Constants.NET_HEIGHT - y;  // 绘图是左上角为原点，转化为左下角为原点

        this.energy = Constants.NODE_ENERGY;
//        this.startEnergy =  Constants.NODE_ENERGY;
        this.dataRate = dataRate;
        this.distanceToBase = Math.sqrt(Math.pow((x - Constants.NET_WIDTH / 2.0), 2) + Math.pow((y - Constants.NET_HEIGHT / 2.0), 2));
        this.isDead = false;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getHop() {
        return hop;
    }

    public void setHop(int hop) {
        this.hop = hop;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getDataRate() {
        return dataRate;
    }

    public void setDataRate(double dataRate) {
        this.dataRate = dataRate;
    }

    public double getSendRate() {
        return sendRate;
    }

    public void setSendRate(double sendRate) {
        this.sendRate = sendRate;
    }

    public double getEnergyRate() {
        return energyRate;
    }

    public void setEnergyRate(double energyRate) {
        this.energyRate = energyRate;
    }

    public double getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(double lifeTime) {
        this.lifeTime = lifeTime;
    }

    public double getDistanceToBase() {
        return distanceToBase;
    }

    public void setDistanceToBase(double distanceToBase) {
        this.distanceToBase = distanceToBase;
    }

    public int getClusterId() {
        return clusterId;
    }

    public void setClusterId(int clusterId) {
        this.clusterId = clusterId;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public double getMinEnergy() {
        return minEnergy;
    }

    public void setMinEnergy(double minEnergy) {
        this.minEnergy = minEnergy;
    }

    public boolean isChargeFlag() {
        return chargeFlag;
    }

    public void setChargeFlag(boolean chargeFlag) {
        this.chargeFlag = chargeFlag;
    }
}