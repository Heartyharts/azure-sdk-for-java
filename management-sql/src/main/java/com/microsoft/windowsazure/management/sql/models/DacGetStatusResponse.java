/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.sql.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
* The response structure for the DAC GetStatus operation.
*/
public class DacGetStatusResponse extends OperationResponse implements Iterable<DacGetStatusResponse.StatusInfo> {
    private ArrayList<DacGetStatusResponse.StatusInfo> statusInfoList;
    
    /**
    * Gets or sets the list of statuses relevant to this import/export request.
    * @return The StatusInfoList value.
    */
    public ArrayList<DacGetStatusResponse.StatusInfo> getStatusInfoList() {
        return this.statusInfoList;
    }
    
    /**
    * Gets or sets the list of statuses relevant to this import/export request.
    * @param statusInfoListValue The StatusInfoList value.
    */
    public void setStatusInfoList(final ArrayList<DacGetStatusResponse.StatusInfo> statusInfoListValue) {
        this.statusInfoList = statusInfoListValue;
    }
    
    /**
    * Initializes a new instance of the DacGetStatusResponse class.
    *
    */
    public DacGetStatusResponse() {
        super();
        this.statusInfoList = new ArrayList<DacGetStatusResponse.StatusInfo>();
    }
    
    /**
    * Gets the sequence of StatusInfoList.
    *
    */
    public Iterator<DacGetStatusResponse.StatusInfo> iterator() {
        return this.getStatusInfoList().iterator();
    }
    
    /**
    * Status of a DAC import.
    */
    public static class StatusInfo {
        private URI blobUri;
        
        /**
        * Gets or sets the URI of the DAC file stored in Windows Azure Blob
        * Storage to be imported.
        * @return The BlobUri value.
        */
        public URI getBlobUri() {
            return this.blobUri;
        }
        
        /**
        * Gets or sets the URI of the DAC file stored in Windows Azure Blob
        * Storage to be imported.
        * @param blobUriValue The BlobUri value.
        */
        public void setBlobUri(final URI blobUriValue) {
            this.blobUri = blobUriValue;
        }
        
        private String databaseName;
        
        /**
        * Gets or sets the name of the database into which this DAC will be
        * imported.
        * @return The DatabaseName value.
        */
        public String getDatabaseName() {
            return this.databaseName;
        }
        
        /**
        * Gets or sets the name of the database into which this DAC will be
        * imported.
        * @param databaseNameValue The DatabaseName value.
        */
        public void setDatabaseName(final String databaseNameValue) {
            this.databaseName = databaseNameValue;
        }
        
        private String errorMessage;
        
        /**
        * Gets or sets the error message of the request if the request failed
        * in some way.
        * @return The ErrorMessage value.
        */
        public String getErrorMessage() {
            return this.errorMessage;
        }
        
        /**
        * Gets or sets the error message of the request if the request failed
        * in some way.
        * @param errorMessageValue The ErrorMessage value.
        */
        public void setErrorMessage(final String errorMessageValue) {
            this.errorMessage = errorMessageValue;
        }
        
        private Calendar lastModifiedTime;
        
        /**
        * Gets or sets the last time the status changed.
        * @return The LastModifiedTime value.
        */
        public Calendar getLastModifiedTime() {
            return this.lastModifiedTime;
        }
        
        /**
        * Gets or sets the last time the status changed.
        * @param lastModifiedTimeValue The LastModifiedTime value.
        */
        public void setLastModifiedTime(final Calendar lastModifiedTimeValue) {
            this.lastModifiedTime = lastModifiedTimeValue;
        }
        
        private Calendar queuedTime;
        
        /**
        * Gets or sets the time at which the import/export request was queued
        * and the process initiated.
        * @return The QueuedTime value.
        */
        public Calendar getQueuedTime() {
            return this.queuedTime;
        }
        
        /**
        * Gets or sets the time at which the import/export request was queued
        * and the process initiated.
        * @param queuedTimeValue The QueuedTime value.
        */
        public void setQueuedTime(final Calendar queuedTimeValue) {
            this.queuedTime = queuedTimeValue;
        }
        
        private String requestId;
        
        /**
        * Gets or sets the request ID of this import/export request, so that it
        * can be tracked with future calls to GetStatus.
        * @return The RequestId value.
        */
        public String getRequestId() {
            return this.requestId;
        }
        
        /**
        * Gets or sets the request ID of this import/export request, so that it
        * can be tracked with future calls to GetStatus.
        * @param requestIdValue The RequestId value.
        */
        public void setRequestId(final String requestIdValue) {
            this.requestId = requestIdValue;
        }
        
        private String requestType;
        
        /**
        * Gets or sets the type (Import/Export) of this request.
        * @return The RequestType value.
        */
        public String getRequestType() {
            return this.requestType;
        }
        
        /**
        * Gets or sets the type (Import/Export) of this request.
        * @param requestTypeValue The RequestType value.
        */
        public void setRequestType(final String requestTypeValue) {
            this.requestType = requestTypeValue;
        }
        
        private String serverName;
        
        /**
        * Gets or sets the name of the SQL database server into which this DAC
        * will be imported or from which it will be exported.
        * @return The ServerName value.
        */
        public String getServerName() {
            return this.serverName;
        }
        
        /**
        * Gets or sets the name of the SQL database server into which this DAC
        * will be imported or from which it will be exported.
        * @param serverNameValue The ServerName value.
        */
        public void setServerName(final String serverNameValue) {
            this.serverName = serverNameValue;
        }
        
        private String status;
        
        /**
        * Gets or sets the status of the import/export request.
        * @return The Status value.
        */
        public String getStatus() {
            return this.status;
        }
        
        /**
        * Gets or sets the status of the import/export request.
        * @param statusValue The Status value.
        */
        public void setStatus(final String statusValue) {
            this.status = statusValue;
        }
    }
}
