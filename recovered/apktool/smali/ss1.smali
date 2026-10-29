.class public final synthetic Lss1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lss1;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lss1;->b:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lss1;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p0, p0, Lss1;->b:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;->e(Ljava/lang/String;Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
