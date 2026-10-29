.class public final Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\u000e\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\rJ\u001d\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u000b2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0017R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0017R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\r\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;",
        "",
        "Landroid/content/Context;",
        "context",
        "",
        "callingPackage",
        "scidEnvironment",
        "",
        "callingUid",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V",
        "",
        "validateCaller",
        "()Z",
        "runValidation",
        "isStagingEnvironment",
        "",
        "getRemoteWhitelistIfReady",
        "()Ljava/util/Map;",
        "expectedHash",
        "isInWhiteList",
        "(Ljava/lang/String;)Z",
        "Landroid/content/Context;",
        "Ljava/lang/String;",
        "I",
        "isValid$delegate",
        "Lp51;",
        "isValid",
        "Companion",
        "yq1",
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
.field public static final Companion:Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation$Companion;

.field private static final DEBUG_KEY:Ljava/lang/String; = "15:3B:54:7B:87:0E:F4:85:4D:94:2E:2C:DD:57:7B:5E:79:97:E1:31:63:30:F3:25:B1:82:41:98:D3:93:A8:22"

.field public static final INVALID_UID:I = -0x1

.field private static final TAG:Ljava/lang/String; = "PackageValidation"

.field private static final validationCache:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lyq1;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final callingPackage:Ljava/lang/String;

.field private final callingUid:I

.field private final context:Landroid/content/Context;

.field private final isValid$delegate:Lp51;

.field private final scidEnvironment:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->Companion:Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation$Companion;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->validationCache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->context:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->callingPackage:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->scidEnvironment:Ljava/lang/String;

    .line 15
    .line 16
    iput p4, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->callingUid:I

    .line 17
    .line 18
    new-instance p1, Lod;

    .line 19
    .line 20
    const/16 p2, 0x8

    .line 21
    .line 22
    invoke-direct {p1, p0, p2}, Lod;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->isValid$delegate:Lp51;

    .line 30
    .line 31
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, -0x1

    .line 32
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a(Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->isValid_delegate$lambda$0(Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final getRemoteWhitelistIfReady()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    :try_start_0
    sget-object v0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;->Companion:Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist$Companion;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->context:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/supercell/id/scid_plugin/SingletonHolder;->getInstance(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;->getWhitelistSync()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return-object p0

    .line 16
    :catch_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method private final isInWhiteList(Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->context:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->callingPackage:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v1, p0}, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidationUtilKt;->access$getPackageSignatures(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    array-length v1, p0

    .line 29
    move v2, v0

    .line 30
    :goto_0
    if-ge v2, v1, :cond_2

    .line 31
    .line 32
    aget-object v3, p0, v2

    .line 33
    .line 34
    invoke-static {v3}, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidationUtilKt;->access$getSHA256(Landroid/content/pm/Signature;)[B

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v3}, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidationUtilKt;->access$toHexStringWithColons([B)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    return p0

    .line 50
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    :cond_2
    :goto_1
    return v0
.end method

.method private final isStagingEnvironment()Z
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->scidEnvironment:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-string v1, "staging"

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-ne p0, v1, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    return v0
.end method

.method private static final isValid_delegate$lambda$0(Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->validateCaller()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final runValidation()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->getRemoteWhitelistIfReady()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v2, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->callingPackage:Ljava/lang/String;

    .line 9
    .line 10
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-direct {p0, v0}, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->isInWhiteList(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    return v1

    .line 25
    :cond_0
    invoke-direct {p0}, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->isStagingEnvironment()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    sget-object v0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;->Companion:Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist$Companion;

    .line 32
    .line 33
    iget-object v2, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->callingPackage:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist$Companion;->getHardcodedHash(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    const-string v0, "15:3B:54:7B:87:0E:F4:85:4D:94:2E:2C:DD:57:7B:5E:79:97:E1:31:63:30:F3:25:B1:82:41:98:D3:93:A8:22"

    .line 42
    .line 43
    invoke-direct {p0, v0}, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->isInWhiteList(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    return v1

    .line 50
    :cond_1
    sget-object v0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;->Companion:Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist$Companion;

    .line 51
    .line 52
    iget-object v2, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->callingPackage:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist$Companion;->getHardcodedHash(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-direct {p0, v0}, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->isInWhiteList(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_2

    .line 65
    .line 66
    return v1

    .line 67
    :cond_2
    const/4 p0, 0x0

    .line 68
    return p0
.end method

.method private final validateCaller()Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;->Companion:Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist$Companion;

    .line 3
    .line 4
    iget-object v2, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->context:Landroid/content/Context;

    .line 5
    .line 6
    invoke-virtual {v1, v2}, Lcom/supercell/id/scid_plugin/SingletonHolder;->getInstance(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;->getGeneration()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-object v1, v0

    .line 22
    :goto_0
    iget v2, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->callingUid:I

    .line 23
    .line 24
    const/4 v3, -0x1

    .line 25
    if-eq v2, v3, :cond_4

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    new-instance v3, Lyq1;

    .line 31
    .line 32
    iget-object v4, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->callingPackage:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v5, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->scidEnvironment:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 39
    .line 40
    invoke-virtual {v5, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-direct {v3, v4, v2, v0}, Lyq1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->validationCache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    const/4 p0, 0x1

    .line 63
    return p0

    .line 64
    :cond_2
    invoke-direct {p0}, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->runValidation()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_3
    return p0

    .line 74
    :cond_4
    :goto_1
    invoke-direct {p0}, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->runValidation()Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    return p0
.end method


# virtual methods
.method public final isValid()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->isValid$delegate:Lp51;

    .line 2
    .line 3
    invoke-interface {p0}, Lp51;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
