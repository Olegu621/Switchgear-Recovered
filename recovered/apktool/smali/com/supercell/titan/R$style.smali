.class public final Lcom/supercell/titan/R$style;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/supercell/titan/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "style"
.end annotation


# static fields
.field public static KeyboardDialog:I

.field public static KeyboardDialogAnimation:I

.field public static invisibleText:I

.field public static largeEdittextText:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/supercell/titan/R$style;

    const v1, 0x19

    const v0, 0x7f100116

    sput v0, Lcom/supercell/titan/R$style;->KeyboardDialog:I

    const v0, 0x7f100117

    sput v0, Lcom/supercell/titan/R$style;->KeyboardDialogAnimation:I

    const v0, 0x7f10044d

    sput v0, Lcom/supercell/titan/R$style;->invisibleText:I

    const v0, 0x7f10044e

    sput v0, Lcom/supercell/titan/R$style;->largeEdittextText:I

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
