.class public final synthetic Lo03;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/supercell/titan/usercentrics/UsercentricsSDK;

.field public final synthetic c:Landroid/app/Activity;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lo03;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lo03;->c:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lo03;->b:Lcom/supercell/titan/usercentrics/UsercentricsSDK;

    .line 10
    .line 11
    iput p3, p0, Lo03;->d:I

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Landroid/app/Activity;I)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput v0, p0, Lo03;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo03;->b:Lcom/supercell/titan/usercentrics/UsercentricsSDK;

    iput-object p2, p0, Lo03;->c:Landroid/app/Activity;

    iput p3, p0, Lo03;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lo03;->a:I

    .line 2
    .line 3
    iget v1, p0, Lo03;->d:I

    .line 4
    .line 5
    iget-object v2, p0, Lo03;->c:Landroid/app/Activity;

    .line 6
    .line 7
    iget-object p0, p0, Lo03;->b:Lcom/supercell/titan/usercentrics/UsercentricsSDK;

    .line 8
    .line 9
    check-cast p1, Lcom/usercentrics/sdk/UsercentricsReadyStatus;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {v2, p0, v1, p1}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->g(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;)Lkotlin/Unit;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    invoke-static {v2, p0, v1, p1}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->f(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;)Lkotlin/Unit;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
