.class public final Lcom/supercell/brawlstars/BuildConfig;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final APPLICATION_ID:Ljava/lang/String;

.field public static final BUILD_TYPE:Ljava/lang/String;

.field public static final DEBUG:Z

.field public static final FLAVOR:Ljava/lang/String;

.field public static final QUAGO_APP_TOKEN:Ljava/lang/String;

.field public static final SERVER_ENVIRONMENT:Ljava/lang/String;

.field public static final VERSION_CODE:I

.field public static final VERSION_NAME:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/supercell/brawlstars/BuildConfig;

    const v1, 0x9

    const-string v0, "com.supercell.brawlstars"

    sput-object v0, Lcom/supercell/brawlstars/BuildConfig;->APPLICATION_ID:Ljava/lang/String;

    const-string v0, "release"

    sput-object v0, Lcom/supercell/brawlstars/BuildConfig;->BUILD_TYPE:Ljava/lang/String;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/supercell/brawlstars/BuildConfig;->DEBUG:Z

    const-string v0, "googlePlay"

    sput-object v0, Lcom/supercell/brawlstars/BuildConfig;->FLAVOR:Ljava/lang/String;

    const-string v0, "bsrk35cgp2gh"

    sput-object v0, Lcom/supercell/brawlstars/BuildConfig;->QUAGO_APP_TOKEN:Ljava/lang/String;

    const-string v0, "production"

    sput-object v0, Lcom/supercell/brawlstars/BuildConfig;->SERVER_ENVIRONMENT:Ljava/lang/String;

    const v0, 0x10e84

    sput v0, Lcom/supercell/brawlstars/BuildConfig;->VERSION_CODE:I

    const-string v0, "69.252"

    sput-object v0, Lcom/supercell/brawlstars/BuildConfig;->VERSION_NAME:Ljava/lang/String;

    return-void
.end method
