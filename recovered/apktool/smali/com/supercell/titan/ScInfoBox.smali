.class public Lcom/supercell/titan/ScInfoBox;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static f:I


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:Landroid/view/View$OnClickListener;

.field public e:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/supercell/titan/ScInfoBox;

    const v1, 0x16

    const v0, -0x1

    sput v0, Lcom/supercell/titan/ScInfoBox;->f:I

    return-void
.end method

.method public static make(Ljava/lang/String;ILjava/lang/String;Landroid/view/View$OnClickListener;)Lcom/supercell/titan/ScInfoBox;
    .locals 3

    .line 1
    new-instance v0, Lcom/supercell/titan/ScInfoBox;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget v1, Lcom/supercell/titan/ScInfoBox;->f:I

    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    sput v1, Lcom/supercell/titan/ScInfoBox;->f:I

    .line 16
    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    iput-object v1, v0, Lcom/supercell/titan/ScInfoBox;->e:Landroid/widget/LinearLayout;

    .line 19
    .line 20
    iput-object p0, v0, Lcom/supercell/titan/ScInfoBox;->a:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p2, v0, Lcom/supercell/titan/ScInfoBox;->b:Ljava/lang/String;

    .line 23
    .line 24
    iput p1, v0, Lcom/supercell/titan/ScInfoBox;->c:I

    .line 25
    .line 26
    iput-object p3, v0, Lcom/supercell/titan/ScInfoBox;->d:Landroid/view/View$OnClickListener;

    .line 27
    .line 28
    return-object v0
.end method


# virtual methods
.method public dismiss()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lf72;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lf72;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public show()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/supercell/titan/k;

    .line 6
    .line 7
    invoke-direct {v1, p0, v0}, Lcom/supercell/titan/k;-><init>(Lcom/supercell/titan/ScInfoBox;Lcom/supercell/titan/GameApp;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
