.class public final Lcom/supercell/titan/BuildConfig;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final BUILD_TYPE:Ljava/lang/String;

.field public static final DEBUG:Z

.field public static final EnabledFeatures:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final FLAVOR:Ljava/lang/String;

.field public static final FLAVOR_messaging:Ljava/lang/String;

.field public static final FLAVOR_store:Ljava/lang/String;

.field public static final LIBRARY_PACKAGE_NAME:Ljava/lang/String;

.field public static final PROMON_PROTECTION:I

.field public static final SC_PROMON_VERSION_MAJOR:I

.field public static final SC_PROMON_VERSION_MINOR:I

.field public static final SC_PROMON_VERSION_PATCH:I

.field public static final storeCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lcom/supercell/titan/BuildConfig;

    const v1, 0x15

    const-string v0, "release"

    sput-object v0, Lcom/supercell/titan/BuildConfig;->BUILD_TYPE:Ljava/lang/String;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/supercell/titan/BuildConfig;->DEBUG:Z

    const-string v0, "googlePlayFirebase"

    sput-object v0, Lcom/supercell/titan/BuildConfig;->FLAVOR:Ljava/lang/String;

    const-string v0, "firebase"

    sput-object v0, Lcom/supercell/titan/BuildConfig;->FLAVOR_messaging:Ljava/lang/String;

    const-string v0, "googlePlay"

    sput-object v0, Lcom/supercell/titan/BuildConfig;->FLAVOR_store:Ljava/lang/String;

    const-string v0, "com.supercell.titan"

    sput-object v0, Lcom/supercell/titan/BuildConfig;->LIBRARY_PACKAGE_NAME:Ljava/lang/String;

    const v0, 0x1

    sput v0, Lcom/supercell/titan/BuildConfig;->PROMON_PROTECTION:I

    const v0, 0x8

    sput v0, Lcom/supercell/titan/BuildConfig;->SC_PROMON_VERSION_MAJOR:I

    const v0, 0x2

    sput v0, Lcom/supercell/titan/BuildConfig;->SC_PROMON_VERSION_MINOR:I

    const v0, 0x3

    sput v0, Lcom/supercell/titan/BuildConfig;->SC_PROMON_VERSION_PATCH:I

    const v0, 0x2

    sput v0, Lcom/supercell/titan/BuildConfig;->storeCode:I

    new-instance v0, Lcl;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "SentryCrashes"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    const-string v1, "Quago"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    const-string v1, "ScreenSizeChangeSupport"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    const-string v1, "Promon"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    const-string v1, "GoogleInstallTimeAssetPack"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    sput-object v0, Lcom/supercell/titan/BuildConfig;->EnabledFeatures:Ljava/util/ArrayList;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
