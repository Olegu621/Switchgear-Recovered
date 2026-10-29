.class public final Ly5;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lc4;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/security/KeyStore;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ly5;->a:I

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 56
    invoke-virtual {p2, p1, v0}, Ljava/security/KeyStore;->getKey(Ljava/lang/String;[C)Ljava/security/Key;

    move-result-object p2

    check-cast p2, Ljavax/crypto/SecretKey;

    iput-object p2, p0, Ly5;->b:Ljava/lang/Object;

    if-eqz p2, :cond_0

    return-void

    .line 57
    :cond_0
    new-instance p0, Ljava/security/InvalidKeyException;

    const-string p2, "Keystore cannot load the key with ID: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public constructor <init>([BI)V
    .locals 1

    .line 1
    iput p2, p0, Ly5;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 p2, 0x2

    .line 10
    invoke-static {p2}, Lpm2;->b(I)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    new-instance p2, Lgy0;

    .line 17
    .line 18
    invoke-direct {p2, p1}, Lgy0;-><init>([B)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Ly5;->b:Ljava/lang/Object;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p0, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    .line 25
    .line 26
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    throw p0

    .line 31
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance p2, Liy0;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-direct {p2, p1, v0}, Liy0;-><init>([BI)V

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, Ly5;->b:Ljava/lang/Object;

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance p2, Liy0;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-direct {p2, p1, v0}, Liy0;-><init>([BI)V

    .line 50
    .line 51
    .line 52
    iput-object p2, p0, Ly5;->b:Ljava/lang/Object;

    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 10

    .line 1
    iget v0, p0, Ly5;->a:I

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    iget-object v2, p0, Ly5;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    array-length p0, p1

    .line 11
    add-int/lit8 p0, p0, 0x28

    .line 12
    .line 13
    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/16 v0, 0x18

    .line 18
    .line 19
    invoke-static {v0}, Lo02;->a(I)[B

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    check-cast v2, Liy0;

    .line 27
    .line 28
    invoke-virtual {v2, p0, v0, p1, p2}, Lta;->g(Ljava/nio/ByteBuffer;[B[B[B)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_0
    array-length p0, p1

    .line 37
    add-int/lit8 p0, p0, 0x1c

    .line 38
    .line 39
    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {v1}, Lo02;->a(I)[B

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    .line 50
    check-cast v2, Liy0;

    .line 51
    .line 52
    invoke-virtual {v2, p0, v0, p1, p2}, Lta;->g(Ljava/nio/ByteBuffer;[B[B[B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_1
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ly5;->d([B[B)[B

    .line 61
    .line 62
    .line 63
    move-result-object p0
    :try_end_0
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    goto :goto_1

    .line 65
    :catch_0
    move-exception v0

    .line 66
    goto :goto_0

    .line 67
    :catch_1
    move-exception v0

    .line 68
    :goto_0
    const-string v1, "y5"

    .line 69
    .line 70
    const-string v2, "encountered a potentially transient KeyStore error, will wait and retry"

    .line 71
    .line 72
    invoke-static {v1, v2, v0}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 80
    .line 81
    mul-double/2addr v0, v2

    .line 82
    double-to-int v0, v0

    .line 83
    int-to-long v0, v0

    .line 84
    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2

    .line 85
    .line 86
    .line 87
    :catch_2
    invoke-virtual {p0, p1, p2}, Ly5;->d([B[B)[B

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    :goto_1
    return-object p0

    .line 92
    :pswitch_2
    invoke-static {v1}, Lo02;->a(I)[B

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast v2, Lgy0;

    .line 97
    .line 98
    iget-boolean v0, v2, Lgy0;->b:Z

    .line 99
    .line 100
    array-length v3, p0

    .line 101
    const/4 v4, 0x0

    .line 102
    if-ne v3, v1, :cond_6

    .line 103
    .line 104
    array-length v3, p1

    .line 105
    const v5, 0x7fffffe3

    .line 106
    .line 107
    .line 108
    if-gt v3, v5, :cond_5

    .line 109
    .line 110
    if-eqz v0, :cond_0

    .line 111
    .line 112
    array-length v3, p1

    .line 113
    add-int/lit8 v3, v3, 0x1c

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_0
    array-length v3, p1

    .line 117
    add-int/lit8 v3, v3, 0x10

    .line 118
    .line 119
    :goto_2
    new-array v8, v3, [B

    .line 120
    .line 121
    const/4 v3, 0x0

    .line 122
    if-eqz v0, :cond_1

    .line 123
    .line 124
    invoke-static {p0, v3, v8, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 125
    .line 126
    .line 127
    :cond_1
    invoke-static {p0}, Lgy0;->a([B)Ljava/security/spec/AlgorithmParameterSpec;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    sget-object v4, Lgy0;->c:Lg5;

    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    check-cast v5, Ljavax/crypto/Cipher;

    .line 138
    .line 139
    const/4 v6, 0x1

    .line 140
    iget-object v2, v2, Lgy0;->a:Ljavax/crypto/spec/SecretKeySpec;

    .line 141
    .line 142
    invoke-virtual {v5, v6, v2, p0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 143
    .line 144
    .line 145
    if-eqz p2, :cond_2

    .line 146
    .line 147
    array-length p0, p2

    .line 148
    if-eqz p0, :cond_2

    .line 149
    .line 150
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    check-cast p0, Ljavax/crypto/Cipher;

    .line 155
    .line 156
    invoke-virtual {p0, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 157
    .line 158
    .line 159
    :cond_2
    if-eqz v0, :cond_3

    .line 160
    .line 161
    move v9, v1

    .line 162
    goto :goto_3

    .line 163
    :cond_3
    move v9, v3

    .line 164
    :goto_3
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    move-object v4, p0

    .line 169
    check-cast v4, Ljavax/crypto/Cipher;

    .line 170
    .line 171
    const/4 v6, 0x0

    .line 172
    array-length v7, p1

    .line 173
    move-object v5, p1

    .line 174
    invoke-virtual/range {v4 .. v9}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    array-length p1, v5

    .line 179
    add-int/lit8 p1, p1, 0x10

    .line 180
    .line 181
    if-ne p0, p1, :cond_4

    .line 182
    .line 183
    move-object v4, v8

    .line 184
    goto :goto_4

    .line 185
    :cond_4
    array-length p1, v5

    .line 186
    sub-int/2addr p0, p1

    .line 187
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 188
    .line 189
    const-string p2, "encryption failed; GCM tag must be 16 bytes, but got only "

    .line 190
    .line 191
    const-string v0, " bytes"

    .line 192
    .line 193
    invoke-static {p0, p2, v0}, Len;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p1

    .line 201
    :cond_5
    const-string p0, "plaintext too long"

    .line 202
    .line 203
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_6
    const-string p0, "iv is wrong size"

    .line 208
    .line 209
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    :goto_4
    return-object v4

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b([B[B)[B
    .locals 7

    .line 1
    iget v0, p0, Ly5;->a:I

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    const/16 v2, 0x1c

    .line 6
    .line 7
    iget-object v3, p0, Ly5;->b:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v4, "ciphertext too short"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    array-length p0, p1

    .line 16
    const/16 v0, 0x28

    .line 17
    .line 18
    if-lt p0, v0, :cond_0

    .line 19
    .line 20
    const/16 p0, 0x18

    .line 21
    .line 22
    invoke-static {p1, p0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    array-length v1, p1

    .line 27
    sub-int/2addr v1, p0

    .line 28
    invoke-static {p1, p0, v1}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast v3, Liy0;

    .line 33
    .line 34
    invoke-virtual {v3, p0, v0, p2}, Lta;->f(Ljava/nio/ByteBuffer;[B[B)[B

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {v4}, Lds0;->t(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-object v5

    .line 43
    :pswitch_0
    array-length p0, p1

    .line 44
    if-lt p0, v2, :cond_1

    .line 45
    .line 46
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    array-length v0, p1

    .line 51
    sub-int/2addr v0, v1

    .line 52
    invoke-static {p1, v1, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast v3, Liy0;

    .line 57
    .line 58
    invoke-virtual {v3, p1, p0, p2}, Lta;->f(Ljava/nio/ByteBuffer;[B[B)[B

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-static {v4}, Lds0;->t(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :goto_1
    return-object v5

    .line 67
    :pswitch_1
    array-length v0, p1

    .line 68
    if-lt v0, v2, :cond_2

    .line 69
    .line 70
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ly5;->c([B[B)[B

    .line 71
    .line 72
    .line 73
    move-result-object v5
    :try_end_0
    .catch Ljavax/crypto/AEADBadTagException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    goto :goto_3

    .line 75
    :catch_0
    move-exception v0

    .line 76
    goto :goto_2

    .line 77
    :catch_1
    move-exception v0

    .line 78
    :goto_2
    const-string v1, "y5"

    .line 79
    .line 80
    const-string v2, "encountered a potentially transient KeyStore error, will wait and retry"

    .line 81
    .line 82
    invoke-static {v1, v2, v0}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 90
    .line 91
    mul-double/2addr v0, v2

    .line 92
    double-to-int v0, v0

    .line 93
    int-to-long v0, v0

    .line 94
    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2

    .line 95
    .line 96
    .line 97
    :catch_2
    invoke-virtual {p0, p1, p2}, Ly5;->c([B[B)[B

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    goto :goto_3

    .line 102
    :catch_3
    move-exception p0

    .line 103
    throw p0

    .line 104
    :cond_2
    invoke-static {v4}, Lds0;->t(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :goto_3
    return-object v5

    .line 108
    :pswitch_2
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    check-cast v3, Lgy0;

    .line 113
    .line 114
    iget-boolean v0, v3, Lgy0;->b:Z

    .line 115
    .line 116
    array-length v6, p0

    .line 117
    if-ne v6, v1, :cond_a

    .line 118
    .line 119
    if-eqz v0, :cond_3

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_3
    const/16 v2, 0x10

    .line 123
    .line 124
    :goto_4
    array-length v6, p1

    .line 125
    if-lt v6, v2, :cond_9

    .line 126
    .line 127
    const/4 v2, 0x0

    .line 128
    if-eqz v0, :cond_5

    .line 129
    .line 130
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-static {p1, v2, v1}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-virtual {v4, v6}, Ljava/nio/ByteBuffer;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_4

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_4
    const-string p0, "iv does not match prepended iv"

    .line 146
    .line 147
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_5
    :goto_5
    invoke-static {p0}, Lgy0;->a([B)Ljava/security/spec/AlgorithmParameterSpec;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    sget-object v4, Lgy0;->c:Lg5;

    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    check-cast v5, Ljavax/crypto/Cipher;

    .line 162
    .line 163
    const/4 v6, 0x2

    .line 164
    iget-object v3, v3, Lgy0;->a:Ljavax/crypto/spec/SecretKeySpec;

    .line 165
    .line 166
    invoke-virtual {v5, v6, v3, p0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 167
    .line 168
    .line 169
    if-eqz p2, :cond_6

    .line 170
    .line 171
    array-length p0, p2

    .line 172
    if-eqz p0, :cond_6

    .line 173
    .line 174
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    check-cast p0, Ljavax/crypto/Cipher;

    .line 179
    .line 180
    invoke-virtual {p0, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 181
    .line 182
    .line 183
    :cond_6
    if-eqz v0, :cond_7

    .line 184
    .line 185
    move v2, v1

    .line 186
    :cond_7
    array-length p0, p1

    .line 187
    if-eqz v0, :cond_8

    .line 188
    .line 189
    sub-int/2addr p0, v1

    .line 190
    :cond_8
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    check-cast p2, Ljavax/crypto/Cipher;

    .line 195
    .line 196
    invoke-virtual {p2, p1, v2, p0}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    goto :goto_6

    .line 201
    :cond_9
    invoke-static {v4}, Lds0;->t(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_a
    const-string p0, "iv is wrong size"

    .line 206
    .line 207
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    :goto_6
    return-object v5

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c([B[B)[B
    .locals 4

    .line 1
    new-instance v0, Ljavax/crypto/spec/GCMParameterSpec;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0xc

    .line 7
    .line 8
    invoke-direct {v0, v1, p1, v2, v3}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[BII)V

    .line 9
    .line 10
    .line 11
    const-string v1, "AES/GCM/NoPadding"

    .line 12
    .line 13
    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object p0, p0, Ly5;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Ljavax/crypto/SecretKey;

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-virtual {v1, v2, p0, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 26
    .line 27
    .line 28
    array-length p0, p1

    .line 29
    sub-int/2addr p0, v3

    .line 30
    invoke-virtual {v1, p1, v3, p0}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public d([B[B)[B
    .locals 7

    .line 1
    array-length v0, p1

    .line 2
    const v1, 0x7fffffe3

    .line 3
    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    add-int/lit8 v0, v0, 0x1c

    .line 9
    .line 10
    new-array v5, v0, [B

    .line 11
    .line 12
    const-string v0, "AES/GCM/NoPadding"

    .line 13
    .line 14
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object p0, p0, Ly5;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ljavax/crypto/SecretKey;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-virtual {v1, v0, p0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 27
    .line 28
    .line 29
    array-length v4, p1

    .line 30
    const/16 v6, 0xc

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    move-object v2, p1

    .line 34
    invoke-virtual/range {v1 .. v6}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljavax/crypto/Cipher;->getIV()[B

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const/16 p1, 0xc

    .line 42
    .line 43
    const/4 p2, 0x0

    .line 44
    invoke-static {p0, p2, v5, p2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 45
    .line 46
    .line 47
    return-object v5

    .line 48
    :cond_0
    const-string p0, "plaintext too long"

    .line 49
    .line 50
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return-object p0
.end method
