
interface olaCustomer {
    void bookCab();

    void findARide();

    void rentCab();

    void rateDriver();

    void scheduleCab();

    void cancelCab();

    void addMoneytoWallet();

    void raiseTicket();

    void signup();

    void signin();
}

interface olaDriver {
    void acceptBooking();

    void getCustomerLocation();

    void setAvailableStatus();

    void getMyCommission();

    void raiseMoneyTransferRequest();

    void callCustomer();

    void setUpYourVehicle();

    void customerFeedback();
}

interface olaOwner {
    void getDriverRecords();

    void getReportByDriverId();

    void getReportByRegion();

    void getTotalRevenue();

    void getCustomersFeedback();

    void addDriver();

    void removeDriver();

    void changeDriver();
}

public class abstraction implements olaOwner, olaDriver, olaCustomer {
    public static void main(String[] args) {
        olaCustomer cust = new abstraction();
        olaDriver manoj = new abstraction();
        manoj.acceptBooking();
    }

    @Override
    public void bookCab() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bookCab'");
    }

    @Override
    public void findARide() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findARide'");
    }

    @Override
    public void rentCab() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rentCab'");
    }

    @Override
    public void rateDriver() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rateDriver'");
    }

    @Override
    public void scheduleCab() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'scheduleCab'");
    }

    @Override
    public void cancelCab() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelCab'");
    }

    @Override
    public void addMoneytoWallet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addMoneytoWallet'");
    }

    @Override
    public void raiseTicket() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'raiseTicket'");
    }

    @Override
    public void signup() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'signup'");
    }

    @Override
    public void signin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'signin'");
    }

    @Override
    public void acceptBooking() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'acceptBooking'");
    }

    @Override
    public void getCustomerLocation() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerLocation'");
    }

    @Override
    public void setAvailableStatus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAvailableStatus'");
    }

    @Override
    public void getMyCommission() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMyCommission'");
    }

    @Override
    public void raiseMoneyTransferRequest() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'raiseMoneyTransferRequest'");
    }

    @Override
    public void callCustomer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'callCustomer'");
    }

    @Override
    public void setUpYourVehicle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setUpYourVehicle'");
    }

    @Override
    public void customerFeedback() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'customerFeedback'");
    }

    @Override
    public void getDriverRecords() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDriverRecords'");
    }

    @Override
    public void getReportByDriverId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getReportByDriverId'");
    }

    @Override
    public void getReportByRegion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getReportByRegion'");
    }

    @Override
    public void getTotalRevenue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTotalRevenue'");
    }

    @Override
    public void getCustomersFeedback() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomersFeedback'");
    }

    @Override
    public void addDriver() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addDriver'");
    }

    @Override
    public void removeDriver() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeDriver'");
    }

    @Override
    public void changeDriver() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changeDriver'");
    }
}
