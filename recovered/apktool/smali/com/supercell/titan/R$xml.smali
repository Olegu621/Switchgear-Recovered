.class public final Lcom/supercell/titan/R$xml;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/supercell/titan/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "xml"
.end annotation


# static fields
.field public static filesharing_paths:I

.field public static screenshots_paths:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/supercell/titan/R$xml;

    const v1, 0x1e

    const v0, 0x7f120003

    sput v0, Lcom/supercell/titan/R$xml;->filesharing_paths:I

    const v0, 0x7f120008

    sput v0, Lcom/supercell/titan/R$xml;->screenshots_paths:I

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
