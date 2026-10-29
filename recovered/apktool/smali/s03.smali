.class public final synthetic Ls03;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/supercell/titan/usercentrics/UsercentricsSDK;

.field public final synthetic b:Lcom/usercentrics/sdk/UsercentricsReadyStatus;

.field public final synthetic c:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;


# direct methods
.method public synthetic constructor <init>(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Lcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls03;->a:Lcom/supercell/titan/usercentrics/UsercentricsSDK;

    .line 5
    .line 6
    iput-object p2, p0, Ls03;->b:Lcom/usercentrics/sdk/UsercentricsReadyStatus;

    .line 7
    .line 8
    iput-object p3, p0, Ls03;->c:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ls03;->c:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 2
    .line 3
    check-cast p1, Lnz2;

    .line 4
    .line 5
    iget-object v1, p0, Ls03;->a:Lcom/supercell/titan/usercentrics/UsercentricsSDK;

    .line 6
    .line 7
    iget-object p0, p0, Ls03;->b:Lcom/usercentrics/sdk/UsercentricsReadyStatus;

    .line 8
    .line 9
    invoke-static {v1, p0, v0, p1}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->d(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Lcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lnz2;)Lkotlin/Unit;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
