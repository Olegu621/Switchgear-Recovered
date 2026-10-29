.class public final Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 $2\u00020\u0001:\u0002\u000f$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0008\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J3\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ9\u0010\u001e\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u001cj\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t`\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\'\u0010!\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0008\u0010 \u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "gamePackage",
        "scidEnvironment",
        "",
        "Lcom/supercell/id/scid_plugin/IdAccount;",
        "collectAccountsFromGame",
        "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;",
        "gamePackageName",
        "key",
        "Ljd2;",
        "queryGameProvider",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljd2;",
        "",
        "clearCorruptedData",
        "(Ljava/lang/String;)V",
        "packageName",
        "",
        "isGameInstalled",
        "(Ljava/lang/String;)Z",
        "Landroid/net/Uri;",
        "buildURI",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;",
        "Le70;",
        "Lcom/supercell/id/scid_plugin/Promise;",
        "getAccountsFromGame",
        "(Ljava/lang/String;Ljava/lang/String;)Le70;",
        "accountsJson",
        "insertAccountsToGame",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "Landroid/content/Context;",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$Companion;

.field private static final TAG:Ljava/lang/String; = "SharedDataManager"


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->Companion:Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->context:Landroid/content/Context;

    .line 8
    .line 9
    return-void
.end method

.method public static synthetic a(Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->getAccountsFromGame$lambda$0(Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final buildURI(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 1

    .line 1
    new-instance p0, Landroid/net/Uri$Builder;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/net/Uri$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "content"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget-object v0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataContentProvider;->Companion:Lcom/supercell/id/scid_plugin/platform_interface/SharedDataContentProvider$Companion;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p4}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataContentProvider$Companion;->getAuthority(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string p1, "data"

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0, p2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "env"

    .line 33
    .line 34
    invoke-virtual {p0, p1, p3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    return-object p0
.end method

.method public static synthetic buildURI$default(Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroid/net/Uri;
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->buildURI(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final clearCorruptedData(Ljava/lang/String;)V
    .locals 8

    .line 1
    :try_start_0
    sget-object v0, Lcom/supercell/id/scid_plugin/SharedDataStorage;->Companion:Lcom/supercell/id/scid_plugin/SharedDataStorage$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/supercell/id/scid_plugin/SharedDataStorage$Companion;->getKeySharedAccounts(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    iget-object v2, p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->context:Landroid/content/Context;

    .line 8
    .line 9
    const/16 v6, 0x8

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    move-object v1, p0

    .line 14
    move-object v4, p1

    .line 15
    invoke-static/range {v1 .. v7}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->buildURI$default(Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p1, v1, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->context:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-virtual {p1, p0, v0, v0}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception v0

    .line 31
    move-object p0, v0

    .line 32
    new-instance p1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v0, "Failed to clear corrupted data "

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string p1, "SharedDataManager"

    .line 47
    .line 48
    invoke-static {p1, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method private final collectAccountsFromGame(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/supercell/id/scid_plugin/IdAccount;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "SharedDataManager"

    .line 2
    .line 3
    const-string v1, "Exception querying "

    .line 4
    .line 5
    const-string v2, "Unexpected cursor structure from "

    .line 6
    .line 7
    const-string v3, "JSON parsing error from "

    .line 8
    .line 9
    new-instance v4, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v5, p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->context:Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    :try_start_0
    sget-object v6, Lcom/supercell/id/scid_plugin/SharedDataStorage;->Companion:Lcom/supercell/id/scid_plugin/SharedDataStorage$Companion;

    .line 25
    .line 26
    invoke-virtual {v6, p2}, Lcom/supercell/id/scid_plugin/SharedDataStorage$Companion;->getKeySharedAccounts(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-direct {p0, p1, v6, p2}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->queryGameProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljd2;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    instance-of v7, v6, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$Success;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 35
    .line 36
    const-string v8, ": "

    .line 37
    .line 38
    if-eqz v7, :cond_0

    .line 39
    .line 40
    :try_start_1
    sget-object v1, Lcom/supercell/id/scid_plugin/IdAccount;->Companion:Lcom/supercell/id/scid_plugin/IdAccount$Companion;

    .line 41
    .line 42
    new-instance v2, Lorg/json/JSONArray;

    .line 43
    .line 44
    check-cast v6, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$Success;

    .line 45
    .line 46
    invoke-virtual {v6}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$Success;->getData()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-direct {v2, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Lcom/supercell/id/scid_plugin/IdAccount$Companion;->parse(Lorg/json/JSONArray;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 58
    .line 59
    .line 60
    goto/16 :goto_0

    .line 61
    .line 62
    :catch_0
    move-exception v1

    .line 63
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    new-instance v6, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {v0, v2, v1}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 86
    .line 87
    .line 88
    if-eqz v5, :cond_4

    .line 89
    .line 90
    const-string v1, "Clearing corrupted data from own package"

    .line 91
    .line 92
    invoke-static {v0, v1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    invoke-direct {p0, p2}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->clearCorruptedData(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :catch_1
    move-exception p0

    .line 100
    goto :goto_1

    .line 101
    :cond_0
    instance-of p0, v6, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$UnexpectedStructure;

    .line 102
    .line 103
    if-eqz p0, :cond_1

    .line 104
    .line 105
    check-cast v6, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$UnexpectedStructure;

    .line 106
    .line 107
    invoke-virtual {v6}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$UnexpectedStructure;->getColumns()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    new-instance p2, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    if-eqz v5, :cond_4

    .line 133
    .line 134
    const-string p0, "CRITICAL: Own ContentProvider returned unexpected structure - this is a bug!"

    .line 135
    .line 136
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_1
    instance-of p0, v6, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$SecurityError;

    .line 141
    .line 142
    if-eqz p0, :cond_2

    .line 143
    .line 144
    check-cast v6, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$SecurityError;

    .line 145
    .line 146
    invoke-virtual {v6}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$SecurityError;->getMessage()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_2
    instance-of p0, v6, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$QueryException;

    .line 151
    .line 152
    if-eqz p0, :cond_3

    .line 153
    .line 154
    move-object p0, v6

    .line 155
    check-cast p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$QueryException;

    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$QueryException;->getException()Ljava/lang/Exception;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    new-instance p2, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    check-cast v6, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$QueryException;

    .line 184
    .line 185
    invoke-virtual {v6}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$QueryException;->getException()Ljava/lang/Exception;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    invoke-static {v0, p0, p2}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 190
    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_3
    instance-of p0, v6, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$Empty;

    .line 194
    .line 195
    if-eqz p0, :cond_5

    .line 196
    .line 197
    :cond_4
    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_5
    new-instance p0, Lpn1;

    .line 202
    .line 203
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 204
    .line 205
    .line 206
    throw p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 207
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    const-string v1, "Error collecting data from "

    .line 210
    .line 211
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-static {v0, p1, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 222
    .line 223
    .line 224
    :goto_2
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 225
    .line 226
    invoke-direct {p0, v4}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 227
    .line 228
    .line 229
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    return-object p0
.end method

.method private static final getAccountsFromGame$lambda$0(Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->isGameInstalled(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->collectAccountsFromGame(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lnd0;->a:Lnd0;

    .line 13
    .line 14
    return-object p0
.end method

.method private final isGameInstalled(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->context:Landroid/content/Context;

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :catch_0
    return v0
.end method

.method private final queryGameProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljd2;
    .locals 9

    .line 1
    const-string v1, "SharedDataManager"

    .line 2
    .line 3
    const-string v0, "Unexpected cursor structure from "

    .line 4
    .line 5
    :try_start_0
    iget-object v2, p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->context:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {p0, v2, p2, p3, p1}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->buildURI(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->context:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 22
    .line 23
    .line 24
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    if-eqz p0, :cond_4

    .line 26
    .line 27
    :try_start_1
    invoke-interface {p0}, Landroid/database/Cursor;->getCount()I

    .line 28
    .line 29
    .line 30
    invoke-interface {p0}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const/16 v2, 0x3f

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-static {v3, v2, p3}, Lqd;->j(Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    if-nez p3, :cond_0

    .line 48
    .line 49
    sget-object p3, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$Empty;->INSTANCE:Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$Empty;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 52
    .line 53
    .line 54
    return-object p3

    .line 55
    :catch_0
    move-exception v0

    .line 56
    move-object p0, v0

    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :catchall_0
    move-exception v0

    .line 60
    move-object p3, v0

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    :try_start_3
    const-string p3, "success"

    .line 63
    .line 64
    invoke-interface {p0, p3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    const-string v4, "shared_accounts_value"

    .line 69
    .line 70
    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-ltz p3, :cond_3

    .line 75
    .line 76
    if-ltz v4, :cond_3

    .line 77
    .line 78
    invoke-interface {p0, p3}, Landroid/database/Cursor;->getInt(I)I

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    const/4 v5, 0x1

    .line 83
    if-ne p3, v5, :cond_3

    .line 84
    .line 85
    invoke-interface {p0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    if-eqz p3, :cond_2

    .line 90
    .line 91
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    new-instance v0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$Success;

    .line 99
    .line 100
    invoke-direct {v0, p3}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$Success;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 101
    .line 102
    .line 103
    :try_start_4
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 104
    .line 105
    .line 106
    return-object v0

    .line 107
    :cond_2
    :goto_0
    :try_start_5
    sget-object p3, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$Empty;->INSTANCE:Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$Empty;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 108
    .line 109
    :try_start_6
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 110
    .line 111
    .line 112
    return-object p3

    .line 113
    :cond_3
    :try_start_7
    invoke-interface {p0}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {v3, v2, p3}, Lqd;->j(Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p3

    .line 124
    new-instance v2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v0, " - columns: "

    .line 133
    .line 134
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    invoke-static {v1, p3}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    new-instance p3, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$UnexpectedStructure;

    .line 148
    .line 149
    invoke-interface {p0}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-static {v0}, Lqd;->n([Ljava/lang/Object;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-direct {p3, v0}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$UnexpectedStructure;-><init>(Ljava/util/List;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 161
    .line 162
    .line 163
    :try_start_8
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_8
    .catch Ljava/lang/SecurityException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 164
    .line 165
    .line 166
    return-object p3

    .line 167
    :goto_1
    :try_start_9
    throw p3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 168
    :catchall_1
    move-exception v0

    .line 169
    :try_start_a
    invoke-static {p0, p3}, Ljb1;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    throw v0

    .line 173
    :cond_4
    sget-object p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$Empty;->INSTANCE:Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$Empty;
    :try_end_a
    .catch Ljava/lang/SecurityException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    .line 174
    .line 175
    return-object p0

    .line 176
    :goto_2
    const-string p3, "Failed to query "

    .line 177
    .line 178
    const-string v0, " for key "

    .line 179
    .line 180
    invoke-static {p3, p1, v0, p2}, Len;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {v1, p1, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 185
    .line 186
    .line 187
    new-instance p1, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$QueryException;

    .line 188
    .line 189
    invoke-direct {p1, p0}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$QueryException;-><init>(Ljava/lang/Exception;)V

    .line 190
    .line 191
    .line 192
    return-object p1

    .line 193
    :catch_1
    move-exception v0

    .line 194
    move-object p0, v0

    .line 195
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    new-instance p1, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$SecurityError;

    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    if-nez p0, :cond_5

    .line 205
    .line 206
    const-string p0, "Security exception"

    .line 207
    .line 208
    :cond_5
    invoke-direct {p1, p0}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$SecurityError;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    return-object p1
.end method


# virtual methods
.method public final getAccountsFromGame(Ljava/lang/String;Ljava/lang/String;)Le70;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
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
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lqs1;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1, p2}, Lqs1;-><init>(Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/supercell/id/scid_plugin/PromiseUtilKt;->task(Lkotlin/jvm/functions/Function0;)Le70;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final insertAccountsToGame(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->context:Landroid/content/Context;

    .line 8
    .line 9
    const/16 v5, 0x8

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    move-object v0, p0

    .line 14
    move-object v2, p1

    .line 15
    move-object v3, p2

    .line 16
    invoke-static/range {v0 .. v6}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->buildURI$default(Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p1, v0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager;->context:Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget-object p2, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataContentProvider;->Companion:Lcom/supercell/id/scid_plugin/platform_interface/SharedDataContentProvider$Companion;

    .line 27
    .line 28
    invoke-virtual {p2, v2, p3}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataContentProvider$Companion;->getContentValuesForKeyValue(Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p1, p0, p2}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 33
    .line 34
    .line 35
    return-void
.end method
