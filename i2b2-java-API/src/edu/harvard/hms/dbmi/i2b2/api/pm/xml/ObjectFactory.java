/*
 *  This file is part of i2b2-Java-API.
 *
 *  The i2b2-Java-API is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  i2b2-Java-API is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with i2b2-Java-API.  If not, see <http://www.gnu.org/licenses/>.
 */

package edu.harvard.hms.dbmi.i2b2.api.pm.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.harvard.hms.dbmi.bd2k.irct.ri.i2b2.message.pm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Role_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "role");
    private final static QName _DeleteCellParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "delete_cell_param");
    private final static QName _Hive_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "hive");
    private final static QName _GetHiveParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_hive_param");
    private final static QName _DeleteUserParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "delete_user_param");
    private final static QName _GetGlobal_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_global");
    private final static QName _GetUser_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_user");
    private final static QName _SetCellParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "set_cell_param");
    private final static QName _SetUserParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "set_user_param");
    private final static QName _SetApprovalParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "set_approval_param");
    private final static QName _Roles_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "roles");
    private final static QName _GetProjectParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_project_param");
    private final static QName _Global_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "global");
    private final static QName _ProjectRequest_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "project_request");
    private final static QName _SetCell_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "set_cell");
    private final static QName _SetProjectUserParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "set_project_user_param");
    private final static QName _GetUserParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_user_param");
    private final static QName _Cell_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "cell");
    private final static QName _SetHiveParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "set_hive_param");
    private final static QName _Param_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "param");
    private final static QName _DeleteHiveParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "delete_hive_param");
    private final static QName _GetAllApproval_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_all_approval");
    private final static QName _DeleteProjectUserParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "delete_project_user_param");
    private final static QName _SetProjectRequest_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "set_project_request");
    private final static QName _GetProjectRequest_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_project_request");
    private final static QName _SetApproval_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "set_approval");
    private final static QName _GetAllGlobal_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_all_global");
    private final static QName _DeleteGlobal_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "delete_global");
    private final static QName _GetAllUser_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_all_user");
    private final static QName _DeleteProject_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "delete_project");
    private final static QName _GetCell_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_cell");
    private final static QName _Approval_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "approval");
    private final static QName _SetProject_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "set_project");
    private final static QName _SetPassword_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "set_password");
    private final static QName _Configure_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "configure");
    private final static QName _SetUser_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "set_user");
    private final static QName _GetApprovalParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_approval_param");
    private final static QName _Hives_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "hives");
    private final static QName _DeleteApproval_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "delete_approval");
    private final static QName _GetAllProjectUserParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_all_project_user_param");
    private final static QName _GetRole_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_role");
    private final static QName _DeleteCell_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "delete_cell");
    private final static QName _SetRole_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "set_role");
    private final static QName _Cells_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "cells");
    private final static QName _ResponseString_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "response");
    private final static QName _SetHive_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "set_hive");
    private final static QName _GetHive_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_hive");
    private final static QName _GetAllUserParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_all_user_param");
    private final static QName _GetProjectUserParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_project_user_param");
    private final static QName _SetGlobal_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "set_global");
    private final static QName _GetUserConfiguration_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_user_configuration");
    private final static QName _GetAllProjectRequest_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_all_project_request");
    private final static QName _User_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "user");
    private final static QName _DeleteUser_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "delete_user");
    private final static QName _GetAllProjectParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_all_project_param");
    private final static QName _Projects_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "projects");
    private final static QName _DeleteProjectParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "delete_project_param");
    private final static QName _GetAllCell_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_all_cell");
    private final static QName _GetAllCellParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_all_cell_param");
    private final static QName _Globals_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "globals");
    private final static QName _GetApproval_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_approval");
    private final static QName _Project_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "project");
    private final static QName _GetAllRole_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_all_role");
    private final static QName _Approvals_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "approvals");
    private final static QName _DeleteApprovalParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "delete_approval_param");
    private final static QName _Response_QNAME = new QName("http://www.i2b2.org/xsd/hive/msg/1.1/", "response");
    private final static QName _DeleteHive_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "delete_hive");
    private final static QName _ProjectRequests_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "project_requests");
    private final static QName _GetAllHive_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_all_hive");
    private final static QName _GetAllProject_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_all_project");
    private final static QName _GetAllApprovalParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_all_approval_param");
    private final static QName _DeleteRole_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "delete_role");
    private final static QName _Users_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "users");
    private final static QName _GetProject_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_project");
    private final static QName _Params_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "params");
    private final static QName _Request_QNAME = new QName("http://www.i2b2.org/xsd/hive/msg/1.1/", "request");
    private final static QName _GetAllHiveParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_all_hive_param");
    private final static QName _SetProjectParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "set_project_param");
    private final static QName _GetCellParam_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_cell_param");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.harvard.hms.dbmi.bd2k.irct.ri.i2b2.message.pm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConditionsType }
     * 
     */
    public ConditionsType createConditionsType() {
        return new ConditionsType();
    }

    /**
     * Create an instance of {@link RequestMessageType }
     * 
     */
    public RequestMessageType createRequestMessageType() {
        return new RequestMessageType();
    }

    /**
     * Create an instance of {@link ResponseMessageType }
     * 
     */
    public ResponseMessageType createResponseMessageType() {
        return new ResponseMessageType();
    }

    /**
     * Create an instance of {@link BodyType }
     * 
     */
    public BodyType createBodyType() {
        return new BodyType();
    }

    /**
     * Create an instance of {@link MessageTypeType }
     * 
     */
    public MessageTypeType createMessageTypeType() {
        return new MessageTypeType();
    }

    /**
     * Create an instance of {@link MessageControlIdType }
     * 
     */
    public MessageControlIdType createMessageControlIdType() {
        return new MessageControlIdType();
    }

    /**
     * Create an instance of {@link ApplicationType }
     * 
     */
    public ApplicationType createApplicationType() {
        return new ApplicationType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link FacilityType }
     * 
     */
    public FacilityType createFacilityType() {
        return new FacilityType();
    }

    /**
     * Create an instance of {@link ResultStatusType }
     * 
     */
    public ResultStatusType createResultStatusType() {
        return new ResultStatusType();
    }

    /**
     * Create an instance of {@link RequestHeaderType }
     * 
     */
    public RequestHeaderType createRequestHeaderType() {
        return new RequestHeaderType();
    }

    /**
     * Create an instance of {@link ResponseHeaderType }
     * 
     */
    public ResponseHeaderType createResponseHeaderType() {
        return new ResponseHeaderType();
    }

    /**
     * Create an instance of {@link ProcessingIdType }
     * 
     */
    public ProcessingIdType createProcessingIdType() {
        return new ProcessingIdType();
    }

    /**
     * Create an instance of {@link MessageHeaderType }
     * 
     */
    public MessageHeaderType createMessageHeaderType() {
        return new MessageHeaderType();
    }

    /**
     * Create an instance of {@link InfoType }
     * 
     */
    public InfoType createInfoType() {
        return new InfoType();
    }

    /**
     * Create an instance of {@link SecurityType }
     * 
     */
    public SecurityType createSecurityType() {
        return new SecurityType();
    }

    /**
     * Create an instance of {@link PollingUrlType }
     * 
     */
    public PollingUrlType createPollingUrlType() {
        return new PollingUrlType();
    }

    /**
     * Create an instance of {@link CellDataType }
     * 
     */
    public CellDataType createCellDataType() {
        return new CellDataType();
    }

    /**
     * Create an instance of {@link ProjectsType }
     * 
     */
    public ProjectsType createProjectsType() {
        return new ProjectsType();
    }

    /**
     * Create an instance of {@link GlobalDatasType }
     * 
     */
    public GlobalDatasType createGlobalDatasType() {
        return new GlobalDatasType();
    }

    /**
     * Create an instance of {@link ApprovalType }
     * 
     */
    public ApprovalType createApprovalType() {
        return new ApprovalType();
    }

    /**
     * Create an instance of {@link ProjectType }
     * 
     */
    public ProjectType createProjectType() {
        return new ProjectType();
    }

    /**
     * Create an instance of {@link RoleType }
     * 
     */
    public RoleType createRoleType() {
        return new RoleType();
    }

    /**
     * Create an instance of {@link ApprovalsType }
     * 
     */
    public ApprovalsType createApprovalsType() {
        return new ApprovalsType();
    }

    /**
     * Create an instance of {@link ProjectRequestsType }
     * 
     */
    public ProjectRequestsType createProjectRequestsType() {
        return new ProjectRequestsType();
    }

    /**
     * Create an instance of {@link ParamsType }
     * 
     */
    public ParamsType createParamsType() {
        return new ParamsType();
    }

    /**
     * Create an instance of {@link UsersType }
     * 
     */
    public UsersType createUsersType() {
        return new UsersType();
    }

    /**
     * Create an instance of {@link ConfigureType }
     * 
     */
    public ConfigureType createConfigureType() {
        return new ConfigureType();
    }

    /**
     * Create an instance of {@link UserType }
     * 
     */
    public UserType createUserType() {
        return new UserType();
    }

    /**
     * Create an instance of {@link RolesType }
     * 
     */
    public RolesType createRolesType() {
        return new RolesType();
    }

    /**
     * Create an instance of {@link GlobalDataType }
     * 
     */
    public GlobalDataType createGlobalDataType() {
        return new GlobalDataType();
    }

    /**
     * Create an instance of {@link ProjectRequestType }
     * 
     */
    public ProjectRequestType createProjectRequestType() {
        return new ProjectRequestType();
    }

    /**
     * Create an instance of {@link ParamType }
     * 
     */
    public ParamType createParamType() {
        return new ParamType();
    }

    /**
     * Create an instance of {@link ConfiguresType }
     * 
     */
    public ConfiguresType createConfiguresType() {
        return new ConfiguresType();
    }

    /**
     * Create an instance of {@link CellDatasType }
     * 
     */
    public CellDatasType createCellDatasType() {
        return new CellDatasType();
    }

    /**
     * Create an instance of {@link GetUserConfigurationType }
     * 
     */
    public GetUserConfigurationType createGetUserConfigurationType() {
        return new GetUserConfigurationType();
    }

    /**
     * Create an instance of {@link SearchType }
     * 
     */
    public SearchType createSearchType() {
        return new SearchType();
    }

    /**
     * Create an instance of {@link PasswordType }
     * 
     */
    public PasswordType createPasswordType() {
        return new PasswordType();
    }

    /**
     * Create an instance of {@link BlobType }
     * 
     */
    public BlobType createBlobType() {
        return new BlobType();
    }

    /**
     * Create an instance of {@link ConditionsType.Condition }
     * 
     */
    public ConditionsType.Condition createConditionsTypeCondition() {
        return new ConditionsType.Condition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "role")
    public JAXBElement<RoleType> createRole(RoleType value) {
        return new JAXBElement<RoleType>(_Role_QNAME, RoleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "delete_cell_param")
    public JAXBElement<String> createDeleteCellParam(String value) {
        return new JAXBElement<String>(_DeleteCellParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "hive")
    public JAXBElement<ConfigureType> createHive(ConfigureType value) {
        return new JAXBElement<ConfigureType>(_Hive_QNAME, ConfigureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_hive_param")
    public JAXBElement<String> createGetHiveParam(String value) {
        return new JAXBElement<String>(_GetHiveParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "delete_user_param")
    public JAXBElement<String> createDeleteUserParam(String value) {
        return new JAXBElement<String>(_DeleteUserParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_global")
    public JAXBElement<String> createGetGlobal(String value) {
        return new JAXBElement<String>(_GetGlobal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_user")
    public JAXBElement<String> createGetUser(String value) {
        return new JAXBElement<String>(_GetUser_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "set_cell_param")
    public JAXBElement<CellDataType> createSetCellParam(CellDataType value) {
        return new JAXBElement<CellDataType>(_SetCellParam_QNAME, CellDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "set_user_param")
    public JAXBElement<UserType> createSetUserParam(UserType value) {
        return new JAXBElement<UserType>(_SetUserParam_QNAME, UserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApprovalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "set_approval_param")
    public JAXBElement<ApprovalType> createSetApprovalParam(ApprovalType value) {
        return new JAXBElement<ApprovalType>(_SetApprovalParam_QNAME, ApprovalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RolesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "roles")
    public JAXBElement<RolesType> createRoles(RolesType value) {
        return new JAXBElement<RolesType>(_Roles_QNAME, RolesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_project_param")
    public JAXBElement<String> createGetProjectParam(String value) {
        return new JAXBElement<String>(_GetProjectParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "global")
    public JAXBElement<GlobalDataType> createGlobal(GlobalDataType value) {
        return new JAXBElement<GlobalDataType>(_Global_QNAME, GlobalDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "project_request")
    public JAXBElement<ProjectRequestType> createProjectRequest(ProjectRequestType value) {
        return new JAXBElement<ProjectRequestType>(_ProjectRequest_QNAME, ProjectRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "set_cell")
    public JAXBElement<CellDataType> createSetCell(CellDataType value) {
        return new JAXBElement<CellDataType>(_SetCell_QNAME, CellDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "set_project_user_param")
    public JAXBElement<ProjectType> createSetProjectUserParam(ProjectType value) {
        return new JAXBElement<ProjectType>(_SetProjectUserParam_QNAME, ProjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_user_param")
    public JAXBElement<String> createGetUserParam(String value) {
        return new JAXBElement<String>(_GetUserParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "cell")
    public JAXBElement<CellDataType> createCell(CellDataType value) {
        return new JAXBElement<CellDataType>(_Cell_QNAME, CellDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "set_hive_param")
    public JAXBElement<ConfigureType> createSetHiveParam(ConfigureType value) {
        return new JAXBElement<ConfigureType>(_SetHiveParam_QNAME, ConfigureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "param")
    public JAXBElement<ParamType> createParam(ParamType value) {
        return new JAXBElement<ParamType>(_Param_QNAME, ParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "delete_hive_param")
    public JAXBElement<String> createDeleteHiveParam(String value) {
        return new JAXBElement<String>(_DeleteHiveParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApprovalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_all_approval")
    public JAXBElement<ApprovalType> createGetAllApproval(ApprovalType value) {
        return new JAXBElement<ApprovalType>(_GetAllApproval_QNAME, ApprovalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "delete_project_user_param")
    public JAXBElement<String> createDeleteProjectUserParam(String value) {
        return new JAXBElement<String>(_DeleteProjectUserParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "set_project_request")
    public JAXBElement<ProjectRequestType> createSetProjectRequest(ProjectRequestType value) {
        return new JAXBElement<ProjectRequestType>(_SetProjectRequest_QNAME, ProjectRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_project_request")
    public JAXBElement<String> createGetProjectRequest(String value) {
        return new JAXBElement<String>(_GetProjectRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApprovalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "set_approval")
    public JAXBElement<ApprovalType> createSetApproval(ApprovalType value) {
        return new JAXBElement<ApprovalType>(_SetApproval_QNAME, ApprovalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_all_global")
    public JAXBElement<String> createGetAllGlobal(String value) {
        return new JAXBElement<String>(_GetAllGlobal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "delete_global")
    public JAXBElement<String> createDeleteGlobal(String value) {
        return new JAXBElement<String>(_DeleteGlobal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_all_user")
    public JAXBElement<String> createGetAllUser(String value) {
        return new JAXBElement<String>(_GetAllUser_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "delete_project")
    public JAXBElement<ProjectType> createDeleteProject(ProjectType value) {
        return new JAXBElement<ProjectType>(_DeleteProject_QNAME, ProjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_cell")
    public JAXBElement<CellDataType> createGetCell(CellDataType value) {
        return new JAXBElement<CellDataType>(_GetCell_QNAME, CellDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApprovalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "approval")
    public JAXBElement<ApprovalType> createApproval(ApprovalType value) {
        return new JAXBElement<ApprovalType>(_Approval_QNAME, ApprovalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "set_project")
    public JAXBElement<ProjectType> createSetProject(ProjectType value) {
        return new JAXBElement<ProjectType>(_SetProject_QNAME, ProjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "set_password")
    public JAXBElement<String> createSetPassword(String value) {
        return new JAXBElement<String>(_SetPassword_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "configure")
    public JAXBElement<ConfigureType> createConfigure(ConfigureType value) {
        return new JAXBElement<ConfigureType>(_Configure_QNAME, ConfigureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "set_user")
    public JAXBElement<UserType> createSetUser(UserType value) {
        return new JAXBElement<UserType>(_SetUser_QNAME, UserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_approval_param")
    public JAXBElement<String> createGetApprovalParam(String value) {
        return new JAXBElement<String>(_GetApprovalParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfiguresType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "hives")
    public JAXBElement<ConfiguresType> createHives(ConfiguresType value) {
        return new JAXBElement<ConfiguresType>(_Hives_QNAME, ConfiguresType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApprovalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "delete_approval")
    public JAXBElement<ApprovalType> createDeleteApproval(ApprovalType value) {
        return new JAXBElement<ApprovalType>(_DeleteApproval_QNAME, ApprovalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_all_project_user_param")
    public JAXBElement<ProjectType> createGetAllProjectUserParam(ProjectType value) {
        return new JAXBElement<ProjectType>(_GetAllProjectUserParam_QNAME, ProjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_role")
    public JAXBElement<RoleType> createGetRole(RoleType value) {
        return new JAXBElement<RoleType>(_GetRole_QNAME, RoleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "delete_cell")
    public JAXBElement<CellDataType> createDeleteCell(CellDataType value) {
        return new JAXBElement<CellDataType>(_DeleteCell_QNAME, CellDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "set_role")
    public JAXBElement<RoleType> createSetRole(RoleType value) {
        return new JAXBElement<RoleType>(_SetRole_QNAME, RoleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellDatasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "cells")
    public JAXBElement<CellDatasType> createCells(CellDatasType value) {
        return new JAXBElement<CellDatasType>(_Cells_QNAME, CellDatasType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "response")
    public JAXBElement<String> createResponseString(String value) {
        return new JAXBElement<String>(_ResponseString_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "set_hive")
    public JAXBElement<ConfigureType> createSetHive(ConfigureType value) {
        return new JAXBElement<ConfigureType>(_SetHive_QNAME, ConfigureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_hive")
    public JAXBElement<ConfigureType> createGetHive(ConfigureType value) {
        return new JAXBElement<ConfigureType>(_GetHive_QNAME, ConfigureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_all_user_param")
    public JAXBElement<UserType> createGetAllUserParam(UserType value) {
        return new JAXBElement<UserType>(_GetAllUserParam_QNAME, UserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_project_user_param")
    public JAXBElement<String> createGetProjectUserParam(String value) {
        return new JAXBElement<String>(_GetProjectUserParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "set_global")
    public JAXBElement<GlobalDataType> createSetGlobal(GlobalDataType value) {
        return new JAXBElement<GlobalDataType>(_SetGlobal_QNAME, GlobalDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserConfigurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_user_configuration")
    public JAXBElement<GetUserConfigurationType> createGetUserConfiguration(GetUserConfigurationType value) {
        return new JAXBElement<GetUserConfigurationType>(_GetUserConfiguration_QNAME, GetUserConfigurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_all_project_request")
    public JAXBElement<String> createGetAllProjectRequest(String value) {
        return new JAXBElement<String>(_GetAllProjectRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "user")
    public JAXBElement<UserType> createUser(UserType value) {
        return new JAXBElement<UserType>(_User_QNAME, UserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "delete_user")
    public JAXBElement<String> createDeleteUser(String value) {
        return new JAXBElement<String>(_DeleteUser_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_all_project_param")
    public JAXBElement<String> createGetAllProjectParam(String value) {
        return new JAXBElement<String>(_GetAllProjectParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "projects")
    public JAXBElement<ProjectsType> createProjects(ProjectsType value) {
        return new JAXBElement<ProjectsType>(_Projects_QNAME, ProjectsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "delete_project_param")
    public JAXBElement<String> createDeleteProjectParam(String value) {
        return new JAXBElement<String>(_DeleteProjectParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_all_cell")
    public JAXBElement<String> createGetAllCell(String value) {
        return new JAXBElement<String>(_GetAllCell_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_all_cell_param")
    public JAXBElement<CellDataType> createGetAllCellParam(CellDataType value) {
        return new JAXBElement<CellDataType>(_GetAllCellParam_QNAME, CellDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalDatasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "globals")
    public JAXBElement<GlobalDatasType> createGlobals(GlobalDatasType value) {
        return new JAXBElement<GlobalDatasType>(_Globals_QNAME, GlobalDatasType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApprovalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_approval")
    public JAXBElement<ApprovalType> createGetApproval(ApprovalType value) {
        return new JAXBElement<ApprovalType>(_GetApproval_QNAME, ApprovalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "project")
    public JAXBElement<ProjectType> createProject(ProjectType value) {
        return new JAXBElement<ProjectType>(_Project_QNAME, ProjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_all_role")
    public JAXBElement<RoleType> createGetAllRole(RoleType value) {
        return new JAXBElement<RoleType>(_GetAllRole_QNAME, RoleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApprovalsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "approvals")
    public JAXBElement<ApprovalsType> createApprovals(ApprovalsType value) {
        return new JAXBElement<ApprovalsType>(_Approvals_QNAME, ApprovalsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "delete_approval_param")
    public JAXBElement<String> createDeleteApprovalParam(String value) {
        return new JAXBElement<String>(_DeleteApprovalParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/hive/msg/1.1/", name = "response")
    public JAXBElement<ResponseMessageType> createResponse(ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(_Response_QNAME, ResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "delete_hive")
    public JAXBElement<String> createDeleteHive(String value) {
        return new JAXBElement<String>(_DeleteHive_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectRequestsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "project_requests")
    public JAXBElement<ProjectRequestsType> createProjectRequests(ProjectRequestsType value) {
        return new JAXBElement<ProjectRequestsType>(_ProjectRequests_QNAME, ProjectRequestsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_all_hive")
    public JAXBElement<String> createGetAllHive(String value) {
        return new JAXBElement<String>(_GetAllHive_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_all_project")
    public JAXBElement<ProjectType> createGetAllProject(ProjectType value) {
        return new JAXBElement<ProjectType>(_GetAllProject_QNAME, ProjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApprovalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_all_approval_param")
    public JAXBElement<ApprovalType> createGetAllApprovalParam(ApprovalType value) {
        return new JAXBElement<ApprovalType>(_GetAllApprovalParam_QNAME, ApprovalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "delete_role")
    public JAXBElement<RoleType> createDeleteRole(RoleType value) {
        return new JAXBElement<RoleType>(_DeleteRole_QNAME, RoleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "users")
    public JAXBElement<UsersType> createUsers(UsersType value) {
        return new JAXBElement<UsersType>(_Users_QNAME, UsersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_project")
    public JAXBElement<ProjectType> createGetProject(ProjectType value) {
        return new JAXBElement<ProjectType>(_GetProject_QNAME, ProjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "params")
    public JAXBElement<ParamsType> createParams(ParamsType value) {
        return new JAXBElement<ParamsType>(_Params_QNAME, ParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/hive/msg/1.1/", name = "request")
    public JAXBElement<RequestMessageType> createRequest(RequestMessageType value) {
        return new JAXBElement<RequestMessageType>(_Request_QNAME, RequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_all_hive_param")
    public JAXBElement<String> createGetAllHiveParam(String value) {
        return new JAXBElement<String>(_GetAllHiveParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "set_project_param")
    public JAXBElement<ProjectType> createSetProjectParam(ProjectType value) {
        return new JAXBElement<ProjectType>(_SetProjectParam_QNAME, ProjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_cell_param")
    public JAXBElement<String> createGetCellParam(String value) {
        return new JAXBElement<String>(_GetCellParam_QNAME, String.class, null, value);
    }

}
