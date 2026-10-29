.class public final Lo6;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements La80;


# static fields
.field public static final c:Ljava/util/List;

.field public static final d:[B

.field public static final e:[B


# instance fields
.field public final a:Lac1;

.field public final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    filled-new-array {v0}, [Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lo6;->c:Ljava/util/List;

    .line 16
    .line 17
    const/16 v0, 0x10

    .line 18
    .line 19
    new-array v1, v0, [B

    .line 20
    .line 21
    sput-object v1, Lo6;->d:[B

    .line 22
    .line 23
    new-array v0, v0, [B

    .line 24
    .line 25
    fill-array-data v0, :array_0

    .line 26
    .line 27
    .line 28
    sput-object v0, Lo6;->e:[B

    .line 29
    .line 30
    return-void

    .line 31
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data
.end method

.method public constructor <init>([B)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-static {v0}, Lpm2;->a(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lo6;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    array-length v0, p1

    .line 25
    div-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {p1, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    array-length v1, p1

    .line 33
    div-int/lit8 v1, v1, 0x2

    .line 34
    .line 35
    array-length v2, p1

    .line 36
    invoke-static {p1, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lo6;->b:[B

    .line 41
    .line 42
    new-instance p1, Lac1;

    .line 43
    .line 44
    invoke-direct {p1, v0}, Lac1;-><init>([B)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lo6;->a:Lac1;

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    new-instance p0, Ljava/security/InvalidKeyException;

    .line 51
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, "invalid key size: "

    .line 55
    .line 56
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    array-length p1, p1

    .line 60
    const-string v1, " bytes; key must have 64 bytes"

    .line 61
    .line 62
    invoke-static {v0, p1, v1}, Lfm0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-direct {p0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p0

    .line 70
    :cond_1
    const-string p0, "Can not use AES-SIV in FIPS-mode."

    .line 71
    .line 72
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    throw p0
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const v1, 0x7fffffef

    .line 3
    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Lhe0;->b:Lhe0;

    .line 8
    .line 9
    const-string v1, "AES/CTR/NoPadding"

    .line 10
    .line 11
    iget-object v0, v0, Lhe0;->a:Lge0;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lge0;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljavax/crypto/Cipher;

    .line 18
    .line 19
    filled-new-array {p2, p1}, [[B

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p0, p2}, Lo6;->c([[B)[B

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2}, [B->clone()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, [B

    .line 32
    .line 33
    const/16 v2, 0x8

    .line 34
    .line 35
    aget-byte v3, v1, v2

    .line 36
    .line 37
    and-int/lit8 v3, v3, 0x7f

    .line 38
    .line 39
    int-to-byte v3, v3

    .line 40
    aput-byte v3, v1, v2

    .line 41
    .line 42
    const/16 v2, 0xc

    .line 43
    .line 44
    aget-byte v3, v1, v2

    .line 45
    .line 46
    and-int/lit8 v3, v3, 0x7f

    .line 47
    .line 48
    int-to-byte v3, v3

    .line 49
    aput-byte v3, v1, v2

    .line 50
    .line 51
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    .line 52
    .line 53
    iget-object p0, p0, Lo6;->b:[B

    .line 54
    .line 55
    const-string v3, "AES"

    .line 56
    .line 57
    invoke-direct {v2, p0, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance p0, Ljavax/crypto/spec/IvParameterSpec;

    .line 61
    .line 62
    invoke-direct {p0, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 63
    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    invoke-virtual {v0, v1, v2, p0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    filled-new-array {p2, p0}, [[B

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {p0}, Lk50;->b([[B)[B

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_0
    const-string p0, "plaintext too long"

    .line 83
    .line 84
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    return-object p0
.end method

.method public final b([B[B)[B
    .locals 8

    .line 1
    array-length v0, p1

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    if-lt v0, v1, :cond_2

    .line 5
    .line 6
    sget-object v0, Lhe0;->b:Lhe0;

    .line 7
    .line 8
    const-string v2, "AES/CTR/NoPadding"

    .line 9
    .line 10
    iget-object v0, v0, Lhe0;->a:Lge0;

    .line 11
    .line 12
    invoke-interface {v0, v2}, Lge0;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljavax/crypto/Cipher;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {p1, v2, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, [B->clone()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, [B

    .line 28
    .line 29
    const/16 v5, 0x8

    .line 30
    .line 31
    aget-byte v6, v4, v5

    .line 32
    .line 33
    and-int/lit8 v6, v6, 0x7f

    .line 34
    .line 35
    int-to-byte v6, v6

    .line 36
    aput-byte v6, v4, v5

    .line 37
    .line 38
    const/16 v5, 0xc

    .line 39
    .line 40
    aget-byte v6, v4, v5

    .line 41
    .line 42
    and-int/lit8 v6, v6, 0x7f

    .line 43
    .line 44
    int-to-byte v6, v6

    .line 45
    aput-byte v6, v4, v5

    .line 46
    .line 47
    new-instance v5, Ljavax/crypto/spec/SecretKeySpec;

    .line 48
    .line 49
    iget-object v6, p0, Lo6;->b:[B

    .line 50
    .line 51
    const-string v7, "AES"

    .line 52
    .line 53
    invoke-direct {v5, v6, v7}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v6, Ljavax/crypto/spec/IvParameterSpec;

    .line 57
    .line 58
    invoke-direct {v6, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 59
    .line 60
    .line 61
    const/4 v4, 0x2

    .line 62
    invoke-virtual {v0, v4, v5, v6}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 63
    .line 64
    .line 65
    array-length v4, p1

    .line 66
    invoke-static {p1, v1, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    array-length p1, p1

    .line 75
    if-nez p1, :cond_0

    .line 76
    .line 77
    if-nez v0, :cond_0

    .line 78
    .line 79
    const-string p1, "java.vendor"

    .line 80
    .line 81
    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const-string v1, "The Android Project"

    .line 86
    .line 87
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_0

    .line 92
    .line 93
    new-array v0, v2, [B

    .line 94
    .line 95
    :cond_0
    filled-new-array {p2, v0}, [[B

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p0, p1}, Lo6;->c([[B)[B

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {v3, p0}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-eqz p0, :cond_1

    .line 108
    .line 109
    return-object v0

    .line 110
    :cond_1
    new-instance p0, Ljavax/crypto/AEADBadTagException;

    .line 111
    .line 112
    const-string p1, "Integrity check failed."

    .line 113
    .line 114
    invoke-direct {p0, p1}, Ljavax/crypto/AEADBadTagException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p0

    .line 118
    :cond_2
    const-string p0, "Ciphertext too short."

    .line 119
    .line 120
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const/4 p0, 0x0

    .line 124
    return-object p0
.end method

.method public final varargs c([[B)[B
    .locals 7

    .line 1
    array-length v0, p1

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    iget-object p0, p0, Lo6;->a:Lac1;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Lo6;->e:[B

    .line 9
    .line 10
    invoke-virtual {p0, p1, v1}, Lac1;->a([BI)[B

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    sget-object v0, Lo6;->d:[B

    .line 16
    .line 17
    invoke-virtual {p0, v0, v1}, Lac1;->a([BI)[B

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v2, 0x0

    .line 22
    move v3, v2

    .line 23
    :goto_0
    array-length v4, p1

    .line 24
    add-int/lit8 v4, v4, -0x1

    .line 25
    .line 26
    if-ge v3, v4, :cond_2

    .line 27
    .line 28
    aget-object v4, p1, v3

    .line 29
    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    new-array v4, v2, [B

    .line 33
    .line 34
    :cond_1
    invoke-static {v0}, Lqj3;->o([B)[B

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0, v4, v1}, Lac1;->a([BI)[B

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {v0, v4}, Lk50;->P([B[B)[B

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    array-length v3, p1

    .line 50
    add-int/lit8 v3, v3, -0x1

    .line 51
    .line 52
    aget-object p1, p1, v3

    .line 53
    .line 54
    array-length v3, p1

    .line 55
    const/4 v4, 0x0

    .line 56
    if-lt v3, v1, :cond_4

    .line 57
    .line 58
    array-length v3, p1

    .line 59
    array-length v5, v0

    .line 60
    if-lt v3, v5, :cond_3

    .line 61
    .line 62
    array-length v3, p1

    .line 63
    array-length v4, v0

    .line 64
    sub-int/2addr v3, v4

    .line 65
    array-length v4, p1

    .line 66
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :goto_1
    array-length v4, v0

    .line 71
    if-ge v2, v4, :cond_5

    .line 72
    .line 73
    add-int v4, v3, v2

    .line 74
    .line 75
    aget-byte v5, p1, v4

    .line 76
    .line 77
    aget-byte v6, v0, v2

    .line 78
    .line 79
    xor-int/2addr v5, v6

    .line 80
    int-to-byte v5, v5

    .line 81
    aput-byte v5, p1, v4

    .line 82
    .line 83
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    const-string p0, "xorEnd requires a.length >= b.length"

    .line 87
    .line 88
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object v4

    .line 92
    :cond_4
    array-length v2, p1

    .line 93
    if-ge v2, v1, :cond_6

    .line 94
    .line 95
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    array-length p1, p1

    .line 100
    const/16 v3, -0x80

    .line 101
    .line 102
    aput-byte v3, v2, p1

    .line 103
    .line 104
    invoke-static {v0}, Lqj3;->o([B)[B

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {v2, p1}, Lk50;->P([B[B)[B

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    :cond_5
    invoke-virtual {p0, p1, v1}, Lac1;->a([BI)[B

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :cond_6
    const-string p0, "x must be smaller than a block."

    .line 118
    .line 119
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-object v4
.end method
