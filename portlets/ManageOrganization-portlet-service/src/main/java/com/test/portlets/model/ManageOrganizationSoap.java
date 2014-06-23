package com.test.portlets.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    Brian Wing Shun Chan
 * @generated
 */
public class ManageOrganizationSoap implements Serializable {
    private long _sbId;
    private String _sbName;

    public ManageOrganizationSoap() {
    }

    public static ManageOrganizationSoap toSoapModel(ManageOrganization model) {
        ManageOrganizationSoap soapModel = new ManageOrganizationSoap();

        soapModel.setSbId(model.getSbId());
        soapModel.setSbName(model.getSbName());

        return soapModel;
    }

    public static ManageOrganizationSoap[] toSoapModels(
        ManageOrganization[] models) {
        ManageOrganizationSoap[] soapModels = new ManageOrganizationSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ManageOrganizationSoap[][] toSoapModels(
        ManageOrganization[][] models) {
        ManageOrganizationSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ManageOrganizationSoap[models.length][models[0].length];
        } else {
            soapModels = new ManageOrganizationSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ManageOrganizationSoap[] toSoapModels(
        List<ManageOrganization> models) {
        List<ManageOrganizationSoap> soapModels = new ArrayList<ManageOrganizationSoap>(models.size());

        for (ManageOrganization model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ManageOrganizationSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _sbId;
    }

    public void setPrimaryKey(long pk) {
        setSbId(pk);
    }

    public long getSbId() {
        return _sbId;
    }

    public void setSbId(long sbId) {
        _sbId = sbId;
    }

    public String getSbName() {
        return _sbName;
    }

    public void setSbName(String sbName) {
        _sbName = sbName;
    }
}
