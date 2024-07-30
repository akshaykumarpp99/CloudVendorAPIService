package com.springbootproject.rest_demo.service;

import com.springbootproject.rest_demo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudvendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String vendorId);
    public CloudVendor getCloudvendor(String vendorId);
    public List<CloudVendor> getAllCloudVendor();
}
