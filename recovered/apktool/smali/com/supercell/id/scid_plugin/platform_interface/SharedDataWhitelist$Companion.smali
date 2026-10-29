.class public final Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist$Companion;
.super Lcom/supercell/id/scid_plugin/SingletonHolder;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/supercell/id/scid_plugin/SingletonHolder<",
        "Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;",
        "Landroid/content/Context;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist$Companion;",
        "Lcom/supercell/id/scid_plugin/SingletonHolder;",
        "Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;",
        "Landroid/content/Context;",
        "<init>",
        "()V",
        "TAG",
        "",
        "WHITELIST_STORAGE_NAME",
        "WHITELIST_STORAGE_KEY",
        "HARDCODED_WHITELIST",
        "",
        "getHardcodedHash",
        "packageName",
        "scid_plugin_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/supercell/id/scid_plugin/platform_interface/b;->a:Lcom/supercell/id/scid_plugin/platform_interface/b;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/supercell/id/scid_plugin/SingletonHolder;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getHardcodedHash(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;->access$getHARDCODED_WHITELIST$cp()Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/lang/String;

    .line 13
    .line 14
    return-object p0
.end method
