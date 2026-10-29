.class public final Lcom/supercell/titan/TitanConfig;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final APP_STORE:I

.field public static final APP_STORE_AMAZON:I

.field public static final APP_STORE_GOOGLE_PLAY:I

.field public static final APP_STORE_GOOGLE_PLAY_INSTANT_APP:I

.field public static final APP_STORE_SAMSUNG:I

.field public static final USING_GOOGLE_PLAY:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/supercell/titan/TitanConfig;

    const v1, 0x7

    const v0, 0x2

    sput v0, Lcom/supercell/titan/TitanConfig;->APP_STORE:I

    const v0, 0x1c

    sput v0, Lcom/supercell/titan/TitanConfig;->APP_STORE_AMAZON:I

    const v0, 0x2

    sput v0, Lcom/supercell/titan/TitanConfig;->APP_STORE_GOOGLE_PLAY:I

    const v0, 0x23

    sput v0, Lcom/supercell/titan/TitanConfig;->APP_STORE_GOOGLE_PLAY_INSTANT_APP:I

    const v0, 0x1b

    sput v0, Lcom/supercell/titan/TitanConfig;->APP_STORE_SAMSUNG:I

    const/4 v0, 0x1

    sput-boolean v0, Lcom/supercell/titan/TitanConfig;->USING_GOOGLE_PLAY:Z

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
