/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2017_10_01_preview.TdeCertificates;
import rx.Completable;

class TdeCertificatesImpl extends WrapperImpl<TdeCertificatesInner> implements TdeCertificates {
    private final SqlManager manager;

    TdeCertificatesImpl(SqlManager manager) {
        super(manager.inner().tdeCertificates());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Completable createAsync(String resourceGroupName, String serverName, TdeCertificateInner parameters) {
        TdeCertificatesInner client = this.inner();
        return client.createAsync(resourceGroupName, serverName, parameters).toCompletable();
    }

}