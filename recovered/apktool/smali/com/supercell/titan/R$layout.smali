.class public final Lcom/supercell/titan/R$layout;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/supercell/titan/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "layout"
.end annotation


# static fields
.field public static sc_info_box:I

.field public static titan_webview_nav_bar:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/supercell/titan/R$layout;

    const v1, 0x1f

    const v0, 0x7f0b008b

    sput v0, Lcom/supercell/titan/R$layout;->sc_info_box:I

    const v0, 0x7f0b00a1

    sput v0, Lcom/supercell/titan/R$layout;->titan_webview_nav_bar:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
