.class public final synthetic Lp03;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Lcom/supercell/titan/usercentrics/UsercentricsSDK;

.field public final synthetic c:I

.field public final synthetic d:Lcom/usercentrics/sdk/UsercentricsReadyStatus;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp03;->a:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lp03;->b:Lcom/supercell/titan/usercentrics/UsercentricsSDK;

    .line 7
    .line 8
    iput p3, p0, Lp03;->c:I

    .line 9
    .line 10
    iput-object p4, p0, Lp03;->d:Lcom/usercentrics/sdk/UsercentricsReadyStatus;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lp03;->d:Lcom/usercentrics/sdk/UsercentricsReadyStatus;

    .line 2
    .line 3
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 4
    .line 5
    iget-object v1, p0, Lp03;->a:Landroid/app/Activity;

    .line 6
    .line 7
    iget-object v2, p0, Lp03;->b:Lcom/supercell/titan/usercentrics/UsercentricsSDK;

    .line 8
    .line 9
    iget p0, p0, Lp03;->c:I

    .line 10
    .line 11
    invoke-static {v1, v2, p0, v0, p1}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->c(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)Lkotlin/Unit;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
