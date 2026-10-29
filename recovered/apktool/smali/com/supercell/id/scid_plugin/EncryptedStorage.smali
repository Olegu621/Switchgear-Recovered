.class public final Lcom/supercell/id/scid_plugin/EncryptedStorage;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00042\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0010R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/supercell/id/scid_plugin/EncryptedStorage;",
        "",
        "Landroid/content/Context;",
        "context",
        "",
        "preferenceName",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "key",
        "value",
        "",
        "put",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "get",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Landroid/content/Context;",
        "Ljava/lang/String;",
        "Landroid/content/SharedPreferences;",
        "encryptedSharedPreferences$delegate",
        "Lp51;",
        "getEncryptedSharedPreferences",
        "()Landroid/content/SharedPreferences;",
        "encryptedSharedPreferences",
        "Lcom/supercell/id/scid_plugin/SecurePreferences;",
        "securePreferences$delegate",
        "getSecurePreferences",
        "()Lcom/supercell/id/scid_plugin/SecurePreferences;",
        "securePreferences",
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

.field private final encryptedSharedPreferences$delegate:Lp51;

.field private final preferenceName:Ljava/lang/String;

.field private final securePreferences$delegate:Lp51;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
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
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/EncryptedStorage;->context:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/supercell/id/scid_plugin/EncryptedStorage;->preferenceName:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p1, Lce0;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p0, p2}, Lce0;-><init>(Lcom/supercell/id/scid_plugin/EncryptedStorage;I)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/EncryptedStorage;->encryptedSharedPreferences$delegate:Lp51;

    .line 25
    .line 26
    new-instance p1, Lce0;

    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    invoke-direct {p1, p0, p2}, Lce0;-><init>(Lcom/supercell/id/scid_plugin/EncryptedStorage;I)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/EncryptedStorage;->securePreferences$delegate:Lp51;

    .line 37
    .line 38
    return-void
.end method

.method public static synthetic a(Lcom/supercell/id/scid_plugin/EncryptedStorage;)Landroid/content/SharedPreferences;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/supercell/id/scid_plugin/EncryptedStorage;->encryptedSharedPreferences_delegate$lambda$0(Lcom/supercell/id/scid_plugin/EncryptedStorage;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lcom/supercell/id/scid_plugin/EncryptedStorage;)Lcom/supercell/id/scid_plugin/SecurePreferences;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/supercell/id/scid_plugin/EncryptedStorage;->securePreferences_delegate$lambda$1(Lcom/supercell/id/scid_plugin/EncryptedStorage;)Lcom/supercell/id/scid_plugin/SecurePreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final encryptedSharedPreferences_delegate$lambda$0(Lcom/supercell/id/scid_plugin/EncryptedStorage;)Landroid/content/SharedPreferences;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/EncryptedStorage;->context:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/EncryptedStorage;->preferenceName:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "FAILED_TO_CREATE_ENCRYPTED_SHARED_PREFS"

    .line 11
    .line 12
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v3, 0x0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    :try_start_0
    iget-object v4, p0, Lcom/supercell/id/scid_plugin/EncryptedStorage;->context:Landroid/content/Context;

    .line 21
    .line 22
    iget-object v5, p0, Lcom/supercell/id/scid_plugin/EncryptedStorage;->preferenceName:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v6, Lbx0;

    .line 25
    .line 26
    invoke-direct {v6, v4}, Lbx0;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Len;->y(I)I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-nez v7, :cond_1

    .line 34
    .line 35
    iget-object v7, v6, Lbx0;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v7, Landroid/security/keystore/KeyGenParameterSpec;

    .line 38
    .line 39
    if-nez v7, :cond_0

    .line 40
    .line 41
    iput v0, v6, Lbx0;->c:I

    .line 42
    .line 43
    invoke-virtual {v6}, Lbx0;->a()Lc5;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-static {v4, v5, v6}, Lbe0;->a(Landroid/content/Context;Ljava/lang/String;Lc5;)Lbe0;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :catch_0
    move-exception v4

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance v4, Ljava/lang/IllegalArgumentException;

    .line 55
    .line 56
    const-string v5, "KeyScheme set after setting a KeyGenParamSpec"

    .line 57
    .line 58
    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v4

    .line 62
    :cond_1
    new-instance v4, Ljava/lang/IllegalArgumentException;

    .line 63
    .line 64
    const-string v5, "AES256_GCM"

    .line 65
    .line 66
    const-string v6, "Unsupported scheme: "

    .line 67
    .line 68
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    :goto_0
    const-string v5, "EncryptedStorage"

    .line 77
    .line 78
    const-string v6, "Failed to create EncryptedSharedPreferences"

    .line 79
    .line 80
    invoke-static {v5, v6, v4}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    iget-object v4, p0, Lcom/supercell/id/scid_plugin/EncryptedStorage;->context:Landroid/content/Context;

    .line 84
    .line 85
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/EncryptedStorage;->preferenceName:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v4, p0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 100
    .line 101
    .line 102
    :cond_2
    return-object v3
.end method

.method private final getEncryptedSharedPreferences()Landroid/content/SharedPreferences;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/EncryptedStorage;->encryptedSharedPreferences$delegate:Lp51;

    .line 2
    .line 3
    invoke-interface {p0}, Lp51;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/content/SharedPreferences;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getSecurePreferences()Lcom/supercell/id/scid_plugin/SecurePreferences;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/EncryptedStorage;->securePreferences$delegate:Lp51;

    .line 2
    .line 3
    invoke-interface {p0}, Lp51;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/supercell/id/scid_plugin/SecurePreferences;

    .line 8
    .line 9
    return-object p0
.end method

.method private static final securePreferences_delegate$lambda$1(Lcom/supercell/id/scid_plugin/EncryptedStorage;)Lcom/supercell/id/scid_plugin/SecurePreferences;
    .locals 6

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/EncryptedStorage;->context:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const-string v3, ""

    .line 19
    .line 20
    :goto_0
    add-int/lit8 v2, v2, -0x1

    .line 21
    .line 22
    if-ltz v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    rem-int/lit8 v5, v2, 0x18

    .line 29
    .line 30
    aget-char v5, v0, v5

    .line 31
    .line 32
    xor-int/2addr v4, v5

    .line 33
    and-int/lit8 v4, v4, 0x1f

    .line 34
    .line 35
    add-int/lit8 v4, v4, 0x30

    .line 36
    .line 37
    int-to-char v4, v4

    .line 38
    new-instance v5, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance v0, Lcom/supercell/id/scid_plugin/SecurePreferences;

    .line 55
    .line 56
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/EncryptedStorage;->context:Landroid/content/Context;

    .line 57
    .line 58
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/EncryptedStorage;->preferenceName:Ljava/lang/String;

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    invoke-direct {v0, v1, p0, v3, v2}, Lcom/supercell/id/scid_plugin/SecurePreferences;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :array_0
    .array-data 2
        0x66s
        0x4cs
        0x78s
        0x59s
        0x42s
        0x39s
        0x4ds
        0x38s
        0x34s
        0x41s
        0x62s
        0x65s
        0x75s
        0x73s
        0x45s
        0x52s
        0x4ds
        0x59s
        0x39s
        0x59s
        0x46s
        0x7as
        0x56s
        0x47s
    .end array-data
.end method


# virtual methods
.method public final get(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/supercell/id/scid_plugin/EncryptedStorage;->getEncryptedSharedPreferences()Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    invoke-interface {v0, p1, p0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-direct {p0}, Lcom/supercell/id/scid_plugin/EncryptedStorage;->getSecurePreferences()Lcom/supercell/id/scid_plugin/SecurePreferences;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0, p1}, Lcom/supercell/id/scid_plugin/SecurePreferences;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final put(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/supercell/id/scid_plugin/EncryptedStorage;->getEncryptedSharedPreferences()Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-direct {p0}, Lcom/supercell/id/scid_plugin/EncryptedStorage;->getSecurePreferences()Lcom/supercell/id/scid_plugin/SecurePreferences;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0, p1, p2}, Lcom/supercell/id/scid_plugin/SecurePreferences;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
