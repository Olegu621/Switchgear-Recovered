.class public Lcom/supercell/id/scid_plugin/SecurePreferences;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/id/scid_plugin/SecurePreferences$SecurePreferencesException;
    }
.end annotation


# static fields
.field private static final CHARSET:Ljava/lang/String; = "UTF-8"

.field private static final KEY_TRANSFORMATION:Ljava/lang/String; = "AES/ECB/PKCS5Padding"

.field private static final SECRET_KEY_HASH_TRANSFORMATION:Ljava/lang/String; = "SHA-256"

.field private static final TAG:Ljava/lang/String; = "SecurePreferences"

.field private static final TRANSFORMATION:Ljava/lang/String; = "AES/CBC/PKCS5Padding"


# instance fields
.field private final encryptKeys:Z

.field private final keyReader:Ljavax/crypto/Cipher;

.field private final keyWriter:Ljavax/crypto/Cipher;

.field private final preferences:Landroid/content/SharedPreferences;

.field private final reader:Ljavax/crypto/Cipher;

.field private final writer:Ljavax/crypto/Cipher;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/supercell/id/scid_plugin/SecurePreferences$SecurePreferencesException;
        }
    .end annotation

    .line 1
    const-string v0, "Init failed"

    .line 2
    .line 3
    const-string v1, "SecurePreferences"

    .line 4
    .line 5
    const-string v2, "AES/ECB/PKCS5Padding"

    .line 6
    .line 7
    const-string v3, "AES/CBC/PKCS5Padding"

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    iput-object v4, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->writer:Ljavax/crypto/Cipher;

    .line 17
    .line 18
    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iput-object v3, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->reader:Ljavax/crypto/Cipher;

    .line 23
    .line 24
    invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iput-object v3, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->keyWriter:Ljavax/crypto/Cipher;

    .line 29
    .line 30
    invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->keyReader:Ljavax/crypto/Cipher;

    .line 35
    .line 36
    invoke-direct {p0, p3}, Lcom/supercell/id/scid_plugin/SecurePreferences;->initCiphers(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p3, 0x0

    .line 40
    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->preferences:Landroid/content/SharedPreferences;

    .line 45
    .line 46
    iput-boolean p4, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->encryptKeys:Z
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    return-void

    .line 49
    :catch_0
    move-exception p0

    .line 50
    goto :goto_0

    .line 51
    :catch_1
    move-exception p0

    .line 52
    goto :goto_1

    .line 53
    :goto_0
    invoke-static {v1, v0, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 54
    .line 55
    .line 56
    new-instance p1, Lcom/supercell/id/scid_plugin/SecurePreferences$SecurePreferencesException;

    .line 57
    .line 58
    invoke-direct {p1, p0}, Lcom/supercell/id/scid_plugin/SecurePreferences$SecurePreferencesException;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :goto_1
    invoke-static {v1, v0, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 63
    .line 64
    .line 65
    new-instance p1, Lcom/supercell/id/scid_plugin/SecurePreferences$SecurePreferencesException;

    .line 66
    .line 67
    invoke-direct {p1, p0}, Lcom/supercell/id/scid_plugin/SecurePreferences$SecurePreferencesException;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    throw p1
.end method

.method private static convert(Ljavax/crypto/Cipher;[B)[B
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/supercell/id/scid_plugin/SecurePreferences$SecurePreferencesException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    new-instance p1, Lcom/supercell/id/scid_plugin/SecurePreferences$SecurePreferencesException;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Lcom/supercell/id/scid_plugin/SecurePreferences$SecurePreferencesException;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    throw p1
.end method

.method private createKeyBytes(Ljava/lang/String;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;,
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .line 1
    const-string p0, "SHA-256"

    .line 2
    .line 3
    invoke-static {p0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/security/MessageDigest;->reset()V

    .line 8
    .line 9
    .line 10
    const-string v0, "UTF-8"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method private decrypt(Ljava/lang/String;Ljavax/crypto/Cipher;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string p0, ""

    .line 2
    .line 3
    const-string v0, "SecurePreferences"

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    :try_start_0
    invoke-static {p1, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 7
    .line 8
    .line 9
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 10
    :try_start_1
    invoke-static {p2, p1}, Lcom/supercell/id/scid_plugin/SecurePreferences;->convert(Ljavax/crypto/Cipher;[B)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 14
    :try_start_2
    new-instance p2, Ljava/lang/String;

    .line 15
    .line 16
    const-string v1, "UTF-8"

    .line 17
    .line 18
    invoke-direct {p2, p1, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :catch_0
    move-exception p1

    .line 23
    const-string p2, "Unable to create String from decrypted value"

    .line 24
    .line 25
    invoke-static {v0, p2, p1}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :catch_1
    move-exception p1

    .line 30
    const-string p2, "decrypt Unable to decrypt value"

    .line 31
    .line 32
    invoke-static {v0, p2, p1}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :catch_2
    const-string p1, "SecurePreferences.decrypt Base64.decode fail"

    .line 37
    .line 38
    invoke-static {v0, p1}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    return-object p0
.end method

.method private decryptValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->reader:Ljavax/crypto/Cipher;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/supercell/id/scid_plugin/SecurePreferences;->decrypt(Ljava/lang/String;Ljavax/crypto/Cipher;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private encrypt(Ljava/lang/String;Ljavax/crypto/Cipher;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/supercell/id/scid_plugin/SecurePreferences$SecurePreferencesException;
        }
    .end annotation

    .line 1
    :try_start_0
    const-string p0, "UTF-8"

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p2, p0}, Lcom/supercell/id/scid_plugin/SecurePreferences;->convert(Ljavax/crypto/Cipher;[B)[B

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-static {p0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :catch_0
    move-exception p0

    .line 18
    const-string p1, "SecurePreferences"

    .line 19
    .line 20
    const-string p2, "encrypt failed"

    .line 21
    .line 22
    invoke-static {p1, p2, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 23
    .line 24
    .line 25
    new-instance p1, Lcom/supercell/id/scid_plugin/SecurePreferences$SecurePreferencesException;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Lcom/supercell/id/scid_plugin/SecurePreferences$SecurePreferencesException;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw p1
.end method

.method private getIv()Ljavax/crypto/spec/IvParameterSpec;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->writer:Ljavax/crypto/Cipher;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljavax/crypto/Cipher;->getBlockSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-array v0, v0, [B

    .line 8
    .line 9
    const-string v1, "fldsjfodasjifudslfjdsaofshaufihadsf"

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->writer:Ljavax/crypto/Cipher;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljavax/crypto/Cipher;->getBlockSize()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {v1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    new-instance p0, Ljavax/crypto/spec/IvParameterSpec;

    .line 26
    .line 27
    invoke-direct {p0, v0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method private getSecretKey(Ljava/lang/String;)Ljavax/crypto/spec/SecretKeySpec;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;,
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/scid_plugin/SecurePreferences;->createKeyBytes(Ljava/lang/String;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance p1, Ljavax/crypto/spec/SecretKeySpec;

    .line 6
    .line 7
    const-string v0, "AES/CBC/PKCS5Padding"

    .line 8
    .line 9
    invoke-direct {p1, p0, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method private initCiphers(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/InvalidAlgorithmParameterException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/supercell/id/scid_plugin/SecurePreferences;->getIv()Ljavax/crypto/spec/IvParameterSpec;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1}, Lcom/supercell/id/scid_plugin/SecurePreferences;->getSecretKey(Ljava/lang/String;)Ljavax/crypto/spec/SecretKeySpec;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->writer:Ljavax/crypto/Cipher;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-virtual {v1, v2, p1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->reader:Ljavax/crypto/Cipher;

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    invoke-virtual {v1, v3, p1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->keyWriter:Ljavax/crypto/Cipher;

    .line 22
    .line 23
    invoke-virtual {v0, v2, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->keyReader:Ljavax/crypto/Cipher;

    .line 27
    .line 28
    invoke-virtual {p0, v3, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private putValue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/supercell/id/scid_plugin/SecurePreferences$SecurePreferencesException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->writer:Ljavax/crypto/Cipher;

    .line 2
    .line 3
    invoke-direct {p0, p2, v0}, Lcom/supercell/id/scid_plugin/SecurePreferences;->encrypt(Ljava/lang/String;Ljavax/crypto/Cipher;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->preferences:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private toKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->encryptKeys:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->keyWriter:Ljavax/crypto/Cipher;

    .line 6
    .line 7
    invoke-direct {p0, p1, v0}, Lcom/supercell/id/scid_plugin/SecurePreferences;->encrypt(Ljava/lang/String;Ljavax/crypto/Cipher;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    return-object p1
.end method


# virtual methods
.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/scid_plugin/SecurePreferences;->toKey(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->preferences:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->preferences:Landroid/content/SharedPreferences;

    .line 14
    .line 15
    const-string v1, ""

    .line 16
    .line 17
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {p0, v0}, Lcom/supercell/id/scid_plugin/SecurePreferences;->decryptValue(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->preferences:Landroid/content/SharedPreferences;

    .line 32
    .line 33
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-interface {p0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-object v0

    .line 45
    :cond_1
    const/4 p0, 0x0

    .line 46
    return-object p0
.end method

.method public put(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/scid_plugin/SecurePreferences;->toKey(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p2, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/supercell/id/scid_plugin/SecurePreferences;->putValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->preferences:Landroid/content/SharedPreferences;

    .line 19
    .line 20
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_2

    .line 25
    .line 26
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->preferences:Landroid/content/SharedPreferences;

    .line 27
    .line 28
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-interface {p0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public removeValue(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->preferences:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->preferences:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-direct {p0, p1}, Lcom/supercell/id/scid_plugin/SecurePreferences;->toKey(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->preferences:Landroid/content/SharedPreferences;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/SecurePreferences;->preferences:Landroid/content/SharedPreferences;

    .line 35
    .line 36
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-interface {p0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method
