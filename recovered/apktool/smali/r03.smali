.class public final synthetic Lr03;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/supercell/titan/usercentrics/UsercentricsSDK;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:I

.field public final synthetic d:Lcom/usercentrics/sdk/UsercentricsReadyStatus;

.field public final synthetic e:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lr03;->a:Lcom/supercell/titan/usercentrics/UsercentricsSDK;

    .line 5
    .line 6
    iput-object p1, p0, Lr03;->b:Landroid/app/Activity;

    .line 7
    .line 8
    iput p3, p0, Lr03;->c:I

    .line 9
    .line 10
    iput-object p4, p0, Lr03;->d:Lcom/usercentrics/sdk/UsercentricsReadyStatus;

    .line 11
    .line 12
    iput-object p5, p0, Lr03;->e:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lr03;->d:Lcom/usercentrics/sdk/UsercentricsReadyStatus;

    .line 2
    .line 3
    iget-object v1, p0, Lr03;->e:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 4
    .line 5
    iget-object v2, p0, Lr03;->b:Landroid/app/Activity;

    .line 6
    .line 7
    iget-object v3, p0, Lr03;->a:Lcom/supercell/titan/usercentrics/UsercentricsSDK;

    .line 8
    .line 9
    iget p0, p0, Lr03;->c:I

    .line 10
    .line 11
    invoke-static {v2, v3, p0, v0, v1}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->b(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
