.class public Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001d\u0010\r\u001a\u00020\u000c2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ3\u0010\u0012\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u0010j\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t`\u00112\u0006\u0010\u000f\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;",
        "",
        "Landroid/content/Context;",
        "context",
        "",
        "environment",
        "scidEnvironment",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "Lcom/supercell/id/scid_plugin/IdAccount;",
        "accounts",
        "",
        "saveAccounts",
        "(Ljava/util/List;)V",
        "packageName",
        "Le70;",
        "Lcom/supercell/id/scid_plugin/Promise;",
        "loadSharedAccounts",
        "(Ljava/lang/String;)Le70;",
        "Landroid/content/Context;",
        "Ljava/lang/String;",
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


# instance fields
.field private final context:Landroid/content/Context;

.field private final environment:Ljava/lang/String;

.field private final scidEnvironment:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;->context:Landroid/content/Context;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;->environment:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p3, p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;->scidEnvironment:Ljava/lang/String;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public loadSharedAccounts(Ljava/lang/String;)Le70;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;->context:Landroid/content/Context;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;->scidEnvironment:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p0}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->getAccountsFromGame(Ljava/lang/String;Ljava/lang/String;)Le70;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public saveAccounts(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/supercell/id/scid_plugin/IdAccount;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/json/JSONArray;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/supercell/id/scid_plugin/IdAccount;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/supercell/id/scid_plugin/IdAccount;->toJsonObject()Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;->context:Landroid/content/Context;

    .line 47
    .line 48
    invoke-direct {v0, v1}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;-><init>(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    sget-object v1, Lcom/supercell/id/scid_plugin/SharedDataStorage;->Companion:Lcom/supercell/id/scid_plugin/SharedDataStorage$Companion;

    .line 52
    .line 53
    iget-object v2, p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;->scidEnvironment:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Lcom/supercell/id/scid_plugin/SharedDataStorage$Companion;->getKeySharedAccounts(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;->scidEnvironment:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1, p0, p1}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->insertAccountsToGame(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method
