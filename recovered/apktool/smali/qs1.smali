.class public final synthetic Lqs1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lqs1;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lqs1;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lqs1;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lqs1;->c:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lqs1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqs1;->b:Ljava/lang/String;

    iput-object p2, p0, Lqs1;->c:Ljava/lang/String;

    iput-object p3, p0, Lqs1;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lqs1;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lqs1;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lqs1;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lqs1;->d:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;

    .line 13
    .line 14
    invoke-static {p0, v2, v1}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->a(Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    check-cast p0, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 20
    .line 21
    invoke-static {v2, v1, p0}, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;->d(Ljava/lang/String;Ljava/lang/String;Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;)Lkotlin/Unit;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
