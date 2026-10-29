.class public final Lcom/supercell/titan/usercentrics/BuildConfig;
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

.field public static final LIBRARY_PACKAGE_NAME:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lcom/supercell/titan/usercentrics/BuildConfig;

    const v1, 0x1a

    const-string v0, "release"

    sput-object v0, Lcom/supercell/titan/usercentrics/BuildConfig;->BUILD_TYPE:Ljava/lang/String;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/supercell/titan/usercentrics/BuildConfig;->DEBUG:Z

    const-string v0, "com.supercell.titan.usercentrics"

    sput-object v0, Lcom/supercell/titan/usercentrics/BuildConfig;->LIBRARY_PACKAGE_NAME:Ljava/lang/String;

    new-instance v0, Lcom/supercell/titan/usercentrics/BuildConfig$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/supercell/titan/usercentrics/BuildConfig$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/supercell/titan/usercentrics/BuildConfig;->EnabledFeatures:Ljava/util/ArrayList;

    .line 7
    .line 8
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
