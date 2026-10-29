.class public final Lac1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lyw1;
.implements Lsg0;
.implements Lxo0;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements Ljd3;
.implements Lul3;


# static fields
.field public static e:Lac1;

.field public static f:Lac1;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lac1;->a:I

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lac1;->b:Ljava/lang/Object;

    .line 125
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lac1;->c:Ljava/lang/Object;

    .line 126
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lac1;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 122
    iput p1, p0, Lac1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 99
    iput p1, p0, Lac1;->a:I

    iput-object p2, p0, Lac1;->b:Ljava/lang/Object;

    iput-object p3, p0, Lac1;->c:Ljava/lang/Object;

    iput-object p4, p0, Lac1;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La13;Lg13;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lac1;->a:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    iput-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 112
    iput-object p2, p0, Lac1;->c:Ljava/lang/Object;

    .line 113
    iput-object p3, p0, Lac1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lac1;->a:I

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 162
    iput-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 163
    iput-object p2, p0, Lac1;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Lac1;->a:I

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 165
    new-instance v0, Lfs2;

    .line 166
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 167
    iput-object v0, p0, Lac1;->d:Ljava/lang/Object;

    .line 168
    iput-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 169
    iput-object p2, p0, Lac1;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lij3;)V
    .locals 9

    const/16 v0, 0x1b

    iput v0, p0, Lac1;->a:I

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, -0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lac1;->d:Ljava/lang/Object;

    .line 101
    new-instance v7, Lzm2;

    const-string v0, "measurement:api"

    invoke-direct {v7, v0}, Lzm2;-><init>(Ljava/lang/String;)V

    .line 102
    new-instance v3, Lfc3;

    .line 103
    sget-object v8, Lnr0;->c:Lnr0;

    const/4 v5, 0x0

    .line 104
    sget-object v6, Lfc3;->a:Lh9;

    move-object v4, p1

    invoke-direct/range {v3 .. v8}, Lor0;-><init>(Landroid/content/Context;Landroid/app/Activity;Lh9;Lb9;Lnr0;)V

    .line 105
    iput-object v3, p0, Lac1;->c:Ljava/lang/Object;

    iput-object p2, p0, Lac1;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/hardware/camera2/params/StreamConfigurationMap;Lwc0;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Lac1;->a:I

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lac1;->d:Ljava/lang/Object;

    .line 141
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 142
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 143
    new-instance v0, Lts0;

    invoke-direct {v0, p1}, Lts0;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lac1;->b:Ljava/lang/Object;

    .line 144
    iput-object p2, p0, Lac1;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf42;)V
    .locals 2

    const/16 v0, 0x18

    iput v0, p0, Lac1;->a:I

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lac1;->d:Ljava/lang/Object;

    .line 137
    new-instance v0, Ljava/util/ArrayDeque;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object v0, p0, Lac1;->b:Ljava/lang/Object;

    .line 138
    iput-object p1, p0, Lac1;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfs0;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lac1;->a:I

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 197
    iput-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 198
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lac1;->c:Ljava/lang/Object;

    .line 199
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lac1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li03;Lts0;Lvq0;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lac1;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    iput-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 116
    iput-object p2, p0, Lac1;->c:Ljava/lang/Object;

    .line 117
    iput-object p3, p0, Lac1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x3

    iput v0, p0, Lac1;->a:I

    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 191
    new-instance v0, Lwc0;

    const/16 v1, 0x14

    const/4 v2, 0x0

    .line 192
    invoke-direct {v0, v1, v2}, Lwc0;-><init>(IZ)V

    .line 193
    iput-object v0, p0, Lac1;->c:Ljava/lang/Object;

    .line 194
    iput-object v0, p0, Lac1;->d:Ljava/lang/Object;

    .line 195
    iput-object p1, p0, Lac1;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lec;Lhu1;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, Lac1;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    iput-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 120
    iput-object p2, p0, Lac1;->c:Ljava/lang/Object;

    .line 121
    iput-object p3, p0, Lac1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lac1;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 187
    iput-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 188
    iput-object p2, p0, Lac1;->c:Ljava/lang/Object;

    .line 189
    iput-object p3, p0, Lac1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/EnumSet;)V
    .locals 3

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    iput v0, p0, Lac1;->a:I

    .line 4
    .line 5
    const-string v0, "Unexpected default trust managers:"

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 14
    .line 15
    :try_start_0
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {p1, v1}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    array-length v1, p1

    .line 32
    const/4 v2, 0x1

    .line 33
    if-ne v1, v2, :cond_0

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    aget-object v1, p1, v1

    .line 37
    .line 38
    instance-of v2, v1, Ljavax/net/ssl/X509TrustManager;

    .line 39
    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    check-cast v1, Ljavax/net/ssl/X509TrustManager;

    .line 43
    .line 44
    iput-object v1, p0, Lac1;->c:Ljava/lang/Object;

    .line 45
    .line 46
    new-instance p1, Lam2;

    .line 47
    .line 48
    invoke-virtual {p0}, Lac1;->A()[Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {p1, v0}, Lam2;-><init>([Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lac1;->d:Ljava/lang/Object;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1
    :try_end_0
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    :catch_0
    move-exception p0

    .line 85
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catch_1
    move-exception p0

    .line 90
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catch_2
    move-exception p0

    .line 95
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 96
    .line 97
    .line 98
    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Ljava/util/List;Lec;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lac1;->a:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    iput-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 108
    iput-object p2, p0, Lac1;->c:Ljava/lang/Object;

    .line 109
    iput-object p3, p0, Lac1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lqi1;Lij;Ljava/util/List;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Lac1;->a:I

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    iput-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 129
    iput-object p2, p0, Lac1;->c:Ljava/lang/Object;

    .line 130
    iput-object p3, p0, Lac1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt33;Ls33;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, Lac1;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    sget-object v0, Ll20;->b:Ll20;

    .line 146
    invoke-direct {p0, p1, p2, v0}, Lac1;-><init>(Lt33;Ls33;Lm20;)V

    return-void
.end method

.method public constructor <init>(Lt33;Ls33;Lm20;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, Lac1;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    iput-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 133
    iput-object p2, p0, Lac1;->c:Ljava/lang/Object;

    .line 134
    iput-object p3, p0, Lac1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxp;Landroid/util/Size;)V
    .locals 2

    const/16 v0, 0xe

    iput v0, p0, Lac1;->a:I

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 171
    iput-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 172
    invoke-interface {p1}, Lxp;->a()I

    .line 173
    invoke-interface {p1}, Lxp;->d()I

    if-eqz p2, :cond_0

    .line 174
    new-instance v0, Landroid/util/Rational;

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    invoke-direct {v0, v1, p2}, Landroid/util/Rational;-><init>(II)V

    goto :goto_0

    :cond_0
    const/16 p2, 0x100

    .line 175
    invoke-interface {p1, p2}, Lxp;->g(I)Ljava/util/List;

    move-result-object p2

    .line 176
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p2, 0x0

    move-object v0, p2

    goto :goto_0

    .line 177
    :cond_1
    new-instance v0, Lhx;

    const/4 v1, 0x0

    .line 178
    invoke-direct {v0, v1}, Lhx;-><init>(Z)V

    .line 179
    invoke-static {p2, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/util/Size;

    .line 180
    new-instance v0, Landroid/util/Rational;

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    invoke-direct {v0, v1, p2}, Landroid/util/Rational;-><init>(II)V

    .line 181
    :goto_0
    iput-object v0, p0, Lac1;->c:Ljava/lang/Object;

    .line 182
    new-instance p2, Laj2;

    invoke-direct {p2, p1, v0}, Laj2;-><init>(Lxp;Landroid/util/Rational;)V

    iput-object p2, p0, Lac1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lzp;Lx60;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Lac1;->a:I

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 184
    iput-object p1, p0, Lac1;->c:Ljava/lang/Object;

    .line 185
    iput-object p2, p0, Lac1;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 3

    const/16 v0, 0x8

    iput v0, p0, Lac1;->a:I

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    array-length v0, p1

    invoke-static {v0}, Lr13;->a(I)V

    .line 149
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object v0, p0, Lac1;->b:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 150
    invoke-static {p1}, Lpm2;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 151
    sget-object v1, Lhe0;->b:Lhe0;

    const-string v2, "AES/ECB/NoPadding"

    .line 152
    iget-object v1, v1, Lhe0;->a:Lge0;

    .line 153
    invoke-interface {v1, v2}, Lge0;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 154
    check-cast v1, Ljavax/crypto/Cipher;

    .line 155
    invoke-virtual {v1, p1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    const/16 p1, 0x10

    .line 156
    new-array p1, p1, [B

    .line 157
    invoke-virtual {v1, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    .line 158
    invoke-static {p1}, Lqj3;->o([B)[B

    move-result-object p1

    iput-object p1, p0, Lac1;->c:Ljava/lang/Object;

    .line 159
    invoke-static {p1}, Lqj3;->o([B)[B

    move-result-object p1

    iput-object p1, p0, Lac1;->d:Ljava/lang/Object;

    return-void

    .line 160
    :cond_0
    const-string p0, "Can not use AES-CMAC in FIPS-mode."

    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static B(Ljava/util/ArrayList;)Ljava/util/HashMap;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lac1;->t(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Landroid/util/Rational;

    .line 25
    .line 26
    new-instance v3, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Landroid/util/Size;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_1

    .line 64
    .line 65
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Landroid/util/Rational;

    .line 70
    .line 71
    invoke-static {v3, v1}, Lsd;->a(Landroid/util/Rational;Landroid/util/Size;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_2

    .line 76
    .line 77
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    return-object v0
.end method

.method public static E(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;)Lcv1;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->q:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-static {v0, v2}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    new-instance v3, Lbv1;

    .line 31
    .line 32
    invoke-direct {v3, v2}, Lbv1;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v0, Lwa3;

    .line 40
    .line 41
    const/16 v2, 0x9

    .line 42
    .line 43
    invoke-direct {v0, v2}, Lwa3;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->E(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v1, Lbv1;

    .line 51
    .line 52
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->d:Ljava/lang/String;

    .line 53
    .line 54
    invoke-direct {v1, p0}, Lbv1;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance p0, Lcv1;

    .line 58
    .line 59
    invoke-direct {p0, v0, v1}, Lcv1;-><init>(Ljava/util/List;Lbv1;)V

    .line 60
    .line 61
    .line 62
    return-object p0
.end method

.method public static F(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;)Lec;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Lec;

    .line 6
    .line 7
    new-instance v3, Leq2;

    .line 8
    .line 9
    iget-object v4, v1, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->a:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;

    .line 10
    .line 11
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->f:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, v0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 14
    .line 15
    iget-object v7, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->g:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v8, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->h:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v9, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->h0:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v10, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->j0:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v11, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->a:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v6, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v4, v4, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->c:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v5, v3, Leq2;->a:Ljava/lang/Object;

    .line 57
    .line 58
    iput-object v7, v3, Leq2;->b:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object v8, v3, Leq2;->c:Ljava/lang/Object;

    .line 61
    .line 62
    iput-object v10, v3, Leq2;->d:Ljava/lang/Object;

    .line 63
    .line 64
    iput-object v11, v3, Leq2;->e:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object v6, v3, Leq2;->f:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object v4, v3, Leq2;->i:Ljava/lang/Object;

    .line 69
    .line 70
    new-instance v12, Lnv1;

    .line 71
    .line 72
    iget-object v4, v0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 73
    .line 74
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->i:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v6, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->j:Ljava/lang/String;

    .line 77
    .line 78
    new-instance v13, Lru1;

    .line 79
    .line 80
    const/4 v7, 0x0

    .line 81
    invoke-direct {v13, v7, v6, v5}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v14, Lac1;

    .line 85
    .line 86
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->k:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v6, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->l:Ljava/lang/String;

    .line 89
    .line 90
    iget-object v8, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->m:Ljava/lang/String;

    .line 91
    .line 92
    invoke-direct {v14, v5, v6, v8}, Lac1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->n:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v6, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->o:Ljava/lang/String;

    .line 98
    .line 99
    new-instance v15, Lru1;

    .line 100
    .line 101
    invoke-direct {v15, v7, v6, v5}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->p:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v6, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->q:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v8, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->r:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v9, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->s:Ljava/lang/String;

    .line 111
    .line 112
    new-instance v10, Lru1;

    .line 113
    .line 114
    invoke-direct {v10, v7, v9, v8}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object v8, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->t:Ljava/lang/String;

    .line 118
    .line 119
    iget-object v9, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->u:Ljava/lang/String;

    .line 120
    .line 121
    new-instance v11, Lru1;

    .line 122
    .line 123
    invoke-direct {v11, v7, v9, v8}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    iget-object v8, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->v:Ljava/lang/String;

    .line 127
    .line 128
    iget-object v9, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->w:Ljava/lang/String;

    .line 129
    .line 130
    iget-object v7, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->x:Ljava/lang/String;

    .line 131
    .line 132
    move-object/from16 v17, v5

    .line 133
    .line 134
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->y:Ljava/lang/String;

    .line 135
    .line 136
    move-object/from16 v18, v6

    .line 137
    .line 138
    new-instance v6, Lru1;

    .line 139
    .line 140
    move-object/from16 v20, v8

    .line 141
    .line 142
    const/4 v8, 0x0

    .line 143
    invoke-direct {v6, v8, v5, v7}, Lru1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    new-instance v5, Ltf;

    .line 147
    .line 148
    iget-object v7, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->z:Ljava/lang/String;

    .line 149
    .line 150
    iget-object v8, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->l0:Ljava/lang/String;

    .line 151
    .line 152
    move-object/from16 v22, v6

    .line 153
    .line 154
    iget-object v6, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->A:Ljava/lang/String;

    .line 155
    .line 156
    iget-object v4, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->B:Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 171
    .line 172
    .line 173
    iput-object v7, v5, Ltf;->a:Ljava/lang/String;

    .line 174
    .line 175
    iput-object v8, v5, Ltf;->b:Ljava/lang/String;

    .line 176
    .line 177
    iput-object v6, v5, Ltf;->c:Ljava/lang/String;

    .line 178
    .line 179
    iput-object v4, v5, Ltf;->d:Ljava/lang/String;

    .line 180
    .line 181
    move-object/from16 v23, v5

    .line 182
    .line 183
    move-object/from16 v21, v9

    .line 184
    .line 185
    move-object/from16 v19, v11

    .line 186
    .line 187
    move-object/from16 v16, v17

    .line 188
    .line 189
    move-object/from16 v17, v18

    .line 190
    .line 191
    move-object/from16 v18, v10

    .line 192
    .line 193
    invoke-direct/range {v12 .. v23}, Lnv1;-><init>(Lru1;Lac1;Lru1;Ljava/lang/String;Ljava/lang/String;Lru1;Lru1;Ljava/lang/String;Ljava/lang/String;Lru1;Ltf;)V

    .line 194
    .line 195
    .line 196
    new-instance v13, Lau1;

    .line 197
    .line 198
    iget-object v1, v1, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->b:Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;

    .line 199
    .line 200
    const/4 v4, 0x0

    .line 201
    if-eqz v1, :cond_0

    .line 202
    .line 203
    iget-object v5, v1, Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;->d:Ljava/lang/String;

    .line 204
    .line 205
    move-object v14, v5

    .line 206
    goto :goto_0

    .line 207
    :cond_0
    move-object v14, v4

    .line 208
    :goto_0
    if-eqz v1, :cond_1

    .line 209
    .line 210
    iget-object v5, v1, Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;->e:Ljava/lang/String;

    .line 211
    .line 212
    move-object v15, v5

    .line 213
    goto :goto_1

    .line 214
    :cond_1
    move-object v15, v4

    .line 215
    :goto_1
    if-eqz v1, :cond_2

    .line 216
    .line 217
    iget-object v5, v1, Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;->g:Ljava/lang/String;

    .line 218
    .line 219
    move-object/from16 v16, v5

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_2
    move-object/from16 v16, v4

    .line 223
    .line 224
    :goto_2
    if-eqz v1, :cond_3

    .line 225
    .line 226
    iget-object v5, v1, Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;->i:Ljava/lang/String;

    .line 227
    .line 228
    move-object/from16 v17, v5

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_3
    move-object/from16 v17, v4

    .line 232
    .line 233
    :goto_3
    if-eqz v1, :cond_4

    .line 234
    .line 235
    iget-object v5, v1, Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;->l:Ljava/lang/String;

    .line 236
    .line 237
    move-object/from16 v18, v5

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_4
    move-object/from16 v18, v4

    .line 241
    .line 242
    :goto_4
    if-eqz v1, :cond_5

    .line 243
    .line 244
    iget-object v5, v1, Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;->p:Ljava/lang/String;

    .line 245
    .line 246
    move-object/from16 v19, v5

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_5
    move-object/from16 v19, v4

    .line 250
    .line 251
    :goto_5
    if-eqz v1, :cond_6

    .line 252
    .line 253
    iget-object v1, v1, Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;->w:Ljava/lang/String;

    .line 254
    .line 255
    move-object/from16 v20, v1

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_6
    move-object/from16 v20, v4

    .line 259
    .line 260
    :goto_6
    iget-object v0, v0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    .line 261
    .line 262
    if-eqz v0, :cond_7

    .line 263
    .line 264
    iget-object v4, v0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;->g:Ljava/lang/String;

    .line 265
    .line 266
    :cond_7
    move-object/from16 v21, v4

    .line 267
    .line 268
    invoke-direct/range {v13 .. v21}, Lau1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    const/16 v0, 0x12

    .line 272
    .line 273
    invoke-direct {v2, v0, v3, v12, v13}, Lec;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    return-object v2
.end method

.method public static G(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lac1;
    .locals 1

    .line 1
    new-instance v0, Lac1;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p0, p1}, Lac1;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static H(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lac1;
    .locals 2

    .line 1
    new-instance v0, Lac1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {v0, p0, p1}, Lac1;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static K(J)Ljava/lang/Double;
    .locals 2

    .line 1
    sget-object v0, Lfb0;->b:Leb0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    invoke-static {p0, p1, v0, v1}, Lfb0;->c(JJ)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Lib0;->d:Lib0;

    .line 15
    .line 16
    invoke-static {p0, p1, v0}, Lfb0;->i(JLib0;)D

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    mul-double/2addr p0, v0

    .line 26
    double-to-int p0, p0

    .line 27
    int-to-double p0, p0

    .line 28
    div-double/2addr p0, v0

    .line 29
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public static M(Ljava/util/List;Landroid/util/Size;Z)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    add-int/lit8 v1, v1, -0x1

    .line 11
    .line 12
    :goto_0
    if-ltz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Landroid/util/Size;

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-lt v3, v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-ge v3, v4, :cond_1

    .line 39
    .line 40
    :cond_0
    const/4 v3, 0x0

    .line 41
    invoke-virtual {v0, v3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v1, v1, -0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-interface {p0, v0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    if-eqz p2, :cond_2

    .line 54
    .line 55
    invoke-interface {p0, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 56
    .line 57
    .line 58
    :cond_2
    return-void
.end method

.method public static N(Ljava/util/List;Landroid/util/Size;Z)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-ge v2, v3, :cond_1

    .line 13
    .line 14
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Landroid/util/Size;

    .line 19
    .line 20
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-gt v4, v5, :cond_0

    .line 29
    .line 30
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-le v4, v5, :cond_1

    .line 39
    .line 40
    :cond_0
    invoke-virtual {v0, v1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-interface {p0, v0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 47
    .line 48
    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    invoke-interface {p0, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method

.method public static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    :cond_0
    return-object p0
.end method

.method public static t(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lsd;->a:Landroid/util/Rational;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    sget-object v1, Lsd;->c:Landroid/util/Rational;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/util/Size;

    .line 31
    .line 32
    new-instance v2, Landroid/util/Rational;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-direct {v2, v3, v4}, Landroid/util/Rational;-><init>(II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Landroid/util/Rational;

    .line 66
    .line 67
    invoke-static {v4, v1}, Lsd;->a(Landroid/util/Rational;Landroid/util/Size;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    return-object v0
.end method

.method public static w(IZ)Landroid/util/Rational;
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eq p0, v0, :cond_4

    .line 4
    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    new-instance p1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v0, "Undefined target aspect ratio: "

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string p1, "SupportedOutputSizesCollector"

    .line 25
    .line 26
    invoke-static {p1, p0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_0
    if-eqz p1, :cond_1

    .line 31
    .line 32
    sget-object p0, Lsd;->c:Landroid/util/Rational;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    sget-object p0, Lsd;->d:Landroid/util/Rational;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_2
    if-eqz p1, :cond_3

    .line 39
    .line 40
    sget-object p0, Lsd;->a:Landroid/util/Rational;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_3
    sget-object p0, Lsd;->b:Landroid/util/Rational;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_4
    return-object v1
.end method

.method public static x(Ljava/util/LinkedHashMap;Ljava/lang/String;Lvv1;)Lyv1;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/util/Map;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lyv1;

    .line 10
    .line 11
    iget-boolean v1, p2, Lvv1;->d:Z

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lyv1;-><init>(Z)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p2, Lvv1;->a:Ljava/lang/String;

    .line 17
    .line 18
    new-instance v1, Lkotlin/Pair;

    .line 19
    .line 20
    invoke-direct {v1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-static {p2}, Loc1;->f([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    iget-object p0, p2, Lvv1;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lyv1;

    .line 42
    .line 43
    if-nez p0, :cond_1

    .line 44
    .line 45
    new-instance p0, Lyv1;

    .line 46
    .line 47
    iget-boolean p1, p2, Lvv1;->d:Z

    .line 48
    .line 49
    invoke-direct {p0, p1}, Lyv1;-><init>(Z)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p2, Lvv1;->a:Ljava/lang/String;

    .line 53
    .line 54
    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    :cond_1
    return-object p0
.end method


# virtual methods
.method public A()[Ljava/lang/String;
    .locals 4

    .line 1
    iget-object p0, p0, Lac1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/EnumSet;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-array v0, v0, [Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    add-int/lit8 v2, v1, 0x1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lbm2;

    .line 29
    .line 30
    invoke-virtual {v3}, Lbm2;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    aput-object v3, v0, v1

    .line 35
    .line 36
    move v1, v2

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v0
.end method

.method public C(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Ljava/util/List;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;Ljava/lang/String;)Lk61;
    .locals 52

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v4, Lk61;

    .line 19
    .line 20
    iget-object v5, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->H:Ljava/util/List;

    .line 21
    .line 22
    iget-boolean v6, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->n:Z

    .line 23
    .line 24
    if-nez v5, :cond_0

    .line 25
    .line 26
    sget-object v7, Lnd0;->a:Lnd0;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v7, v5

    .line 30
    :goto_0
    iget-object v8, v0, Lac1;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v8, Lts0;

    .line 33
    .line 34
    iget-object v9, v3, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->a:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;

    .line 35
    .line 36
    const/16 v10, 0xa

    .line 37
    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    invoke-static {v5, v10}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 41
    .line 42
    .line 43
    move-result v11

    .line 44
    invoke-static {v11}, Lnc1;->c(I)I

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    const/16 v12, 0x10

    .line 49
    .line 50
    if-ge v11, v12, :cond_1

    .line 51
    .line 52
    move v11, v12

    .line 53
    :cond_1
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 54
    .line 55
    invoke-direct {v12, v11}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v11

    .line 66
    if-eqz v11, :cond_3

    .line 67
    .line 68
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    move-object v13, v11

    .line 73
    check-cast v13, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;

    .line 74
    .line 75
    iget-object v13, v13, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;->a:Ljava/lang/String;

    .line 76
    .line 77
    invoke-interface {v12, v13, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    sget-object v12, Lod0;->a:Lod0;

    .line 82
    .line 83
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    :cond_3
    iget-object v5, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->G:Ljava/util/List;

    .line 87
    .line 88
    new-instance v11, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-static {v5, v10}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v13

    .line 105
    const/4 v15, 0x1

    .line 106
    if-eqz v13, :cond_c

    .line 107
    .line 108
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v13

    .line 112
    check-cast v13, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;

    .line 113
    .line 114
    iget-object v14, v13, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->e:Ljava/lang/String;

    .line 115
    .line 116
    invoke-interface {v12, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    check-cast v14, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;

    .line 121
    .line 122
    invoke-static {v13, v2, v3}, Lts0;->A(Lgz;Ljava/util/List;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;)Lh61;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    move-object/from16 v16, v4

    .line 127
    .line 128
    if-eqz v14, :cond_4

    .line 129
    .line 130
    iget-boolean v4, v14, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;->d:Z

    .line 131
    .line 132
    if-ne v4, v15, :cond_4

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_4
    iget-object v4, v13, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->b:Ljava/lang/Boolean;

    .line 136
    .line 137
    if-eqz v4, :cond_5

    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 140
    .line 141
    .line 142
    move-result v15

    .line 143
    goto :goto_3

    .line 144
    :cond_5
    const/4 v15, 0x0

    .line 145
    :goto_3
    iget-object v4, v8, Lts0;->a:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v4, Lvq0;

    .line 148
    .line 149
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-static {v4}, Lvq0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v36

    .line 167
    new-instance v17, Lm61;

    .line 168
    .line 169
    iget-object v4, v10, Lh61;->a:Ljava/util/List;

    .line 170
    .line 171
    move-object/from16 v18, v4

    .line 172
    .line 173
    iget-object v4, v10, Lh61;->b:Lmu1;

    .line 174
    .line 175
    move-object/from16 v19, v4

    .line 176
    .line 177
    iget-object v4, v10, Lh61;->c:Ljava/util/List;

    .line 178
    .line 179
    move-object/from16 v20, v4

    .line 180
    .line 181
    iget-object v4, v10, Lh61;->d:Ljava/util/List;

    .line 182
    .line 183
    move-object/from16 v21, v4

    .line 184
    .line 185
    iget-object v4, v10, Lh61;->e:Ljava/lang/String;

    .line 186
    .line 187
    move-object/from16 v22, v4

    .line 188
    .line 189
    iget-object v4, v10, Lh61;->f:Ljava/lang/String;

    .line 190
    .line 191
    move-object/from16 v23, v4

    .line 192
    .line 193
    iget-object v4, v10, Lh61;->g:Ljava/util/List;

    .line 194
    .line 195
    move-object/from16 v24, v4

    .line 196
    .line 197
    iget-object v4, v10, Lh61;->h:Ljava/lang/String;

    .line 198
    .line 199
    move-object/from16 v25, v4

    .line 200
    .line 201
    iget-object v4, v10, Lh61;->j:Lhv1;

    .line 202
    .line 203
    move-object/from16 v26, v4

    .line 204
    .line 205
    iget-object v4, v10, Lh61;->k:Ljava/lang/String;

    .line 206
    .line 207
    move-object/from16 v27, v4

    .line 208
    .line 209
    iget-object v4, v10, Lh61;->l:Ljava/util/List;

    .line 210
    .line 211
    move-object/from16 v28, v4

    .line 212
    .line 213
    iget-object v4, v10, Lh61;->m:Law1;

    .line 214
    .line 215
    move-object/from16 v29, v4

    .line 216
    .line 217
    iget-object v4, v10, Lh61;->n:Ljava/lang/String;

    .line 218
    .line 219
    move-object/from16 v30, v4

    .line 220
    .line 221
    iget-object v4, v13, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->e:Ljava/lang/String;

    .line 222
    .line 223
    const-string v31, ""

    .line 224
    .line 225
    if-nez v4, :cond_6

    .line 226
    .line 227
    move-object/from16 v4, v31

    .line 228
    .line 229
    :cond_6
    move-object/from16 v32, v4

    .line 230
    .line 231
    if-eqz v14, :cond_8

    .line 232
    .line 233
    iget-object v4, v14, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;->b:Ljava/lang/String;

    .line 234
    .line 235
    if-nez v4, :cond_7

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_7
    move-object/from16 v31, v4

    .line 239
    .line 240
    :cond_8
    :goto_4
    new-instance v4, Li61;

    .line 241
    .line 242
    move-object/from16 v44, v5

    .line 243
    .line 244
    sget-object v5, Lnd0;->a:Lnd0;

    .line 245
    .line 246
    invoke-direct {v4, v5, v15}, Li61;-><init>(Ljava/util/List;Z)V

    .line 247
    .line 248
    .line 249
    if-eqz v14, :cond_9

    .line 250
    .line 251
    iget-boolean v5, v14, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;->d:Z

    .line 252
    .line 253
    move/from16 v34, v5

    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_9
    const/16 v34, 0x0

    .line 257
    .line 258
    :goto_5
    iget-object v5, v10, Lh61;->i:Ljava/lang/Boolean;

    .line 259
    .line 260
    if-eqz v5, :cond_a

    .line 261
    .line 262
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 263
    .line 264
    .line 265
    move-result v14

    .line 266
    move/from16 v35, v14

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_a
    const/16 v35, 0x0

    .line 270
    .line 271
    :goto_6
    iget-object v5, v13, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->h:Ljava/util/List;

    .line 272
    .line 273
    new-instance v14, Ljava/util/ArrayList;

    .line 274
    .line 275
    move-object/from16 v33, v4

    .line 276
    .line 277
    const/16 v15, 0xa

    .line 278
    .line 279
    invoke-static {v5, v15}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v5

    .line 294
    if-eqz v5, :cond_b

    .line 295
    .line 296
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    check-cast v5, Lcom/usercentrics/sdk/v2/settings/data/SubConsentTemplate;

    .line 301
    .line 302
    invoke-static {v5, v2, v3}, Lts0;->A(Lgz;Ljava/util/List;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;)Lh61;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_b
    iget-object v4, v10, Lh61;->o:Ljava/lang/Long;

    .line 311
    .line 312
    iget-object v5, v10, Lh61;->p:Ljava/lang/Boolean;

    .line 313
    .line 314
    iget-object v15, v10, Lh61;->q:Ljava/lang/String;

    .line 315
    .line 316
    iget-object v2, v10, Lh61;->r:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    .line 317
    .line 318
    iget-boolean v10, v10, Lh61;->t:Z

    .line 319
    .line 320
    iget-object v13, v13, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->b:Ljava/lang/Boolean;

    .line 321
    .line 322
    move-object/from16 v37, v32

    .line 323
    .line 324
    move-object/from16 v32, v31

    .line 325
    .line 326
    move-object/from16 v31, v37

    .line 327
    .line 328
    move-object/from16 v41, v2

    .line 329
    .line 330
    move-object/from16 v38, v4

    .line 331
    .line 332
    move-object/from16 v39, v5

    .line 333
    .line 334
    move/from16 v42, v10

    .line 335
    .line 336
    move-object/from16 v43, v13

    .line 337
    .line 338
    move-object/from16 v37, v14

    .line 339
    .line 340
    move-object/from16 v40, v15

    .line 341
    .line 342
    invoke-direct/range {v17 .. v43}, Lm61;-><init>(Ljava/util/List;Lmu1;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lhv1;Ljava/lang/String;Ljava/util/List;Law1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li61;ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;ZLjava/lang/Boolean;)V

    .line 343
    .line 344
    .line 345
    move-object/from16 v2, v17

    .line 346
    .line 347
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-object/from16 v2, p2

    .line 351
    .line 352
    move-object/from16 v4, v16

    .line 353
    .line 354
    move-object/from16 v5, v44

    .line 355
    .line 356
    const/16 v10, 0xa

    .line 357
    .line 358
    goto/16 :goto_2

    .line 359
    .line 360
    :cond_c
    move-object/from16 v16, v4

    .line 361
    .line 362
    sget-object v2, Lb7;->a0:Lb7;

    .line 363
    .line 364
    invoke-static {v11, v2}, Lhu0;->D0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    new-instance v4, Lgp0;

    .line 369
    .line 370
    iget-boolean v5, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->m:Z

    .line 371
    .line 372
    iget-object v8, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->o:Ljava/lang/Integer;

    .line 373
    .line 374
    invoke-direct {v4, v5, v8}, Lgp0;-><init>(ZLjava/lang/Integer;)V

    .line 375
    .line 376
    .line 377
    move-object v5, v4

    .line 378
    iget-object v4, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->s:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 379
    .line 380
    if-eqz p4, :cond_e

    .line 381
    .line 382
    invoke-static/range {p4 .. p4}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 383
    .line 384
    .line 385
    move-result v8

    .line 386
    if-eqz v8, :cond_d

    .line 387
    .line 388
    goto :goto_9

    .line 389
    :cond_d
    move-object/from16 v8, p4

    .line 390
    .line 391
    :goto_8
    move v10, v6

    .line 392
    goto :goto_a

    .line 393
    :cond_e
    :goto_9
    iget-object v8, v0, Lac1;->d:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v8, Lvq0;

    .line 396
    .line 397
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 401
    .line 402
    .line 403
    move-result-object v8

    .line 404
    invoke-virtual {v8}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    invoke-static {v8}, Lvq0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v8

    .line 415
    goto :goto_8

    .line 416
    :goto_a
    iget-object v6, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->j:Ljava/lang/String;

    .line 417
    .line 418
    move-object v11, v7

    .line 419
    iget-boolean v7, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->n:Z

    .line 420
    .line 421
    iget-object v12, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->r:Ljava/util/List;

    .line 422
    .line 423
    move-object v13, v5

    .line 424
    move-object v5, v8

    .line 425
    new-instance v8, Ljava/util/ArrayList;

    .line 426
    .line 427
    const/16 v14, 0xa

    .line 428
    .line 429
    invoke-static {v12, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 430
    .line 431
    .line 432
    move-result v14

    .line 433
    invoke-direct {v8, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 434
    .line 435
    .line 436
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 437
    .line 438
    .line 439
    move-result-object v12

    .line 440
    :goto_b
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 441
    .line 442
    .line 443
    move-result v14

    .line 444
    if-eqz v14, :cond_12

    .line 445
    .line 446
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v14

    .line 450
    check-cast v14, Ljava/lang/String;

    .line 451
    .line 452
    sget-object v15, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 453
    .line 454
    const-string v0, "MAJOR"

    .line 455
    .line 456
    invoke-virtual {v0, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    if-eqz v0, :cond_f

    .line 468
    .line 469
    sget-object v0, Lqc2;->a:[Lqc2;

    .line 470
    .line 471
    const/4 v0, 0x0

    .line 472
    goto :goto_c

    .line 473
    :cond_f
    const-string v0, "MINOR"

    .line 474
    .line 475
    invoke-virtual {v0, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v0

    .line 486
    if-eqz v0, :cond_10

    .line 487
    .line 488
    sget-object v0, Lqc2;->a:[Lqc2;

    .line 489
    .line 490
    const/4 v0, 0x1

    .line 491
    goto :goto_c

    .line 492
    :cond_10
    const-string v0, "PATCH"

    .line 493
    .line 494
    invoke-virtual {v0, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    if-eqz v0, :cond_11

    .line 506
    .line 507
    sget-object v0, Lqc2;->a:[Lqc2;

    .line 508
    .line 509
    const/4 v0, 0x2

    .line 510
    goto :goto_c

    .line 511
    :cond_11
    const/4 v0, -0x1

    .line 512
    :goto_c
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    const/4 v15, 0x1

    .line 520
    move-object/from16 v0, p0

    .line 521
    .line 522
    goto :goto_b

    .line 523
    :cond_12
    iget-object v0, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 524
    .line 525
    if-eqz v10, :cond_14

    .line 526
    .line 527
    if-eqz v0, :cond_14

    .line 528
    .line 529
    invoke-virtual/range {p0 .. p1}, Lac1;->D(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;)Lur3;

    .line 530
    .line 531
    .line 532
    move-result-object v14

    .line 533
    new-instance v15, Lac1;

    .line 534
    .line 535
    iget-object v12, v9, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->d:Ljava/lang/String;

    .line 536
    .line 537
    move-object/from16 v17, v2

    .line 538
    .line 539
    invoke-static {v1, v3}, Lac1;->F(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;)Lec;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    new-instance v18, Lhu1;

    .line 544
    .line 545
    move-object/from16 v51, v4

    .line 546
    .line 547
    iget-object v4, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 548
    .line 549
    move-object/from16 p4, v5

    .line 550
    .line 551
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->F:Ljava/lang/String;

    .line 552
    .line 553
    move-object/from16 v19, v5

    .line 554
    .line 555
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->G:Ljava/lang/String;

    .line 556
    .line 557
    move-object/from16 v20, v5

    .line 558
    .line 559
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->H:Ljava/lang/String;

    .line 560
    .line 561
    move-object/from16 v21, v5

    .line 562
    .line 563
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->I:Ljava/lang/String;

    .line 564
    .line 565
    move-object/from16 v22, v5

    .line 566
    .line 567
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->J:Ljava/lang/String;

    .line 568
    .line 569
    move-object/from16 v23, v5

    .line 570
    .line 571
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->K:Ljava/lang/String;

    .line 572
    .line 573
    move-object/from16 v24, v5

    .line 574
    .line 575
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->L:Ljava/lang/String;

    .line 576
    .line 577
    move-object/from16 v25, v5

    .line 578
    .line 579
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->M:Ljava/lang/String;

    .line 580
    .line 581
    move-object/from16 v26, v5

    .line 582
    .line 583
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->N:Ljava/lang/String;

    .line 584
    .line 585
    move-object/from16 v27, v5

    .line 586
    .line 587
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->Y:Ljava/lang/String;

    .line 588
    .line 589
    move-object/from16 v28, v5

    .line 590
    .line 591
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->O:Ljava/lang/String;

    .line 592
    .line 593
    move-object/from16 v29, v5

    .line 594
    .line 595
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->P:Ljava/lang/String;

    .line 596
    .line 597
    move-object/from16 v30, v5

    .line 598
    .line 599
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->Q:Ljava/lang/String;

    .line 600
    .line 601
    move-object/from16 v31, v5

    .line 602
    .line 603
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->R:Ljava/lang/String;

    .line 604
    .line 605
    move-object/from16 v32, v5

    .line 606
    .line 607
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->S:Ljava/lang/String;

    .line 608
    .line 609
    move-object/from16 v33, v5

    .line 610
    .line 611
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->T:Ljava/lang/String;

    .line 612
    .line 613
    move-object/from16 v34, v5

    .line 614
    .line 615
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->U:Ljava/lang/String;

    .line 616
    .line 617
    move-object/from16 v35, v5

    .line 618
    .line 619
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->V:Ljava/lang/String;

    .line 620
    .line 621
    move-object/from16 v36, v5

    .line 622
    .line 623
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->m0:Ljava/lang/String;

    .line 624
    .line 625
    move-object/from16 v37, v5

    .line 626
    .line 627
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->W:Ljava/lang/String;

    .line 628
    .line 629
    move-object/from16 v38, v5

    .line 630
    .line 631
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->X:Ljava/lang/String;

    .line 632
    .line 633
    move-object/from16 v39, v5

    .line 634
    .line 635
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->Z:Ljava/lang/String;

    .line 636
    .line 637
    move-object/from16 v40, v5

    .line 638
    .line 639
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->a0:Ljava/lang/String;

    .line 640
    .line 641
    move-object/from16 v41, v5

    .line 642
    .line 643
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->b0:Ljava/lang/String;

    .line 644
    .line 645
    move-object/from16 v42, v5

    .line 646
    .line 647
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->c0:Ljava/lang/String;

    .line 648
    .line 649
    move-object/from16 v43, v5

    .line 650
    .line 651
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->d0:Ljava/lang/String;

    .line 652
    .line 653
    move-object/from16 v44, v5

    .line 654
    .line 655
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->e0:Ljava/lang/String;

    .line 656
    .line 657
    move-object/from16 v45, v5

    .line 658
    .line 659
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->f0:Ljava/lang/String;

    .line 660
    .line 661
    iget-object v4, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->g0:Ljava/lang/String;

    .line 662
    .line 663
    move-object/from16 v47, v4

    .line 664
    .line 665
    iget-object v4, v9, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->b:Ljava/lang/String;

    .line 666
    .line 667
    iget-object v9, v9, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->a:Ljava/lang/String;

    .line 668
    .line 669
    move-object/from16 v48, v4

    .line 670
    .line 671
    iget-object v4, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->i:Ljava/lang/String;

    .line 672
    .line 673
    move-object/from16 v50, v4

    .line 674
    .line 675
    move-object/from16 v46, v5

    .line 676
    .line 677
    move-object/from16 v49, v9

    .line 678
    .line 679
    invoke-direct/range {v18 .. v50}, Lhu1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    move-object/from16 v4, v18

    .line 683
    .line 684
    invoke-direct {v15, v12, v2, v4}, Lac1;-><init>(Ljava/lang/String;Lec;Lhu1;)V

    .line 685
    .line 686
    .line 687
    invoke-static {v1}, Lac1;->E(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;)Lcv1;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    iget-boolean v4, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->g0:Z

    .line 692
    .line 693
    if-eqz v4, :cond_13

    .line 694
    .line 695
    iget-object v4, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->h0:Ljava/util/List;

    .line 696
    .line 697
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 698
    .line 699
    .line 700
    move-result v4

    .line 701
    if-nez v4, :cond_13

    .line 702
    .line 703
    const/4 v4, 0x1

    .line 704
    goto :goto_d

    .line 705
    :cond_13
    const/4 v4, 0x0

    .line 706
    :goto_d
    iget-object v0, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->h0:Ljava/util/List;

    .line 707
    .line 708
    new-instance v5, Lij;

    .line 709
    .line 710
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 714
    .line 715
    .line 716
    iput-object v14, v5, Lij;->c:Ljava/lang/Object;

    .line 717
    .line 718
    iput-object v2, v5, Lij;->d:Ljava/lang/Object;

    .line 719
    .line 720
    iput-object v15, v5, Lij;->e:Ljava/lang/Object;

    .line 721
    .line 722
    iput-boolean v4, v5, Lij;->a:Z

    .line 723
    .line 724
    iput-object v0, v5, Lij;->b:Ljava/util/List;

    .line 725
    .line 726
    move-object v9, v5

    .line 727
    goto :goto_e

    .line 728
    :cond_14
    move-object/from16 v17, v2

    .line 729
    .line 730
    move-object/from16 v51, v4

    .line 731
    .line 732
    move-object/from16 p4, v5

    .line 733
    .line 734
    const/4 v9, 0x0

    .line 735
    :goto_e
    if-eqz v10, :cond_15

    .line 736
    .line 737
    const/4 v10, 0x0

    .line 738
    :goto_f
    move-object v5, v11

    .line 739
    goto :goto_10

    .line 740
    :cond_15
    invoke-virtual/range {p0 .. p1}, Lac1;->D(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;)Lur3;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-static {v1, v3}, Lac1;->F(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;)Lec;

    .line 745
    .line 746
    .line 747
    move-result-object v2

    .line 748
    invoke-static {v1}, Lac1;->E(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;)Lcv1;

    .line 749
    .line 750
    .line 751
    move-result-object v3

    .line 752
    new-instance v4, Lec;

    .line 753
    .line 754
    const/16 v5, 0x13

    .line 755
    .line 756
    invoke-direct {v4, v5, v0, v3, v2}, Lec;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    move-object v10, v4

    .line 760
    goto :goto_f

    .line 761
    :goto_10
    iget-object v11, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->c:Ljava/lang/String;

    .line 762
    .line 763
    iget-object v0, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->C:Lyw2;

    .line 764
    .line 765
    if-eqz v0, :cond_16

    .line 766
    .line 767
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v12

    .line 771
    goto :goto_11

    .line 772
    :cond_16
    const/4 v12, 0x0

    .line 773
    :goto_11
    iget-object v0, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->E:Ljava/lang/Long;

    .line 774
    .line 775
    const/16 v14, 0x1000

    .line 776
    .line 777
    move-object v1, v5

    .line 778
    move-object v3, v13

    .line 779
    move-object/from16 v2, v17

    .line 780
    .line 781
    move-object/from16 v4, v51

    .line 782
    .line 783
    move-object/from16 v5, p4

    .line 784
    .line 785
    move-object v13, v0

    .line 786
    move-object/from16 v0, v16

    .line 787
    .line 788
    invoke-direct/range {v0 .. v14}, Lk61;-><init>(Ljava/util/List;Ljava/util/List;Lgp0;Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;Lij;Lec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;I)V

    .line 789
    .line 790
    .line 791
    return-object v0
.end method

.method public D(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;)Lur3;
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;->f:Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;

    .line 10
    .line 11
    move-object v4, v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v4, 0x0

    .line 14
    :goto_0
    if-eqz v4, :cond_1

    .line 15
    .line 16
    iget-object v0, v4, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->a:Ljava/lang/String;

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    :goto_1
    const-string v5, ""

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    move-object v0, v5

    .line 25
    :cond_2
    const-string v6, "primary"

    .line 26
    .line 27
    const-string v7, "#0045A5"

    .line 28
    .line 29
    invoke-virtual {v1, v6, v0, v7}, Lac1;->O(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-static {v6}, Lqj3;->u(Ljava/lang/String;)Lcom/usercentrics/sdk/ui/color/UsercentricsShadedColor;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    if-eqz v4, :cond_3

    .line 38
    .line 39
    iget-object v0, v4, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->j:Ljava/lang/String;

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    const/4 v0, 0x0

    .line 43
    :goto_2
    if-nez v0, :cond_4

    .line 44
    .line 45
    move-object v0, v5

    .line 46
    :cond_4
    const-string v9, "text"

    .line 47
    .line 48
    const-string v10, "#303030"

    .line 49
    .line 50
    invoke-virtual {v1, v9, v0, v10}, Lac1;->O(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Lqj3;->u(Ljava/lang/String;)Lcom/usercentrics/sdk/ui/color/UsercentricsShadedColor;

    .line 55
    .line 56
    .line 57
    move-result-object v12

    .line 58
    if-eqz v4, :cond_5

    .line 59
    .line 60
    iget-object v0, v4, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->l:Ljava/lang/String;

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_5
    const/4 v0, 0x0

    .line 64
    :goto_3
    if-nez v0, :cond_6

    .line 65
    .line 66
    move-object v0, v5

    .line 67
    :cond_6
    const-string v9, "overlay"

    .line 68
    .line 69
    const-string v11, "#333333"

    .line 70
    .line 71
    invoke-virtual {v1, v9, v0, v11}, Lac1;->O(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v23

    .line 75
    if-eqz v2, :cond_7

    .line 76
    .line 77
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;->c:Ljava/lang/Integer;

    .line 78
    .line 79
    if-eqz v0, :cond_7

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    :goto_4
    move v9, v0

    .line 86
    goto :goto_5

    .line 87
    :cond_7
    const/4 v0, 0x4

    .line 88
    goto :goto_4

    .line 89
    :goto_5
    :try_start_0
    sget-object v0, Lo42;->b:Lm42;

    .line 90
    .line 91
    if-eqz v2, :cond_8

    .line 92
    .line 93
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;->d:Ljava/lang/Float;

    .line 94
    .line 95
    if-eqz v0, :cond_8

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    float-to-double v13, v0

    .line 102
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 103
    .line 104
    .line 105
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    goto :goto_7

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    goto :goto_6

    .line 109
    :cond_8
    const/4 v0, 0x0

    .line 110
    goto :goto_7

    .line 111
    :goto_6
    sget-object v11, Lo42;->b:Lm42;

    .line 112
    .line 113
    new-instance v11, Ln42;

    .line 114
    .line 115
    invoke-direct {v11, v0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    move-object v0, v11

    .line 119
    :goto_7
    nop

    .line 120
    instance-of v11, v0, Ln42;

    .line 121
    .line 122
    if-eqz v11, :cond_9

    .line 123
    .line 124
    const/4 v0, 0x0

    .line 125
    :cond_9
    check-cast v0, Ljava/lang/Double;

    .line 126
    .line 127
    if-eqz v0, :cond_a

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 130
    .line 131
    .line 132
    move-result-wide v13

    .line 133
    :goto_8
    move-wide/from16 v24, v13

    .line 134
    .line 135
    goto :goto_9

    .line 136
    :cond_a
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    .line 137
    .line 138
    goto :goto_8

    .line 139
    :goto_9
    if-eqz v4, :cond_b

    .line 140
    .line 141
    iget-object v0, v4, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->k:Ljava/lang/String;

    .line 142
    .line 143
    goto :goto_a

    .line 144
    :cond_b
    const/4 v0, 0x0

    .line 145
    :goto_a
    if-nez v0, :cond_c

    .line 146
    .line 147
    move-object v0, v5

    .line 148
    :cond_c
    const-string v11, "layerBackground"

    .line 149
    .line 150
    const-string v13, "#FFFFFF"

    .line 151
    .line 152
    invoke-virtual {v1, v11, v0, v13}, Lac1;->O(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v19

    .line 156
    sget-object v0, Lzw;->Companion:Lyw;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-static/range {v19 .. v19}, Lyw;->b(Ljava/lang/String;)Lzw;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    iget v14, v11, Lzw;->a:I

    .line 166
    .line 167
    int-to-double v14, v14

    .line 168
    const-wide v16, 0x4029800000000000L    # 12.75

    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    add-double v14, v14, v16

    .line 174
    .line 175
    move-object/from16 v18, v4

    .line 176
    .line 177
    const-wide v3, 0x406fe00000000000L    # 255.0

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    invoke-static {v3, v4, v14, v15}, Ljava/lang/Math;->min(DD)D

    .line 183
    .line 184
    .line 185
    move-result-wide v14

    .line 186
    iget v3, v11, Lzw;->b:I

    .line 187
    .line 188
    int-to-double v3, v3

    .line 189
    add-double v3, v3, v16

    .line 190
    .line 191
    move-object/from16 v27, v5

    .line 192
    .line 193
    move-object/from16 v22, v6

    .line 194
    .line 195
    const-wide v5, 0x406fe00000000000L    # 255.0

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(DD)D

    .line 201
    .line 202
    .line 203
    move-result-wide v3

    .line 204
    iget v11, v11, Lzw;->c:I

    .line 205
    .line 206
    move-object/from16 v20, v10

    .line 207
    .line 208
    int-to-double v10, v11

    .line 209
    add-double v10, v10, v16

    .line 210
    .line 211
    invoke-static {v5, v6, v10, v11}, Ljava/lang/Math;->min(DD)D

    .line 212
    .line 213
    .line 214
    move-result-wide v5

    .line 215
    double-to-int v10, v14

    .line 216
    double-to-int v3, v3

    .line 217
    double-to-int v4, v5

    .line 218
    invoke-static {v0, v10}, Lyw;->a(Lyw;I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    invoke-static {v0, v4}, Lyw;->a(Lyw;I)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-static {v0, v3}, Lyw;->a(Lyw;I)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    const-string v3, "#"

    .line 231
    .line 232
    invoke-static {v3, v5, v4, v0}, Len;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    move-object/from16 v3, v18

    .line 237
    .line 238
    if-eqz v18, :cond_d

    .line 239
    .line 240
    iget-object v4, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->t:Ljava/lang/String;

    .line 241
    .line 242
    goto :goto_b

    .line 243
    :cond_d
    const/4 v4, 0x0

    .line 244
    :goto_b
    if-nez v4, :cond_e

    .line 245
    .line 246
    move-object/from16 v4, v27

    .line 247
    .line 248
    :cond_e
    const-string v5, "tabsBorderColor"

    .line 249
    .line 250
    const-string v6, "#DDDDDD"

    .line 251
    .line 252
    invoke-virtual {v1, v5, v4, v6}, Lac1;->O(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v26

    .line 256
    new-instance v1, Lur3;

    .line 257
    .line 258
    if-eqz v3, :cond_f

    .line 259
    .line 260
    iget-object v4, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->c:Ljava/lang/String;

    .line 261
    .line 262
    goto :goto_c

    .line 263
    :cond_f
    const/4 v4, 0x0

    .line 264
    :goto_c
    invoke-static {v4}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    if-nez v4, :cond_10

    .line 269
    .line 270
    move-object v4, v7

    .line 271
    :cond_10
    const-string v5, "#FAFAFA"

    .line 272
    .line 273
    if-eqz v3, :cond_12

    .line 274
    .line 275
    iget-object v6, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->b:Ljava/lang/String;

    .line 276
    .line 277
    if-eqz v6, :cond_12

    .line 278
    .line 279
    invoke-static {v6}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    if-nez v6, :cond_11

    .line 284
    .line 285
    goto :goto_e

    .line 286
    :cond_11
    :goto_d
    move-object v10, v13

    .line 287
    goto :goto_f

    .line 288
    :cond_12
    :goto_e
    move-object v6, v5

    .line 289
    goto :goto_d

    .line 290
    :goto_f
    new-instance v13, Lbx0;

    .line 291
    .line 292
    invoke-direct {v13, v9, v6, v4}, Lbx0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    if-eqz v3, :cond_13

    .line 296
    .line 297
    iget-object v4, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->e:Ljava/lang/String;

    .line 298
    .line 299
    goto :goto_10

    .line 300
    :cond_13
    const/4 v4, 0x0

    .line 301
    :goto_10
    invoke-static {v4}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    if-nez v4, :cond_14

    .line 306
    .line 307
    goto :goto_11

    .line 308
    :cond_14
    move-object v7, v4

    .line 309
    :goto_11
    if-eqz v3, :cond_15

    .line 310
    .line 311
    iget-object v4, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->d:Ljava/lang/String;

    .line 312
    .line 313
    goto :goto_12

    .line 314
    :cond_15
    const/4 v4, 0x0

    .line 315
    :goto_12
    invoke-static {v4}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    if-nez v4, :cond_16

    .line 320
    .line 321
    goto :goto_13

    .line 322
    :cond_16
    move-object v5, v4

    .line 323
    :goto_13
    new-instance v14, Lbx0;

    .line 324
    .line 325
    invoke-direct {v14, v9, v5, v7}, Lbx0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    if-eqz v3, :cond_17

    .line 329
    .line 330
    iget-object v4, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->g:Ljava/lang/String;

    .line 331
    .line 332
    goto :goto_14

    .line 333
    :cond_17
    const/4 v4, 0x0

    .line 334
    :goto_14
    invoke-static {v4}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    const-string v5, "#F5F5F5"

    .line 339
    .line 340
    if-nez v4, :cond_18

    .line 341
    .line 342
    move-object v4, v5

    .line 343
    :cond_18
    if-eqz v3, :cond_19

    .line 344
    .line 345
    iget-object v6, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->f:Ljava/lang/String;

    .line 346
    .line 347
    goto :goto_15

    .line 348
    :cond_19
    const/4 v6, 0x0

    .line 349
    :goto_15
    invoke-static {v6}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    if-nez v6, :cond_1a

    .line 354
    .line 355
    move-object/from16 v6, v20

    .line 356
    .line 357
    :cond_1a
    new-instance v15, Lbx0;

    .line 358
    .line 359
    invoke-direct {v15, v9, v6, v4}, Lbx0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    if-eqz v3, :cond_1b

    .line 363
    .line 364
    iget-object v4, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->g:Ljava/lang/String;

    .line 365
    .line 366
    goto :goto_16

    .line 367
    :cond_1b
    const/4 v4, 0x0

    .line 368
    :goto_16
    invoke-static {v4}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    if-nez v4, :cond_1c

    .line 373
    .line 374
    move-object v4, v5

    .line 375
    :cond_1c
    if-eqz v3, :cond_1d

    .line 376
    .line 377
    iget-object v6, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->f:Ljava/lang/String;

    .line 378
    .line 379
    goto :goto_17

    .line 380
    :cond_1d
    const/4 v6, 0x0

    .line 381
    :goto_17
    invoke-static {v6}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v6

    .line 385
    if-nez v6, :cond_1e

    .line 386
    .line 387
    move-object/from16 v6, v20

    .line 388
    .line 389
    :cond_1e
    new-instance v7, Lbx0;

    .line 390
    .line 391
    invoke-direct {v7, v9, v6, v4}, Lbx0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    if-eqz v3, :cond_1f

    .line 395
    .line 396
    iget-object v4, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->u:Ljava/lang/String;

    .line 397
    .line 398
    goto :goto_18

    .line 399
    :cond_1f
    const/4 v4, 0x0

    .line 400
    :goto_18
    invoke-static {v4}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    if-nez v4, :cond_20

    .line 405
    .line 406
    goto :goto_19

    .line 407
    :cond_20
    move-object v5, v4

    .line 408
    :goto_19
    if-eqz v3, :cond_21

    .line 409
    .line 410
    iget-object v4, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->v:Ljava/lang/String;

    .line 411
    .line 412
    if-eqz v4, :cond_21

    .line 413
    .line 414
    invoke-static {v4}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    if-nez v4, :cond_22

    .line 419
    .line 420
    :cond_21
    move-object/from16 v4, v20

    .line 421
    .line 422
    :cond_22
    new-instance v6, Lbx0;

    .line 423
    .line 424
    invoke-direct {v6, v9, v4, v5}, Lbx0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    if-eqz v3, :cond_23

    .line 428
    .line 429
    iget-object v4, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->o:Ljava/lang/String;

    .line 430
    .line 431
    goto :goto_1a

    .line 432
    :cond_23
    const/4 v4, 0x0

    .line 433
    :goto_1a
    invoke-static {v4}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v4

    .line 437
    if-nez v4, :cond_24

    .line 438
    .line 439
    iget-object v4, v8, Lcom/usercentrics/sdk/ui/color/UsercentricsShadedColor;->b:Ljava/lang/String;

    .line 440
    .line 441
    :cond_24
    if-eqz v3, :cond_25

    .line 442
    .line 443
    iget-object v5, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->m:Ljava/lang/String;

    .line 444
    .line 445
    goto :goto_1b

    .line 446
    :cond_25
    const/4 v5, 0x0

    .line 447
    :goto_1b
    invoke-static {v5}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v5

    .line 451
    if-nez v5, :cond_26

    .line 452
    .line 453
    iget-object v5, v12, Lcom/usercentrics/sdk/ui/color/UsercentricsShadedColor;->b:Ljava/lang/String;

    .line 454
    .line 455
    :cond_26
    if-eqz v3, :cond_27

    .line 456
    .line 457
    iget-object v8, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->q:Ljava/lang/String;

    .line 458
    .line 459
    goto :goto_1c

    .line 460
    :cond_27
    const/4 v8, 0x0

    .line 461
    :goto_1c
    invoke-static {v8}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v8

    .line 465
    if-nez v8, :cond_28

    .line 466
    .line 467
    iget-object v8, v12, Lcom/usercentrics/sdk/ui/color/UsercentricsShadedColor;->c:Ljava/lang/String;

    .line 468
    .line 469
    :cond_28
    if-eqz v3, :cond_29

    .line 470
    .line 471
    iget-object v9, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->p:Ljava/lang/String;

    .line 472
    .line 473
    goto :goto_1d

    .line 474
    :cond_29
    const/4 v9, 0x0

    .line 475
    :goto_1d
    invoke-static {v9}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v9

    .line 479
    if-nez v9, :cond_2a

    .line 480
    .line 481
    move-object v9, v10

    .line 482
    :cond_2a
    if-eqz v3, :cond_2b

    .line 483
    .line 484
    iget-object v11, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->r:Ljava/lang/String;

    .line 485
    .line 486
    goto :goto_1e

    .line 487
    :cond_2b
    const/4 v11, 0x0

    .line 488
    :goto_1e
    invoke-static {v11}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v11

    .line 492
    if-nez v11, :cond_2c

    .line 493
    .line 494
    move-object v11, v10

    .line 495
    :cond_2c
    move-object/from16 v16, v0

    .line 496
    .line 497
    if-eqz v3, :cond_2d

    .line 498
    .line 499
    iget-object v0, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->n:Ljava/lang/String;

    .line 500
    .line 501
    goto :goto_1f

    .line 502
    :cond_2d
    const/4 v0, 0x0

    .line 503
    :goto_1f
    invoke-static {v0}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    if-nez v0, :cond_2e

    .line 508
    .line 509
    move-object v0, v10

    .line 510
    :cond_2e
    new-instance v10, Lxy1;

    .line 511
    .line 512
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 522
    .line 523
    .line 524
    iput-object v4, v10, Lxy1;->a:Ljava/lang/Object;

    .line 525
    .line 526
    iput-object v5, v10, Lxy1;->c:Ljava/lang/Object;

    .line 527
    .line 528
    iput-object v8, v10, Lxy1;->d:Ljava/lang/Object;

    .line 529
    .line 530
    iput-object v9, v10, Lxy1;->e:Ljava/lang/Object;

    .line 531
    .line 532
    iput-object v0, v10, Lxy1;->f:Ljava/lang/Object;

    .line 533
    .line 534
    iput-object v11, v10, Lxy1;->b:Ljava/lang/Object;

    .line 535
    .line 536
    if-eqz v3, :cond_2f

    .line 537
    .line 538
    iget-object v0, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->i:Ljava/lang/String;

    .line 539
    .line 540
    goto :goto_20

    .line 541
    :cond_2f
    const/4 v0, 0x0

    .line 542
    :goto_20
    invoke-static {v0}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    if-nez v0, :cond_30

    .line 547
    .line 548
    move-object/from16 v21, v20

    .line 549
    .line 550
    goto :goto_21

    .line 551
    :cond_30
    move-object/from16 v21, v0

    .line 552
    .line 553
    :goto_21
    if-eqz v3, :cond_31

    .line 554
    .line 555
    iget-object v0, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->s:Ljava/lang/String;

    .line 556
    .line 557
    goto :goto_22

    .line 558
    :cond_31
    const/4 v0, 0x0

    .line 559
    :goto_22
    invoke-static {v0}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    if-nez v0, :cond_32

    .line 564
    .line 565
    goto :goto_23

    .line 566
    :cond_32
    move-object/from16 v22, v0

    .line 567
    .line 568
    :goto_23
    new-instance v11, Lju1;

    .line 569
    .line 570
    move-object/from16 v17, v7

    .line 571
    .line 572
    move-object/from16 v18, v10

    .line 573
    .line 574
    move-object/from16 v20, v16

    .line 575
    .line 576
    move-object/from16 v16, v6

    .line 577
    .line 578
    invoke-direct/range {v11 .. v26}, Lju1;-><init>(Lcom/usercentrics/sdk/ui/color/UsercentricsShadedColor;Lbx0;Lbx0;Lbx0;Lbx0;Lbx0;Lxy1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V

    .line 579
    .line 580
    .line 581
    new-instance v0, Llu1;

    .line 582
    .line 583
    if-eqz v2, :cond_33

    .line 584
    .line 585
    iget-object v3, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;->e:Lcom/usercentrics/sdk/v2/settings/data/CustomizationFont;

    .line 586
    .line 587
    if-eqz v3, :cond_33

    .line 588
    .line 589
    iget-object v3, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationFont;->a:Ljava/lang/String;

    .line 590
    .line 591
    goto :goto_24

    .line 592
    :cond_33
    const/4 v3, 0x0

    .line 593
    :goto_24
    invoke-static {v3}, Lac1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v3

    .line 597
    if-nez v3, :cond_34

    .line 598
    .line 599
    move-object/from16 v5, v27

    .line 600
    .line 601
    goto :goto_25

    .line 602
    :cond_34
    move-object v5, v3

    .line 603
    :goto_25
    if-eqz v2, :cond_35

    .line 604
    .line 605
    iget-object v3, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;->e:Lcom/usercentrics/sdk/v2/settings/data/CustomizationFont;

    .line 606
    .line 607
    if-eqz v3, :cond_35

    .line 608
    .line 609
    iget-object v3, v3, Lcom/usercentrics/sdk/v2/settings/data/CustomizationFont;->b:Ljava/lang/Integer;

    .line 610
    .line 611
    if-eqz v3, :cond_35

    .line 612
    .line 613
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 614
    .line 615
    .line 616
    move-result v3

    .line 617
    goto :goto_26

    .line 618
    :cond_35
    const/16 v3, 0xe

    .line 619
    .line 620
    :goto_26
    invoke-direct {v0, v5, v3}, Llu1;-><init>(Ljava/lang/String;I)V

    .line 621
    .line 622
    .line 623
    if-eqz v2, :cond_36

    .line 624
    .line 625
    iget-object v3, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;->b:Ljava/lang/Integer;

    .line 626
    .line 627
    if-eqz v3, :cond_36

    .line 628
    .line 629
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    goto :goto_27

    .line 634
    :cond_36
    const/16 v3, 0x8

    .line 635
    .line 636
    :goto_27
    sget-object v4, Lgl;->Companion:Lfl;

    .line 637
    .line 638
    if-eqz v2, :cond_37

    .line 639
    .line 640
    iget-object v2, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;->h:Ljava/lang/String;

    .line 641
    .line 642
    goto :goto_28

    .line 643
    :cond_37
    const/4 v2, 0x0

    .line 644
    :goto_28
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 645
    .line 646
    .line 647
    if-eqz v2, :cond_38

    .line 648
    .line 649
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 650
    .line 651
    invoke-virtual {v2, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    goto :goto_29

    .line 659
    :cond_38
    const/4 v2, 0x0

    .line 660
    :goto_29
    const-string v4, "HORIZONTAL"

    .line 661
    .line 662
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result v4

    .line 666
    if-eqz v4, :cond_39

    .line 667
    .line 668
    sget-object v2, Lgl;->a:Lgl;

    .line 669
    .line 670
    goto :goto_2a

    .line 671
    :cond_39
    const-string v4, "VERTICAL"

    .line 672
    .line 673
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result v2

    .line 677
    if-eqz v2, :cond_3a

    .line 678
    .line 679
    sget-object v2, Lgl;->b:Lgl;

    .line 680
    .line 681
    goto :goto_2a

    .line 682
    :cond_3a
    sget-object v2, Lgl;->c:Lgl;

    .line 683
    .line 684
    :goto_2a
    invoke-direct {v1, v11, v0, v3, v2}, Lur3;-><init>(Lju1;Llu1;ILgl;)V

    .line 685
    .line 686
    .line 687
    return-object v1
.end method

.method public I(Landroid/app/Activity;Lq83;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lac1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/WeakHashMap;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lac1;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lq83;

    .line 20
    .line 21
    invoke-virtual {p2, v2}, Lq83;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    :try_start_1
    invoke-virtual {v0, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lq83;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lac1;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lfs0;

    .line 43
    .line 44
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Lhe2;

    .line 47
    .line 48
    iget-object p0, p0, Lhe2;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lge2;

    .line 65
    .line 66
    iget-object v1, v0, Lge2;->a:Landroid/app/Activity;

    .line 67
    .line 68
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    iput-object p2, v0, Lge2;->c:Lq83;

    .line 76
    .line 77
    iget-object v0, v0, Lge2;->b:Ldl0;

    .line 78
    .line 79
    invoke-virtual {v0, p2}, Ldl0;->accept(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    return-void

    .line 84
    :catchall_0
    move-exception p0

    .line 85
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 86
    .line 87
    .line 88
    throw p0
.end method

.method public J()V
    .locals 0

    .line 1
    iget-object p0, p0, Lac1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public L(Lwk2;Ljava/util/ArrayList;)Lcom/usercentrics/sdk/ui/PredefinedUIResponse;
    .locals 10

    .line 1
    iget-object v0, p0, Lac1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La13;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lac1;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lg13;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_10

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-eq v1, v2, :cond_f

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x2

    .line 23
    if-ne v1, v3, :cond_e

    .line 24
    .line 25
    sget-object v1, Lya2;->Companion:Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;

    .line 26
    .line 27
    invoke-virtual {v1, p2}, Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;->userDecisionsTCF(Ljava/util/List;)Lml2;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v1, p2}, Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;->userDecisionsGDPR(Ljava/util/List;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    sget-object v1, Lmz2;->Companion:Llz2;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, La13;->o()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v4, v0, La13;->a:Lfb1;

    .line 48
    .line 49
    if-eqz v1, :cond_c

    .line 50
    .line 51
    iget-object v1, v4, Lfb1;->F:Lhk2;

    .line 52
    .line 53
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lac2;

    .line 58
    .line 59
    invoke-virtual {v1}, Lac2;->b()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    iget-object v1, v3, Lml2;->d:Ljava/util/List;

    .line 66
    .line 67
    new-instance v5, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_2

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    check-cast v6, Lo3;

    .line 87
    .line 88
    iget-boolean v7, v6, Lo3;->b:Z

    .line 89
    .line 90
    if-nez v7, :cond_1

    .line 91
    .line 92
    move-object v6, v2

    .line 93
    goto :goto_1

    .line 94
    :cond_1
    iget v6, v6, Lo3;->a:I

    .line 95
    .line 96
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    :goto_1
    if-eqz v6, :cond_0

    .line 101
    .line 102
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    iget-object v1, v4, Lfb1;->X:Lhk2;

    .line 107
    .line 108
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Ly3;

    .line 113
    .line 114
    invoke-virtual {v1, v5}, Ly3;->f(Ljava/util/List;)V

    .line 115
    .line 116
    .line 117
    :cond_3
    invoke-virtual {v0}, La13;->m()Lil2;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, Lqk2;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    :try_start_0
    sget-object v2, Lo42;->b:Lm42;

    .line 127
    .line 128
    invoke-virtual {v1}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v3}, Lqk2;->b(Lml2;)Lml2;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    iget-object v4, v3, Lml2;->c:Ljava/util/List;

    .line 140
    .line 141
    iget-object v5, v3, Lml2;->b:Ljava/util/List;

    .line 142
    .line 143
    iget-object v3, v3, Lml2;->a:Ljava/util/List;

    .line 144
    .line 145
    if-eqz v3, :cond_4

    .line 146
    .line 147
    invoke-virtual {v1, v3}, Lqk2;->t(Ljava/util/List;)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :catchall_0
    move-exception v2

    .line 152
    goto/16 :goto_4

    .line 153
    .line 154
    :cond_4
    :goto_2
    if-eqz v5, :cond_7

    .line 155
    .line 156
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    :cond_5
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    if-eqz v7, :cond_7

    .line 165
    .line 166
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    check-cast v7, Lkl2;

    .line 171
    .line 172
    iget-object v8, v7, Lkl2;->b:Ljava/lang/Boolean;

    .line 173
    .line 174
    iget v7, v7, Lkl2;->a:I

    .line 175
    .line 176
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    iget-object v9, v1, Lqk2;->m:Lql2;

    .line 183
    .line 184
    if-eqz v8, :cond_6

    .line 185
    .line 186
    if-eqz v9, :cond_5

    .line 187
    .line 188
    iget-object v8, v9, Lql2;->q:Lu13;

    .line 189
    .line 190
    if-eqz v8, :cond_5

    .line 191
    .line 192
    invoke-virtual {v8, v7}, Lu13;->b(I)V

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_6
    if-eqz v9, :cond_5

    .line 197
    .line 198
    iget-object v8, v9, Lql2;->q:Lu13;

    .line 199
    .line 200
    if-eqz v8, :cond_5

    .line 201
    .line 202
    invoke-virtual {v8, v7}, Lu13;->d(I)V

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_7
    if-eqz v4, :cond_8

    .line 207
    .line 208
    invoke-virtual {v1, v4}, Lqk2;->u(Ljava/util/List;)V

    .line 209
    .line 210
    .line 211
    :cond_8
    invoke-virtual {v1}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1}, Lqk2;->k()Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    invoke-static {v7}, Lmn0;->c(Ljava/util/List;)Ljava/util/LinkedHashMap;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-virtual {v1, v6, v7}, Lqk2;->v(Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;Ljava/util/Map;)V

    .line 227
    .line 228
    .line 229
    iget-boolean v2, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->A:Z

    .line 230
    .line 231
    if-eqz v2, :cond_9

    .line 232
    .line 233
    iget-object v2, v1, Lqk2;->m:Lql2;

    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    iget-object v2, v2, Lql2;->z:Lu13;

    .line 239
    .line 240
    invoke-virtual {v2}, Lu13;->clear()V

    .line 241
    .line 242
    .line 243
    iget-object v2, v1, Lqk2;->m:Lql2;

    .line 244
    .line 245
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    iget-object v2, v2, Lql2;->s:Lu13;

    .line 249
    .line 250
    invoke-virtual {v2}, Lu13;->clear()V

    .line 251
    .line 252
    .line 253
    :cond_9
    if-nez v3, :cond_a

    .line 254
    .line 255
    if-nez v5, :cond_a

    .line 256
    .line 257
    if-eqz v4, :cond_b

    .line 258
    .line 259
    :cond_a
    invoke-virtual {v1, p1}, Lqk2;->y(Lwk2;)V

    .line 260
    .line 261
    .line 262
    :cond_b
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :goto_4
    sget-object v3, Lo42;->b:Lm42;

    .line 266
    .line 267
    new-instance v3, Ln42;

    .line 268
    .line 269
    invoke-direct {v3, v2}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 270
    .line 271
    .line 272
    move-object v2, v3

    .line 273
    :goto_5
    invoke-static {v2}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    if-eqz v2, :cond_d

    .line 278
    .line 279
    iget-object v1, v1, Lqk2;->a:Li03;

    .line 280
    .line 281
    new-instance v3, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    const-string v4, "Something went wrong with TCF updateChoices method: "

    .line 284
    .line 285
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-interface {v1, v3, v2}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 296
    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_c
    invoke-virtual {v4}, Lfb1;->e()Li03;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    sget-object v3, La13;->Companion:Lv03;

    .line 304
    .line 305
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    const-string v3, "You *must* have the TCF settings enabled to do this operation: "

    .line 309
    .line 310
    const-string v4, "saveDecisionsForTCF"

    .line 311
    .line 312
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    invoke-interface {v1, v3, v2}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 317
    .line 318
    .line 319
    :cond_d
    :goto_6
    invoke-virtual {v0, p2}, La13;->p(Ljava/util/List;)Ljava/util/ArrayList;

    .line 320
    .line 321
    .line 322
    move-result-object p2

    .line 323
    goto :goto_7

    .line 324
    :cond_e
    invoke-static {}, Lds0;->b()V

    .line 325
    .line 326
    .line 327
    return-object v2

    .line 328
    :cond_f
    sget-object v1, Lya2;->Companion:Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;

    .line 329
    .line 330
    invoke-virtual {v1, p2}, Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;->userDecisionsGDPR(Ljava/util/List;)Ljava/util/List;

    .line 331
    .line 332
    .line 333
    move-result-object p2

    .line 334
    sget-object v1, Lmz2;->Companion:Llz2;

    .line 335
    .line 336
    invoke-virtual {v0, p2}, La13;->p(Ljava/util/List;)Ljava/util/ArrayList;

    .line 337
    .line 338
    .line 339
    move-result-object p2

    .line 340
    goto :goto_7

    .line 341
    :cond_10
    sget-object v1, Lya2;->Companion:Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;

    .line 342
    .line 343
    invoke-virtual {v1, p2}, Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;->userDecisionsGDPR(Ljava/util/List;)Ljava/util/List;

    .line 344
    .line 345
    .line 346
    move-result-object p2

    .line 347
    sget-object v1, Lmz2;->Companion:Llz2;

    .line 348
    .line 349
    invoke-virtual {v0, p2}, La13;->p(Ljava/util/List;)Ljava/util/ArrayList;

    .line 350
    .line 351
    .line 352
    move-result-object p2

    .line 353
    :goto_7
    sget-object v1, Lwk2;->b:Lwk2;

    .line 354
    .line 355
    if-ne p1, v1, :cond_11

    .line 356
    .line 357
    sget-object p1, Lez2;->e:Lez2;

    .line 358
    .line 359
    goto :goto_8

    .line 360
    :cond_11
    sget-object p1, Lez2;->v:Lez2;

    .line 361
    .line 362
    :goto_8
    invoke-virtual {v0, p1}, La13;->c(Lez2;)V

    .line 363
    .line 364
    .line 365
    new-instance p1, Lcom/usercentrics/sdk/ui/PredefinedUIResponse;

    .line 366
    .line 367
    sget-object v0, Lav1;->c:Lav1;

    .line 368
    .line 369
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast p0, Ljava/lang/String;

    .line 372
    .line 373
    invoke-direct {p1, v0, p2, p0}, Lcom/usercentrics/sdk/ui/PredefinedUIResponse;-><init>(Lav1;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    return-object p1
.end method

.method public O(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lzw;->Companion:Lyw;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/16 v2, 0x23

    .line 18
    .line 19
    invoke-static {v1, v2, v0}, Lkotlin/text/a;->b(CCZ)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v0, p2

    .line 32
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v1, 0x6

    .line 44
    if-eq v0, v1, :cond_2

    .line 45
    .line 46
    :goto_1
    iget-object p0, p0, Lac1;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Li03;

    .line 49
    .line 50
    const-string v0, ") for \'"

    .line 51
    .line 52
    const-string v1, "\' should be a valid hexadecimal, default color will be used "

    .line 53
    .line 54
    const-string v2, "Configured color ("

    .line 55
    .line 56
    invoke-static {v2, p2, v0, p1, v1}, Len;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const/4 p2, 0x0

    .line 68
    invoke-interface {p0, p1, p2}, Li03;->c(Ljava/lang/String;Lvz2;)V

    .line 69
    .line 70
    .line 71
    return-object p3

    .line 72
    :cond_2
    return-object p2
.end method

.method public declared-synchronized P(IIJJ)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, v1, Lac1;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lij3;

    .line 7
    .line 8
    iget-object v0, v0, Lij3;->V:Lxt0;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    iget-object v0, v1, Lac1;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    const-wide/16 v6, -0x1

    .line 26
    .line 27
    cmp-long v4, v4, v6

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 33
    .line 34
    .line 35
    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    sub-long v4, v2, v4

    .line 37
    .line 38
    const-wide/32 v6, 0x1b7740

    .line 39
    .line 40
    .line 41
    cmp-long v0, v4, v6

    .line 42
    .line 43
    if-gtz v0, :cond_1

    .line 44
    .line 45
    monitor-exit p0

    .line 46
    return-void

    .line 47
    :cond_1
    :goto_0
    :try_start_1
    iget-object v0, v1, Lac1;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lfc3;

    .line 50
    .line 51
    new-instance v4, Lcom/google/android/gms/common/internal/TelemetryData;

    .line 52
    .line 53
    new-instance v5, Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 54
    .line 55
    const/4 v14, 0x0

    .line 56
    const/4 v15, 0x0

    .line 57
    const v6, 0x8dcd

    .line 58
    .line 59
    .line 60
    const/4 v8, 0x0

    .line 61
    const/4 v13, 0x0

    .line 62
    move/from16 v7, p1

    .line 63
    .line 64
    move/from16 v16, p2

    .line 65
    .line 66
    move-wide/from16 v9, p3

    .line 67
    .line 68
    move-wide/from16 v11, p5

    .line 69
    .line 70
    invoke-direct/range {v5 .. v16}, Lcom/google/android/gms/common/internal/MethodInvocation;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 71
    .line 72
    .line 73
    filled-new-array {v5}, [Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    const/4 v6, 0x0

    .line 82
    invoke-direct {v4, v6, v5}, Lcom/google/android/gms/common/internal/TelemetryData;-><init>(ILjava/util/List;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v4}, Lfc3;->c(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/google/android/gms/tasks/Task;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    new-instance v4, Lbu;

    .line 90
    .line 91
    invoke-direct {v4, v1, v2, v3}, Lbu;-><init>(Lac1;J)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v4}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    .line 96
    .line 97
    monitor-exit p0

    .line 98
    return-void

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 101
    throw v0
.end method

.method public a([BI)[B
    .locals 8

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-gt p2, v0, :cond_4

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {v1}, Lpm2;->a(I)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_3

    .line 12
    .line 13
    sget-object v2, Lhe0;->b:Lhe0;

    .line 14
    .line 15
    const-string v4, "AES/ECB/NoPadding"

    .line 16
    .line 17
    iget-object v2, v2, Lhe0;->a:Lge0;

    .line 18
    .line 19
    invoke-interface {v2, v4}, Lge0;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljavax/crypto/Cipher;

    .line 24
    .line 25
    iget-object v4, p0, Lac1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Ljavax/crypto/spec/SecretKeySpec;

    .line 28
    .line 29
    invoke-virtual {v2, v1, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 30
    .line 31
    .line 32
    array-length v4, p1

    .line 33
    int-to-double v4, v4

    .line 34
    const-wide/high16 v6, 0x4030000000000000L    # 16.0

    .line 35
    .line 36
    div-double/2addr v4, v6

    .line 37
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    double-to-int v4, v4

    .line 42
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    mul-int/lit8 v5, v4, 0x10

    .line 47
    .line 48
    array-length v6, p1

    .line 49
    const/4 v7, 0x0

    .line 50
    if-ne v5, v6, :cond_0

    .line 51
    .line 52
    add-int/lit8 v3, v4, -0x1

    .line 53
    .line 54
    mul-int/2addr v3, v0

    .line 55
    iget-object p0, p0, Lac1;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, [B

    .line 58
    .line 59
    invoke-static {p1, v3, p0, v7, v0}, Lk50;->O([BI[BII)[B

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    add-int/lit8 v5, v4, -0x1

    .line 65
    .line 66
    mul-int/2addr v5, v0

    .line 67
    array-length v6, p1

    .line 68
    invoke-static {p1, v5, v6}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    array-length v6, v5

    .line 73
    if-ge v6, v0, :cond_2

    .line 74
    .line 75
    invoke-static {v5, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    array-length v5, v5

    .line 80
    const/16 v6, -0x80

    .line 81
    .line 82
    aput-byte v6, v3, v5

    .line 83
    .line 84
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, [B

    .line 87
    .line 88
    invoke-static {v3, p0}, Lk50;->P([B[B)[B

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    :goto_0
    new-array v3, v0, [B

    .line 93
    .line 94
    move v5, v7

    .line 95
    :goto_1
    add-int/lit8 v6, v4, -0x1

    .line 96
    .line 97
    if-ge v5, v6, :cond_1

    .line 98
    .line 99
    mul-int/lit8 v6, v5, 0x10

    .line 100
    .line 101
    invoke-static {v3, v7, p1, v6, v0}, Lk50;->O([BI[BII)[B

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v2, v3}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    add-int/lit8 v5, v5, 0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    invoke-static {p0, v3}, Lk50;->P([B[B)[B

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {v2, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :cond_2
    const-string p0, "x must be smaller than a block."

    .line 126
    .line 127
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-object v3

    .line 131
    :cond_3
    const-string p0, "Can not use AES-CMAC in FIPS-mode."

    .line 132
    .line 133
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-object v3

    .line 137
    :cond_4
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    .line 138
    .line 139
    const-string p1, "outputLength too large, max is 16 bytes"

    .line 140
    .line 141
    invoke-direct {p0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p0
.end method

.method public b(ILjava/lang/Throwable;[B)V
    .locals 9

    .line 1
    iget-object p3, p0, Lac1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p3, Lsl3;

    .line 4
    .line 5
    invoke-virtual {p3}, Leg3;->y()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lac1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzol;

    .line 11
    .line 12
    const/16 v1, 0xc8

    .line 13
    .line 14
    if-eq p1, v1, :cond_0

    .line 15
    .line 16
    const/16 v1, 0xcc

    .line 17
    .line 18
    if-eq p1, v1, :cond_0

    .line 19
    .line 20
    const/16 v1, 0x130

    .line 21
    .line 22
    if-ne p1, v1, :cond_1

    .line 23
    .line 24
    move p1, v1

    .line 25
    :cond_0
    if-nez p2, :cond_1

    .line 26
    .line 27
    iget-object p1, p3, Lsq3;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lij3;

    .line 30
    .line 31
    iget-object p1, p1, Lij3;->f:Luh3;

    .line 32
    .line 33
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p1, Luh3;->Y:Lsh3;

    .line 37
    .line 38
    iget-wide v1, v0, Lcom/google/android/gms/measurement/internal/zzol;->a:J

    .line 39
    .line 40
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    const-string v1, "[sgtm] Upload succeeded for row_id"

    .line 45
    .line 46
    invoke-virtual {p1, p2, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Lyl3;->c:Lyl3;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object v1, p3, Lsq3;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lij3;

    .line 55
    .line 56
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 57
    .line 58
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, v1, Luh3;->w:Lsh3;

    .line 62
    .line 63
    iget-wide v2, v0, Lcom/google/android/gms/measurement/internal/zzol;->a:J

    .line 64
    .line 65
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    const-string v4, "[sgtm] Upload failed for row_id. response, exception"

    .line 74
    .line 75
    invoke-virtual {v1, v4, v2, v3, p2}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object p2, Lvg3;->u:Lug3;

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-virtual {p2, v1}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    check-cast p2, Ljava/lang/String;

    .line 86
    .line 87
    const-string v1, ","

    .line 88
    .line 89
    invoke-virtual {p2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-interface {p2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_2

    .line 106
    .line 107
    sget-object p1, Lyl3;->e:Lyl3;

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_2
    sget-object p1, Lyl3;->d:Lyl3;

    .line 111
    .line 112
    :goto_0
    iget-object p0, p0, Lac1;->c:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 115
    .line 116
    iget-object p2, p3, Lsq3;->a:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p2, Lij3;

    .line 119
    .line 120
    invoke-virtual {p2}, Lij3;->o()Lpn3;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    new-instance v3, Lcom/google/android/gms/measurement/internal/zzaf;

    .line 125
    .line 126
    iget-wide v5, v0, Lcom/google/android/gms/measurement/internal/zzol;->a:J

    .line 127
    .line 128
    iget v4, p1, Lyl3;->a:I

    .line 129
    .line 130
    iget-wide v7, v0, Lcom/google/android/gms/measurement/internal/zzol;->f:J

    .line 131
    .line 132
    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/measurement/internal/zzaf;-><init>(IJJ)V

    .line 133
    .line 134
    .line 135
    move-wide v7, v5

    .line 136
    invoke-virtual {v2}, Leg3;->y()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Lwg3;->A()V

    .line 140
    .line 141
    .line 142
    const/4 p2, 0x1

    .line 143
    invoke-virtual {v2, p2}, Lpn3;->P(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    new-instance v1, Ljs0;

    .line 148
    .line 149
    const/16 v5, 0x11

    .line 150
    .line 151
    const/4 v6, 0x0

    .line 152
    move-object v4, v3

    .line 153
    move-object v3, p2

    .line 154
    invoke-direct/range {v1 .. v6}, Ljs0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v1}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 158
    .line 159
    .line 160
    iget-object p2, p3, Lsq3;->a:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p2, Lij3;

    .line 163
    .line 164
    iget-object p2, p2, Lij3;->f:Luh3;

    .line 165
    .line 166
    invoke-static {p2}, Lij3;->l(Lhk3;)V

    .line 167
    .line 168
    .line 169
    iget-object p2, p2, Luh3;->Y:Lsh3;

    .line 170
    .line 171
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    const-string v0, "[sgtm] Updated status for row_id"

    .line 176
    .line 177
    invoke-virtual {p2, p3, v0, p1}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    monitor-enter p0

    .line 181
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 185
    .line 186
    .line 187
    monitor-exit p0

    .line 188
    return-void

    .line 189
    :catchall_0
    move-exception v0

    .line 190
    move-object p1, v0

    .line 191
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    throw p1
.end method

.method public c(Lwk2;)Lcom/usercentrics/sdk/ui/PredefinedUIResponse;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-object v0, v1, Lac1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v3, v0

    .line 8
    check-cast v3, La13;

    .line 9
    .line 10
    iget-object v0, v1, Lac1;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lg13;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_b

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    if-eq v0, v4, :cond_a

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x2

    .line 25
    if-ne v0, v5, :cond_9

    .line 26
    .line 27
    sget-object v0, Lmz2;->Companion:Llz2;

    .line 28
    .line 29
    invoke-virtual {v3}, La13;->o()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object v5, v3, La13;->a:Lfb1;

    .line 34
    .line 35
    if-eqz v0, :cond_7

    .line 36
    .line 37
    iget-object v0, v5, Lfb1;->F:Lhk2;

    .line 38
    .line 39
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lac2;

    .line 44
    .line 45
    invoke-virtual {v0}, Lac2;->b()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    iget-object v0, v5, Lfb1;->X:Lhk2;

    .line 52
    .line 53
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ly3;

    .line 58
    .line 59
    invoke-virtual {v0}, Ly3;->a()V

    .line 60
    .line 61
    .line 62
    :cond_0
    invoke-virtual {v3}, La13;->m()Lil2;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v4, v0

    .line 67
    check-cast v4, Lqk2;

    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    :try_start_0
    sget-object v0, Lo42;->b:Lm42;

    .line 73
    .line 74
    iget-object v0, v4, Lqk2;->m:Lql2;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 80
    .line 81
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 82
    .line 83
    .line 84
    new-instance v6, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    new-instance v7, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    new-instance v8, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    new-instance v9, Ljava/util/LinkedHashSet;

    .line 100
    .line 101
    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Lqk2;->k()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    sget-object v11, Lb13;->a:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    if-eqz v13, :cond_5

    .line 119
    .line 120
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    check-cast v13, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 125
    .line 126
    iget v14, v13, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->d:I

    .line 127
    .line 128
    iget-object v15, v13, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->i:Ljava/util/List;

    .line 129
    .line 130
    move-object/from16 v16, v10

    .line 131
    .line 132
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    if-eqz v10, :cond_1

    .line 141
    .line 142
    move-object/from16 v18, v11

    .line 143
    .line 144
    move-object/from16 v19, v12

    .line 145
    .line 146
    goto/16 :goto_4

    .line 147
    .line 148
    :cond_1
    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    move/from16 v17, v10

    .line 153
    .line 154
    if-nez v17, :cond_3

    .line 155
    .line 156
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    new-instance v10, Ljava/util/ArrayList;

    .line 164
    .line 165
    move-object/from16 v18, v11

    .line 166
    .line 167
    move-object/from16 v19, v12

    .line 168
    .line 169
    const/16 v11, 0xa

    .line 170
    .line 171
    invoke-static {v15, v11}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 176
    .line 177
    .line 178
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v11

    .line 182
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v12

    .line 186
    if-eqz v12, :cond_2

    .line 187
    .line 188
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    check-cast v12, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 193
    .line 194
    iget v12, v12, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 195
    .line 196
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v12

    .line 200
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :catchall_0
    move-exception v0

    .line 205
    goto/16 :goto_5

    .line 206
    .line 207
    :cond_2
    invoke-interface {v5, v10}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 208
    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_3
    move-object/from16 v18, v11

    .line 212
    .line 213
    move-object/from16 v19, v12

    .line 214
    .line 215
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    :goto_2
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    iget-object v10, v13, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->f:Ljava/util/List;

    .line 230
    .line 231
    new-instance v11, Ljava/util/ArrayList;

    .line 232
    .line 233
    const/16 v12, 0xa

    .line 234
    .line 235
    invoke-static {v10, v12}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 236
    .line 237
    .line 238
    move-result v12

    .line 239
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 240
    .line 241
    .line 242
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v10

    .line 246
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v12

    .line 250
    if-eqz v12, :cond_4

    .line 251
    .line 252
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v12

    .line 256
    check-cast v12, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 257
    .line 258
    iget v12, v12, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 259
    .line 260
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object v12

    .line 264
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_4
    invoke-interface {v9, v11}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 269
    .line 270
    .line 271
    :goto_4
    move-object/from16 v10, v16

    .line 272
    .line 273
    move-object/from16 v11, v18

    .line 274
    .line 275
    move-object/from16 v12, v19

    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :cond_5
    move-object/from16 v16, v10

    .line 280
    .line 281
    invoke-virtual {v4}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-static/range {v16 .. v16}, Lmn0;->c(Ljava/util/List;)Ljava/util/LinkedHashMap;

    .line 289
    .line 290
    .line 291
    move-result-object v11

    .line 292
    invoke-virtual {v4, v10, v11}, Lqk2;->v(Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;Ljava/util/Map;)V

    .line 293
    .line 294
    .line 295
    iget-object v10, v0, Lql2;->y:Lu13;

    .line 296
    .line 297
    invoke-virtual {v10, v6}, Lu13;->c(Ljava/util/List;)V

    .line 298
    .line 299
    .line 300
    iget-object v6, v0, Lql2;->y:Lu13;

    .line 301
    .line 302
    invoke-virtual {v6, v7}, Lu13;->e(Ljava/util/List;)V

    .line 303
    .line 304
    .line 305
    iget-object v6, v0, Lql2;->z:Lu13;

    .line 306
    .line 307
    invoke-virtual {v6, v8}, Lu13;->c(Ljava/util/List;)V

    .line 308
    .line 309
    .line 310
    new-instance v6, Ljava/util/ArrayList;

    .line 311
    .line 312
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 313
    .line 314
    .line 315
    iget-object v7, v0, Lql2;->z:Lu13;

    .line 316
    .line 317
    invoke-virtual {v7, v6}, Lu13;->e(Ljava/util/List;)V

    .line 318
    .line 319
    .line 320
    iget-object v6, v4, Lqk2;->p:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    .line 321
    .line 322
    iget-object v6, v6, Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;->c:Ljava/util/List;

    .line 323
    .line 324
    iget-object v7, v0, Lql2;->r:Lu13;

    .line 325
    .line 326
    invoke-static {v5, v6}, Lqk2;->c(Ljava/util/LinkedHashSet;Ljava/util/List;)Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    invoke-virtual {v7, v5}, Lu13;->c(Ljava/util/List;)V

    .line 331
    .line 332
    .line 333
    iget-object v5, v0, Lql2;->s:Lu13;

    .line 334
    .line 335
    invoke-static {v9, v6}, Lqk2;->c(Ljava/util/LinkedHashSet;Ljava/util/List;)Ljava/util/List;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    invoke-virtual {v5, v6}, Lu13;->c(Ljava/util/List;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v4}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    iget-boolean v5, v5, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->A:Z

    .line 350
    .line 351
    if-eqz v5, :cond_6

    .line 352
    .line 353
    iget-object v5, v0, Lql2;->z:Lu13;

    .line 354
    .line 355
    invoke-virtual {v5}, Lu13;->clear()V

    .line 356
    .line 357
    .line 358
    iget-object v5, v0, Lql2;->s:Lu13;

    .line 359
    .line 360
    invoke-virtual {v5}, Lu13;->clear()V

    .line 361
    .line 362
    .line 363
    :cond_6
    iget-object v0, v0, Lql2;->q:Lu13;

    .line 364
    .line 365
    invoke-virtual {v4}, Lqk2;->g()Ljava/util/List;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    invoke-virtual {v0, v5}, Lu13;->c(Ljava/util/List;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v4, v2}, Lqk2;->y(Lwk2;)V

    .line 373
    .line 374
    .line 375
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 376
    .line 377
    goto :goto_6

    .line 378
    :goto_5
    sget-object v5, Lo42;->b:Lm42;

    .line 379
    .line 380
    new-instance v5, Ln42;

    .line 381
    .line 382
    invoke-direct {v5, v0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 383
    .line 384
    .line 385
    move-object v0, v5

    .line 386
    :goto_6
    invoke-static {v0}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    if-eqz v0, :cond_8

    .line 391
    .line 392
    iget-object v4, v4, Lqk2;->a:Li03;

    .line 393
    .line 394
    new-instance v5, Ljava/lang/StringBuilder;

    .line 395
    .line 396
    const-string v6, "Something went wrong with TCF acceptAllDisclosed method: "

    .line 397
    .line 398
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    invoke-interface {v4, v5, v0}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 409
    .line 410
    .line 411
    goto :goto_7

    .line 412
    :cond_7
    invoke-virtual {v5}, Lfb1;->e()Li03;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    sget-object v5, La13;->Companion:Lv03;

    .line 417
    .line 418
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    const-string v5, "You *must* have the TCF settings enabled to do this operation: "

    .line 422
    .line 423
    const-string v6, "acceptAllForTCF"

    .line 424
    .line 425
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    invoke-interface {v0, v5, v4}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 430
    .line 431
    .line 432
    :cond_8
    :goto_7
    invoke-virtual {v3}, La13;->d()Ljava/util/ArrayList;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    goto :goto_8

    .line 437
    :cond_9
    invoke-static {}, Lds0;->b()V

    .line 438
    .line 439
    .line 440
    return-object v4

    .line 441
    :cond_a
    sget-object v0, Lmz2;->Companion:Llz2;

    .line 442
    .line 443
    const/4 v0, 0x0

    .line 444
    invoke-virtual {v3, v0}, La13;->q(Z)Ljava/util/ArrayList;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    goto :goto_8

    .line 449
    :cond_b
    sget-object v0, Lmz2;->Companion:Llz2;

    .line 450
    .line 451
    invoke-virtual {v3}, La13;->d()Ljava/util/ArrayList;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    :goto_8
    sget-object v4, Lwk2;->b:Lwk2;

    .line 456
    .line 457
    if-ne v2, v4, :cond_c

    .line 458
    .line 459
    sget-object v2, Lez2;->c:Lez2;

    .line 460
    .line 461
    goto :goto_9

    .line 462
    :cond_c
    sget-object v2, Lez2;->f:Lez2;

    .line 463
    .line 464
    :goto_9
    invoke-virtual {v3, v2}, La13;->c(Lez2;)V

    .line 465
    .line 466
    .line 467
    new-instance v2, Lcom/usercentrics/sdk/ui/PredefinedUIResponse;

    .line 468
    .line 469
    sget-object v3, Lav1;->a:Lav1;

    .line 470
    .line 471
    iget-object v1, v1, Lac1;->d:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v1, Ljava/lang/String;

    .line 474
    .line 475
    invoke-direct {v2, v3, v0, v1}, Lcom/usercentrics/sdk/ui/PredefinedUIResponse;-><init>(Lav1;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    return-object v2
.end method

.method public d(DF)V
    .locals 4

    .line 1
    iget-object v0, p0, Lac1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [F

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    iget-object v1, p0, Lac1;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, [D

    .line 11
    .line 12
    invoke-static {v1, p1, p2}, Ljava/util/Arrays;->binarySearch([DD)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-gez v1, :cond_0

    .line 17
    .line 18
    neg-int v1, v1

    .line 19
    add-int/lit8 v1, v1, -0x1

    .line 20
    .line 21
    :cond_0
    iget-object v2, p0, Lac1;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, [D

    .line 24
    .line 25
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([DI)[D

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iput-object v2, p0, Lac1;->c:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v2, p0, Lac1;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, [F

    .line 34
    .line 35
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iput-object v2, p0, Lac1;->b:Ljava/lang/Object;

    .line 40
    .line 41
    new-array v2, v0, [D

    .line 42
    .line 43
    iput-object v2, p0, Lac1;->d:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v2, p0, Lac1;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, [D

    .line 48
    .line 49
    add-int/lit8 v3, v1, 0x1

    .line 50
    .line 51
    sub-int/2addr v0, v1

    .line 52
    add-int/lit8 v0, v0, -0x1

    .line 53
    .line 54
    invoke-static {v2, v1, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lac1;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, [D

    .line 60
    .line 61
    aput-wide p1, v0, v1

    .line 62
    .line 63
    iget-object p0, p0, Lac1;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, [F

    .line 66
    .line 67
    aput p3, p0, v1

    .line 68
    .line 69
    return-void
.end method

.method public e()V
    .locals 7

    .line 1
    iget-object v0, p0, Lac1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/util/Map$Entry;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Ljava/util/Map$Entry;

    .line 50
    .line 51
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Lyv1;

    .line 56
    .line 57
    new-instance v5, Lzv1;

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    invoke-direct {v5, p0, v1, v3, v6}, Lzv1;-><init>(Lac1;Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iput-object v5, v4, Lyv1;->a:Lkotlin/jvm/functions/Function1;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iget-object v0, p0, Lac1;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_3

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Ljava/util/Map$Entry;

    .line 92
    .line 93
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Ljava/util/Map;

    .line 98
    .line 99
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_2

    .line 112
    .line 113
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    check-cast v3, Ljava/util/Map$Entry;

    .line 118
    .line 119
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    check-cast v4, Lyv1;

    .line 124
    .line 125
    new-instance v5, Lzv1;

    .line 126
    .line 127
    const/4 v6, 0x1

    .line 128
    invoke-direct {v5, p0, v1, v3, v6}, Lzv1;-><init>(Lac1;Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iput-object v5, v4, Lyv1;->a:Lkotlin/jvm/functions/Function1;

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_3
    return-void
.end method

.method public f(Llj2;Ljava/util/Map$Entry;)V
    .locals 9

    .line 1
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, Llj2;

    .line 7
    .line 8
    iget-object v0, p1, Llj2;->g:Lpg;

    .line 9
    .line 10
    iget-object v4, v0, Lpg;->a:Landroid/util/Size;

    .line 11
    .line 12
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lfg;

    .line 17
    .line 18
    iget-object v5, v0, Lfg;->d:Landroid/graphics/Rect;

    .line 19
    .line 20
    iget-boolean p1, p1, Llj2;->c:Z

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lac1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lzp;

    .line 28
    .line 29
    move-object v6, p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v6, v0

    .line 32
    :goto_0
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lfg;

    .line 37
    .line 38
    iget v7, p1, Lfg;->f:I

    .line 39
    .line 40
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lfg;

    .line 45
    .line 46
    iget-boolean v8, p1, Lfg;->g:Z

    .line 47
    .line 48
    new-instance v3, Lsg;

    .line 49
    .line 50
    invoke-direct/range {v3 .. v8}, Lsg;-><init>(Landroid/util/Size;Landroid/graphics/Rect;Lzp;IZ)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lfg;

    .line 58
    .line 59
    iget v4, p1, Lfg;->c:I

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lpg3;->a()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Llj2;->a()V

    .line 68
    .line 69
    .line 70
    iget-boolean p1, v2, Llj2;->j:Z

    .line 71
    .line 72
    const/4 p2, 0x1

    .line 73
    xor-int/2addr p1, p2

    .line 74
    const-string v1, "Consumer can only be linked once."

    .line 75
    .line 76
    invoke-static {v1, p1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    iput-boolean p2, v2, Llj2;->j:Z

    .line 80
    .line 81
    move-object v5, v3

    .line 82
    iget-object v3, v2, Llj2;->l:Lkj2;

    .line 83
    .line 84
    invoke-virtual {v3}, Ld70;->c()Ls81;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    new-instance v1, Ljj2;

    .line 89
    .line 90
    move-object v6, v0

    .line 91
    invoke-direct/range {v1 .. v6}, Ljj2;-><init>(Llj2;Lkj2;ILsg;Lsg;)V

    .line 92
    .line 93
    .line 94
    invoke-static {}, Lpg3;->o()Lnt0;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-static {p1, v1, p2}, Lw11;->I(Ls81;Lud;Ljava/util/concurrent/Executor;)Lls;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    new-instance p2, Lwe2;

    .line 103
    .line 104
    const/4 v0, 0x4

    .line 105
    invoke-direct {p2, v0, p0, v2}, Lwe2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lpg3;->o()Lnt0;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    new-instance v0, Ldp0;

    .line 113
    .line 114
    const/4 v1, 0x0

    .line 115
    invoke-direct {v0, v1, p1, p2}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v0, p0}, Lyo0;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public g(Lwk2;Ljava/util/ArrayList;)Lcom/usercentrics/sdk/ui/PredefinedUIResponse;
    .locals 6

    .line 1
    iget-object v0, p0, Lac1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La13;

    .line 4
    .line 5
    iget-object v1, p0, Lac1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lg13;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_b

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-eq v1, v2, :cond_a

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x2

    .line 20
    if-ne v1, v4, :cond_9

    .line 21
    .line 22
    sget-object v1, Lya2;->Companion:Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;

    .line 23
    .line 24
    invoke-virtual {v1, p2}, Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;->userDecisionsTCF(Ljava/util/List;)Lml2;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iget-object p2, p2, Lml2;->a:Ljava/util/List;

    .line 29
    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    new-instance v1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    move-object v5, v4

    .line 52
    check-cast v5, Ljl2;

    .line 53
    .line 54
    iget-object v5, v5, Ljl2;->c:Ljava/lang/Boolean;

    .line 55
    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/16 p2, 0xa

    .line 63
    .line 64
    invoke-static {v1, p2}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    invoke-static {p2}, Lnc1;->c(I)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    const/16 v4, 0x10

    .line 73
    .line 74
    if-ge p2, v4, :cond_2

    .line 75
    .line 76
    move p2, v4

    .line 77
    :cond_2
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 78
    .line 79
    invoke-direct {v4, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Ljl2;

    .line 97
    .line 98
    iget v5, v1, Ljl2;->a:I

    .line 99
    .line 100
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iget-object v1, v1, Ljl2;->c:Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-interface {v4, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    move-object v4, v3

    .line 114
    :cond_4
    sget-object p2, Lmz2;->Companion:Llz2;

    .line 115
    .line 116
    invoke-virtual {v0}, La13;->o()Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    iget-object v1, v0, La13;->a:Lfb1;

    .line 121
    .line 122
    if-eqz p2, :cond_7

    .line 123
    .line 124
    iget-object p2, v1, Lfb1;->F:Lhk2;

    .line 125
    .line 126
    invoke-virtual {p2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    check-cast p2, Lac2;

    .line 131
    .line 132
    invoke-virtual {p2}, Lac2;->b()Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_5

    .line 137
    .line 138
    iget-object p2, v1, Lfb1;->X:Lhk2;

    .line 139
    .line 140
    invoke-virtual {p2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    check-cast p2, Ly3;

    .line 145
    .line 146
    invoke-virtual {p2}, Ly3;->b()Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_5

    .line 151
    .line 152
    sget-object v1, Lnd0;->a:Lnd0;

    .line 153
    .line 154
    invoke-virtual {p2, v1}, Ly3;->f(Ljava/util/List;)V

    .line 155
    .line 156
    .line 157
    :cond_5
    invoke-virtual {v0}, La13;->m()Lil2;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    check-cast p2, Lqk2;

    .line 162
    .line 163
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    :try_start_0
    sget-object v1, Lo42;->b:Lm42;

    .line 167
    .line 168
    iget-object v1, p2, Lqk2;->m:Lql2;

    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    iget-object v3, v1, Lql2;->y:Lu13;

    .line 174
    .line 175
    invoke-virtual {v3}, Lu13;->clear()V

    .line 176
    .line 177
    .line 178
    iget-object v3, v1, Lql2;->r:Lu13;

    .line 179
    .line 180
    invoke-virtual {p2}, Lqk2;->e()Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    invoke-virtual {v3, v5}, Lu13;->e(Ljava/util/List;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    if-eqz v3, :cond_6

    .line 192
    .line 193
    iget-boolean v3, v3, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->k0:Z

    .line 194
    .line 195
    if-ne v3, v2, :cond_6

    .line 196
    .line 197
    invoke-virtual {p2, v1, v4}, Lqk2;->l(Lql2;Ljava/util/LinkedHashMap;)V

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :catchall_0
    move-exception v1

    .line 202
    goto :goto_3

    .line 203
    :cond_6
    iget-object v2, v1, Lql2;->z:Lu13;

    .line 204
    .line 205
    invoke-virtual {v2}, Lu13;->clear()V

    .line 206
    .line 207
    .line 208
    iget-object v2, v1, Lql2;->z:Lu13;

    .line 209
    .line 210
    iget-object v3, p2, Lqk2;->q:Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-virtual {v2, v3}, Lu13;->c(Ljava/util/List;)V

    .line 213
    .line 214
    .line 215
    iget-object v2, v1, Lql2;->s:Lu13;

    .line 216
    .line 217
    invoke-virtual {p2}, Lqk2;->e()Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    invoke-virtual {v2, v3}, Lu13;->e(Ljava/util/List;)V

    .line 222
    .line 223
    .line 224
    :goto_2
    iget-object v1, v1, Lql2;->q:Lu13;

    .line 225
    .line 226
    invoke-virtual {p2}, Lqk2;->g()Ljava/util/List;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-virtual {v1, v2}, Lu13;->e(Ljava/util/List;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p2}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p2}, Lqk2;->k()Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-static {v2}, Lmn0;->c(Ljava/util/List;)Ljava/util/LinkedHashMap;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-virtual {p2, v1, v2}, Lqk2;->v(Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;Ljava/util/Map;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p2, p1}, Lqk2;->y(Lwk2;)V

    .line 252
    .line 253
    .line 254
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :goto_3
    sget-object v2, Lo42;->b:Lm42;

    .line 258
    .line 259
    new-instance v2, Ln42;

    .line 260
    .line 261
    invoke-direct {v2, v1}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    move-object v1, v2

    .line 265
    :goto_4
    invoke-static {v1}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    if-eqz v1, :cond_8

    .line 270
    .line 271
    iget-object p2, p2, Lqk2;->a:Li03;

    .line 272
    .line 273
    new-instance v2, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    const-string v3, "Something went wrong with TCF denyAllDisclosed method: "

    .line 276
    .line 277
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-interface {p2, v2, v1}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 288
    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_7
    invoke-virtual {v1}, Lfb1;->e()Li03;

    .line 292
    .line 293
    .line 294
    move-result-object p2

    .line 295
    sget-object v1, La13;->Companion:Lv03;

    .line 296
    .line 297
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    const-string v1, "You *must* have the TCF settings enabled to do this operation: "

    .line 301
    .line 302
    const-string v2, "denyAllForTCF"

    .line 303
    .line 304
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-interface {p2, v1, v3}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 309
    .line 310
    .line 311
    :cond_8
    :goto_5
    invoke-virtual {v0}, La13;->g()Ljava/util/ArrayList;

    .line 312
    .line 313
    .line 314
    move-result-object p2

    .line 315
    goto :goto_6

    .line 316
    :cond_9
    invoke-static {}, Lds0;->b()V

    .line 317
    .line 318
    .line 319
    return-object v3

    .line 320
    :cond_a
    sget-object p2, Lmz2;->Companion:Llz2;

    .line 321
    .line 322
    invoke-virtual {v0, v2}, La13;->q(Z)Ljava/util/ArrayList;

    .line 323
    .line 324
    .line 325
    move-result-object p2

    .line 326
    goto :goto_6

    .line 327
    :cond_b
    sget-object p2, Lmz2;->Companion:Llz2;

    .line 328
    .line 329
    invoke-virtual {v0}, La13;->g()Ljava/util/ArrayList;

    .line 330
    .line 331
    .line 332
    move-result-object p2

    .line 333
    :goto_6
    sget-object v1, Lwk2;->b:Lwk2;

    .line 334
    .line 335
    if-ne p1, v1, :cond_c

    .line 336
    .line 337
    sget-object p1, Lez2;->d:Lez2;

    .line 338
    .line 339
    goto :goto_7

    .line 340
    :cond_c
    sget-object p1, Lez2;->i:Lez2;

    .line 341
    .line 342
    :goto_7
    invoke-virtual {v0, p1}, La13;->c(Lez2;)V

    .line 343
    .line 344
    .line 345
    new-instance p1, Lcom/usercentrics/sdk/ui/PredefinedUIResponse;

    .line 346
    .line 347
    sget-object v0, Lav1;->b:Lav1;

    .line 348
    .line 349
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast p0, Ljava/lang/String;

    .line 352
    .line 353
    invoke-direct {p1, v0, p2, p0}, Lcom/usercentrics/sdk/ui/PredefinedUIResponse;-><init>(Lav1;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    return-object p1
.end method

.method public get()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lac1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v2, Lq62;

    .line 7
    .line 8
    const/16 v0, 0x9

    .line 9
    .line 10
    invoke-direct {v2, v0}, Lq62;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v3, Lp62;

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    invoke-direct {v3, v0}, Lp62;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lac1;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lb5;

    .line 23
    .line 24
    invoke-virtual {v0}, Lb5;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v4, v0

    .line 29
    check-cast v4, Ln60;

    .line 30
    .line 31
    iget-object v0, p0, Lac1;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Leq2;

    .line 34
    .line 35
    invoke-virtual {v0}, Leq2;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object v5, v0

    .line 40
    check-cast v5, Lf31;

    .line 41
    .line 42
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lra2;

    .line 45
    .line 46
    invoke-virtual {p0}, Lra2;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    move-object v6, p0

    .line 51
    check-cast v6, Lra2;

    .line 52
    .line 53
    new-instance v1, Lyr2;

    .line 54
    .line 55
    invoke-direct/range {v1 .. v6}, Lyr2;-><init>(Lyv;Lyv;Ln60;Lf31;Lra2;)V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :pswitch_0
    iget-object v0, p0, Lac1;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Ljavax/inject/Provider;

    .line 62
    .line 63
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move-object v2, v0

    .line 68
    check-cast v2, Landroid/content/Context;

    .line 69
    .line 70
    iget-object v0, p0, Lac1;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Ljavax/inject/Provider;

    .line 73
    .line 74
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    move-object v3, v0

    .line 79
    check-cast v3, Ls52;

    .line 80
    .line 81
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p0, Lp62;

    .line 84
    .line 85
    invoke-virtual {p0}, Lp62;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    move-object v4, p0

    .line 90
    check-cast v4, Lkg;

    .line 91
    .line 92
    new-instance v1, Lec;

    .line 93
    .line 94
    const/16 v5, 0x1c

    .line 95
    .line 96
    const/4 v6, 0x0

    .line 97
    invoke-direct/range {v1 .. v6}, Lec;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 98
    .line 99
    .line 100
    return-object v1

    .line 101
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public h()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lac1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lac1;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    monitor-exit v0

    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p0
.end method

.method public j(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 3

    .line 1
    new-instance v0, Lfz1;

    .line 2
    .line 3
    iget-object v1, p0, Lac1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/HashMap;

    .line 6
    .line 7
    iget-object v2, p0, Lac1;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lcp1;

    .line 14
    .line 15
    invoke-direct {v0, p1, v1, v2, p0}, Lfz1;-><init>(Ljava/io/ByteArrayOutputStream;Ljava/util/HashMap;Ljava/util/HashMap;Lcp1;)V

    .line 16
    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lcp1;

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    invoke-interface {p0, p2, v0}, Ltd0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    new-instance p0, Lwd0;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance p2, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v0, "No encoder for "

    .line 46
    .line 47
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p0
.end method

.method public k(Lmw0;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Lmw0;->x0()Lgw0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lto;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lto;

    .line 11
    .line 12
    iget-object v0, v0, Lto;->a:Lso;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    invoke-interface {v0}, Lso;->j()Lqo;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v3, Lqo;->f:Lqo;

    .line 21
    .line 22
    if-eq v1, v3, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Lso;->j()Lqo;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sget-object v3, Lqo;->d:Lqo;

    .line 29
    .line 30
    if-eq v1, v3, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-interface {v0}, Lso;->g()Lpo;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sget-object v3, Lpo;->e:Lpo;

    .line 38
    .line 39
    if-eq v1, v3, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-interface {v0}, Lso;->e()Lro;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v1, Lro;->d:Lro;

    .line 47
    .line 48
    if-eq v0, v1, :cond_3

    .line 49
    .line 50
    :goto_1
    iget-object p0, p0, Lac1;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lf42;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    iget-object v0, p0, Lac1;->d:Ljava/lang/Object;

    .line 62
    .line 63
    monitor-enter v0

    .line 64
    :try_start_0
    iget-object v1, p0, Lac1;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Ljava/util/ArrayDeque;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    const/4 v3, 0x3

    .line 73
    if-lt v1, v3, :cond_4

    .line 74
    .line 75
    invoke-virtual {p0}, Lac1;->h()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    goto :goto_2

    .line 80
    :catchall_0
    move-exception p0

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    :goto_2
    iget-object v1, p0, Lac1;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Ljava/util/ArrayDeque;

    .line 85
    .line 86
    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    iget-object p0, p0, Lac1;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p0, Lf42;

    .line 93
    .line 94
    if-eqz p0, :cond_5

    .line 95
    .line 96
    if-eqz v2, :cond_5

    .line 97
    .line 98
    check-cast v2, Lmw0;

    .line 99
    .line 100
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 101
    .line 102
    .line 103
    :cond_5
    return-void

    .line 104
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    throw p0
.end method

.method public l(Ljava/lang/Class;Ljava/lang/String;)Lq33;
    .locals 4

    .line 1
    iget-object v0, p0, Lac1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls33;

    .line 4
    .line 5
    iget-object v1, p0, Lac1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lt33;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v1, Lt33;->a:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lq33;

    .line 19
    .line 20
    invoke-virtual {p1, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    instance-of p0, v0, La72;

    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    check-cast v0, La72;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    :goto_0
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object p0, v0, La72;->d:Lv61;

    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, La72;->e:Lx62;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v2, p1, p0}, Lw11;->c(Lq33;Lx62;Lv61;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :cond_2
    new-instance v2, Lqk1;

    .line 56
    .line 57
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Lm20;

    .line 60
    .line 61
    invoke-direct {v2, p0}, Lqk1;-><init>(Lm20;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lxt0;->W:Lxt0;

    .line 65
    .line 66
    iget-object v3, v2, Lm20;->a:Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    invoke-interface {v3, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :try_start_0
    invoke-interface {v0, p1, v2}, Ls33;->b(Ljava/lang/Class;Lqk1;)Lq33;

    .line 72
    .line 73
    .line 74
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    goto :goto_1

    .line 76
    :catch_0
    invoke-interface {v0, p1}, Ls33;->a(Ljava/lang/Class;)Lq33;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-interface {v1, p2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Lq33;

    .line 88
    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    invoke-virtual {p1}, Lq33;->b()V

    .line 92
    .line 93
    .line 94
    :cond_3
    return-object p0
.end method

.method public m(I)Landroid/content/res/ColorStateList;
    .locals 2

    .line 1
    iget-object v0, p0, Lac1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lac1;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p0, v1}, Lv00;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public n(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Lac1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lac1;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p0, v1}, Lmn0;->p(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public o(I)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    iget-object v0, p0, Lac1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lac1;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/content/res/TypedArray;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {}, Lya;->a()Lya;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object p0, p0, Lac1;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Landroid/content/Context;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_0
    iget-object v1, v0, Lya;->a:Lx32;

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-virtual {v1, p0, p1, v2}, Lx32;->d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit v0

    .line 39
    return-object p0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p0

    .line 43
    :cond_0
    const/4 p0, 0x0

    .line 44
    return-object p0
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lh52;

    .line 4
    .line 5
    iget-object v0, p0, Lac1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/util/concurrent/ScheduledFuture;

    .line 12
    .line 13
    iget-object v1, p1, Lh52;->a:Lle2;

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    iget-object p1, p1, Lh52;->a:Lle2;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-interface {p0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    throw p0
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 2
    .line 3
    iget-object v1, p0, Lac1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lum;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lpj2;

    .line 11
    .line 12
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ljava/lang/String;

    .line 15
    .line 16
    const-string v3, " cancelled."

    .line 17
    .line 18
    invoke-virtual {p0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-static {v2, p0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-virtual {v1, v2}, Lum;->a(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Landroid/view/Surface;

    .line 2
    .line 3
    iget-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Ls81;

    .line 6
    .line 7
    iget-object p0, p0, Lac1;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lum;

    .line 10
    .line 11
    invoke-static {}, Lpg3;->g()Lo80;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-static {v1, p1, p0, v0}, Lw11;->B(ZLs81;Lum;Lo80;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public p(IILob;)Landroid/graphics/Typeface;
    .locals 9

    .line 1
    iget-object v0, p0, Lac1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p1, p0, Lac1;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Landroid/util/TypedValue;

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    new-instance p1, Landroid/util/TypedValue;

    .line 20
    .line 21
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lac1;->d:Ljava/lang/Object;

    .line 25
    .line 26
    :cond_1
    iget-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v2, p1

    .line 29
    check-cast v2, Landroid/content/Context;

    .line 30
    .line 31
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v4, p0

    .line 34
    check-cast v4, Landroid/util/TypedValue;

    .line 35
    .line 36
    sget-object p0, Ld42;->a:Ljava/lang/ThreadLocal;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    :goto_0
    const/4 p0, 0x0

    .line 45
    return-object p0

    .line 46
    :cond_2
    const/4 v7, 0x1

    .line 47
    const/4 v8, 0x0

    .line 48
    move v5, p2

    .line 49
    move-object v6, p3

    .line 50
    invoke-static/range {v2 .. v8}, Ld42;->b(Landroid/content/Context;ILandroid/util/TypedValue;ILde3;ZZ)Landroid/graphics/Typeface;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public q(Lcu1;)Lyv1;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lcu1;->d:Lvv1;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v1, p1, Lcu1;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget-object p1, p1, Lcu1;->g:Ljava/util/List;

    .line 13
    .line 14
    if-eqz p1, :cond_3

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lpu1;

    .line 43
    .line 44
    iget-object v4, v3, Lpu1;->a:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v5, v3, Lpu1;->b:Lvv1;

    .line 47
    .line 48
    invoke-virtual {p0, v4, v5}, Lac1;->u(Ljava/lang/String;Lvv1;)Lyv1;

    .line 49
    .line 50
    .line 51
    iget-object v3, v3, Lpu1;->a:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    iget-object p1, p0, Lac1;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, Lac1;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    invoke-static {p0, v1, v0}, Lac1;->x(Ljava/util/LinkedHashMap;Ljava/lang/String;Lvv1;)Lyv1;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :cond_3
    :goto_1
    invoke-virtual {p0, v1, v0}, Lac1;->u(Ljava/lang/String;Lvv1;)Lyv1;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
.end method

.method public r(I)[Landroid/util/Size;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lac1;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, [Landroid/util/Size;

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return-object v0

    .line 33
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, [Landroid/util/Size;

    .line 42
    .line 43
    invoke-virtual {v0}, [Landroid/util/Size;->clone()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, [Landroid/util/Size;

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_1
    iget-object v3, v0, Lac1;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, Lts0;

    .line 53
    .line 54
    iget-object v3, v3, Lts0;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v3, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 57
    .line 58
    invoke-virtual {v3, v1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-eqz v3, :cond_17

    .line 63
    .line 64
    array-length v4, v3

    .line 65
    if-nez v4, :cond_2

    .line 66
    .line 67
    goto/16 :goto_5

    .line 68
    .line 69
    :cond_2
    iget-object v0, v0, Lac1;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lwc0;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance v4, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 83
    .line 84
    .line 85
    iget-object v3, v0, Lwc0;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v3, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedOutputSizeQuirk;

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    const/16 v6, 0x2d0

    .line 91
    .line 92
    const/16 v7, 0x438

    .line 93
    .line 94
    const/16 v8, 0x5a0

    .line 95
    .line 96
    const/16 v9, 0x22

    .line 97
    .line 98
    if-nez v3, :cond_3

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    if-ne v1, v9, :cond_4

    .line 102
    .line 103
    const-string v3, "motorola"

    .line 104
    .line 105
    sget-object v10, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v3, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_4

    .line 112
    .line 113
    const-string v3, "moto e5 play"

    .line 114
    .line 115
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v3, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_4

    .line 122
    .line 123
    new-instance v3, Landroid/util/Size;

    .line 124
    .line 125
    invoke-direct {v3, v8, v7}, Landroid/util/Size;-><init>(II)V

    .line 126
    .line 127
    .line 128
    new-instance v10, Landroid/util/Size;

    .line 129
    .line 130
    const/16 v11, 0x3c0

    .line 131
    .line 132
    invoke-direct {v10, v11, v6}, Landroid/util/Size;-><init>(II)V

    .line 133
    .line 134
    .line 135
    filled-new-array {v3, v10}, [Landroid/util/Size;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    goto :goto_0

    .line 140
    :cond_4
    new-array v3, v5, [Landroid/util/Size;

    .line 141
    .line 142
    :goto_0
    array-length v10, v3

    .line 143
    if-lez v10, :cond_5

    .line 144
    .line 145
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 150
    .line 151
    .line 152
    :cond_5
    :goto_1
    iget-object v0, v0, Lwc0;->c:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, Lr4;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    const-class v3, Landroidx/camera/camera2/internal/compat/quirk/ExcludedSupportedSizesQuirk;

    .line 160
    .line 161
    sget-object v10, Lf80;->a:Ler0;

    .line 162
    .line 163
    invoke-virtual {v10, v3}, Ler0;->h(Ljava/lang/Class;)Lh02;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    check-cast v3, Landroidx/camera/camera2/internal/compat/quirk/ExcludedSupportedSizesQuirk;

    .line 168
    .line 169
    if-nez v3, :cond_6

    .line 170
    .line 171
    new-instance v0, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 174
    .line 175
    .line 176
    goto/16 :goto_3

    .line 177
    .line 178
    :cond_6
    iget-object v0, v0, Lr4;->b:Ljava/lang/String;

    .line 179
    .line 180
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 181
    .line 182
    const-string v10, "OnePlus"

    .line 183
    .line 184
    invoke-virtual {v10, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result v11

    .line 188
    const/16 v12, 0xbb8

    .line 189
    .line 190
    const/16 v13, 0xfa0

    .line 191
    .line 192
    const/16 v14, 0xc30

    .line 193
    .line 194
    const/16 v15, 0x1040

    .line 195
    .line 196
    const/16 v5, 0x100

    .line 197
    .line 198
    const-string v8, "0"

    .line 199
    .line 200
    if-eqz v11, :cond_8

    .line 201
    .line 202
    const-string v11, "OnePlus6"

    .line 203
    .line 204
    sget-object v7, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v11, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    if-eqz v7, :cond_8

    .line 211
    .line 212
    new-instance v3, Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_7

    .line 222
    .line 223
    if-ne v1, v5, :cond_7

    .line 224
    .line 225
    new-instance v0, Landroid/util/Size;

    .line 226
    .line 227
    invoke-direct {v0, v15, v14}, Landroid/util/Size;-><init>(II)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    new-instance v0, Landroid/util/Size;

    .line 234
    .line 235
    invoke-direct {v0, v13, v12}, Landroid/util/Size;-><init>(II)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    :cond_7
    :goto_2
    move-object v0, v3

    .line 242
    goto/16 :goto_3

    .line 243
    .line 244
    :cond_8
    invoke-virtual {v10, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    if-eqz v7, :cond_9

    .line 249
    .line 250
    const-string v7, "OnePlus6T"

    .line 251
    .line 252
    sget-object v10, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {v7, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    if-eqz v7, :cond_9

    .line 259
    .line 260
    new-instance v3, Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_7

    .line 270
    .line 271
    if-ne v1, v5, :cond_7

    .line 272
    .line 273
    new-instance v0, Landroid/util/Size;

    .line 274
    .line 275
    invoke-direct {v0, v15, v14}, Landroid/util/Size;-><init>(II)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    new-instance v0, Landroid/util/Size;

    .line 282
    .line 283
    invoke-direct {v0, v13, v12}, Landroid/util/Size;-><init>(II)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_9
    const-string v7, "HUAWEI"

    .line 291
    .line 292
    invoke-virtual {v7, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 293
    .line 294
    .line 295
    move-result v7

    .line 296
    const/16 v10, 0x23

    .line 297
    .line 298
    if-eqz v7, :cond_b

    .line 299
    .line 300
    const-string v7, "HWANE"

    .line 301
    .line 302
    sget-object v11, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {v7, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 305
    .line 306
    .line 307
    move-result v7

    .line 308
    if-eqz v7, :cond_b

    .line 309
    .line 310
    new-instance v3, Ljava/util/ArrayList;

    .line 311
    .line 312
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_7

    .line 320
    .line 321
    if-eq v1, v9, :cond_a

    .line 322
    .line 323
    if-eq v1, v10, :cond_a

    .line 324
    .line 325
    goto :goto_2

    .line 326
    :cond_a
    new-instance v0, Landroid/util/Size;

    .line 327
    .line 328
    invoke-direct {v0, v6, v6}, Landroid/util/Size;-><init>(II)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    new-instance v0, Landroid/util/Size;

    .line 335
    .line 336
    const/16 v5, 0x190

    .line 337
    .line 338
    invoke-direct {v0, v5, v5}, Landroid/util/Size;-><init>(II)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    goto :goto_2

    .line 345
    :cond_b
    invoke-static {}, Landroidx/camera/camera2/internal/compat/quirk/ExcludedSupportedSizesQuirk;->c()Z

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    const-string v7, "1"

    .line 350
    .line 351
    const/16 v12, 0xcc0

    .line 352
    .line 353
    const/16 v14, 0x990

    .line 354
    .line 355
    const/16 v5, 0xc10

    .line 356
    .line 357
    const/16 v11, 0x1020

    .line 358
    .line 359
    const/16 v15, 0x72c

    .line 360
    .line 361
    const/16 v13, 0x912

    .line 362
    .line 363
    if-eqz v6, :cond_f

    .line 364
    .line 365
    new-instance v3, Ljava/util/ArrayList;

    .line 366
    .line 367
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v6

    .line 374
    if-eqz v6, :cond_d

    .line 375
    .line 376
    if-eq v1, v9, :cond_c

    .line 377
    .line 378
    if-ne v1, v10, :cond_7

    .line 379
    .line 380
    new-instance v0, Landroid/util/Size;

    .line 381
    .line 382
    invoke-direct {v0, v11, v13}, Landroid/util/Size;-><init>(II)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    new-instance v0, Landroid/util/Size;

    .line 389
    .line 390
    invoke-direct {v0, v5, v5}, Landroid/util/Size;-><init>(II)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    new-instance v0, Landroid/util/Size;

    .line 397
    .line 398
    invoke-direct {v0, v12, v14}, Landroid/util/Size;-><init>(II)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    new-instance v0, Landroid/util/Size;

    .line 405
    .line 406
    invoke-direct {v0, v12, v15}, Landroid/util/Size;-><init>(II)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    new-instance v0, Landroid/util/Size;

    .line 413
    .line 414
    const/16 v5, 0x800

    .line 415
    .line 416
    const/16 v6, 0x600

    .line 417
    .line 418
    invoke-direct {v0, v5, v6}, Landroid/util/Size;-><init>(II)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    new-instance v0, Landroid/util/Size;

    .line 425
    .line 426
    const/16 v6, 0x480

    .line 427
    .line 428
    invoke-direct {v0, v5, v6}, Landroid/util/Size;-><init>(II)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    new-instance v0, Landroid/util/Size;

    .line 435
    .line 436
    const/16 v5, 0x438

    .line 437
    .line 438
    const/16 v6, 0x780

    .line 439
    .line 440
    invoke-direct {v0, v6, v5}, Landroid/util/Size;-><init>(II)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    goto/16 :goto_2

    .line 447
    .line 448
    :cond_c
    new-instance v0, Landroid/util/Size;

    .line 449
    .line 450
    const/16 v6, 0xc18

    .line 451
    .line 452
    invoke-direct {v0, v11, v6}, Landroid/util/Size;-><init>(II)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    new-instance v0, Landroid/util/Size;

    .line 459
    .line 460
    invoke-direct {v0, v11, v13}, Landroid/util/Size;-><init>(II)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    new-instance v0, Landroid/util/Size;

    .line 467
    .line 468
    invoke-direct {v0, v5, v5}, Landroid/util/Size;-><init>(II)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    new-instance v0, Landroid/util/Size;

    .line 475
    .line 476
    invoke-direct {v0, v12, v14}, Landroid/util/Size;-><init>(II)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    new-instance v0, Landroid/util/Size;

    .line 483
    .line 484
    invoke-direct {v0, v12, v15}, Landroid/util/Size;-><init>(II)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    new-instance v0, Landroid/util/Size;

    .line 491
    .line 492
    const/16 v5, 0x800

    .line 493
    .line 494
    const/16 v6, 0x600

    .line 495
    .line 496
    invoke-direct {v0, v5, v6}, Landroid/util/Size;-><init>(II)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    new-instance v0, Landroid/util/Size;

    .line 503
    .line 504
    const/16 v6, 0x480

    .line 505
    .line 506
    invoke-direct {v0, v5, v6}, Landroid/util/Size;-><init>(II)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    new-instance v0, Landroid/util/Size;

    .line 513
    .line 514
    const/16 v5, 0x438

    .line 515
    .line 516
    const/16 v6, 0x780

    .line 517
    .line 518
    invoke-direct {v0, v6, v5}, Landroid/util/Size;-><init>(II)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    goto/16 :goto_2

    .line 525
    .line 526
    :cond_d
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    if-eqz v0, :cond_7

    .line 531
    .line 532
    if-eq v1, v9, :cond_e

    .line 533
    .line 534
    if-eq v1, v10, :cond_e

    .line 535
    .line 536
    goto/16 :goto_2

    .line 537
    .line 538
    :cond_e
    new-instance v0, Landroid/util/Size;

    .line 539
    .line 540
    invoke-direct {v0, v12, v14}, Landroid/util/Size;-><init>(II)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    new-instance v0, Landroid/util/Size;

    .line 547
    .line 548
    invoke-direct {v0, v12, v15}, Landroid/util/Size;-><init>(II)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    new-instance v0, Landroid/util/Size;

    .line 555
    .line 556
    invoke-direct {v0, v14, v14}, Landroid/util/Size;-><init>(II)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    new-instance v0, Landroid/util/Size;

    .line 563
    .line 564
    const/16 v6, 0x780

    .line 565
    .line 566
    invoke-direct {v0, v6, v6}, Landroid/util/Size;-><init>(II)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    new-instance v0, Landroid/util/Size;

    .line 573
    .line 574
    const/16 v5, 0x800

    .line 575
    .line 576
    const/16 v7, 0x600

    .line 577
    .line 578
    invoke-direct {v0, v5, v7}, Landroid/util/Size;-><init>(II)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    new-instance v0, Landroid/util/Size;

    .line 585
    .line 586
    const/16 v7, 0x480

    .line 587
    .line 588
    invoke-direct {v0, v5, v7}, Landroid/util/Size;-><init>(II)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    new-instance v0, Landroid/util/Size;

    .line 595
    .line 596
    const/16 v5, 0x438

    .line 597
    .line 598
    invoke-direct {v0, v6, v5}, Landroid/util/Size;-><init>(II)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    goto/16 :goto_2

    .line 605
    .line 606
    :cond_f
    invoke-static {}, Landroidx/camera/camera2/internal/compat/quirk/ExcludedSupportedSizesQuirk;->b()Z

    .line 607
    .line 608
    .line 609
    move-result v6

    .line 610
    if-eqz v6, :cond_13

    .line 611
    .line 612
    new-instance v3, Ljava/util/ArrayList;

    .line 613
    .line 614
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    move-result v6

    .line 621
    if-eqz v6, :cond_11

    .line 622
    .line 623
    if-eq v1, v9, :cond_10

    .line 624
    .line 625
    if-ne v1, v10, :cond_7

    .line 626
    .line 627
    new-instance v0, Landroid/util/Size;

    .line 628
    .line 629
    const/16 v5, 0x800

    .line 630
    .line 631
    const/16 v6, 0x600

    .line 632
    .line 633
    invoke-direct {v0, v5, v6}, Landroid/util/Size;-><init>(II)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    new-instance v0, Landroid/util/Size;

    .line 640
    .line 641
    const/16 v6, 0x480

    .line 642
    .line 643
    invoke-direct {v0, v5, v6}, Landroid/util/Size;-><init>(II)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 647
    .line 648
    .line 649
    new-instance v0, Landroid/util/Size;

    .line 650
    .line 651
    const/16 v5, 0x438

    .line 652
    .line 653
    const/16 v6, 0x780

    .line 654
    .line 655
    invoke-direct {v0, v6, v5}, Landroid/util/Size;-><init>(II)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    goto/16 :goto_2

    .line 662
    .line 663
    :cond_10
    new-instance v0, Landroid/util/Size;

    .line 664
    .line 665
    const/16 v6, 0xc18

    .line 666
    .line 667
    invoke-direct {v0, v11, v6}, Landroid/util/Size;-><init>(II)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    new-instance v0, Landroid/util/Size;

    .line 674
    .line 675
    invoke-direct {v0, v11, v13}, Landroid/util/Size;-><init>(II)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    new-instance v0, Landroid/util/Size;

    .line 682
    .line 683
    invoke-direct {v0, v5, v5}, Landroid/util/Size;-><init>(II)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    new-instance v0, Landroid/util/Size;

    .line 690
    .line 691
    invoke-direct {v0, v12, v14}, Landroid/util/Size;-><init>(II)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 695
    .line 696
    .line 697
    new-instance v0, Landroid/util/Size;

    .line 698
    .line 699
    invoke-direct {v0, v12, v15}, Landroid/util/Size;-><init>(II)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    new-instance v0, Landroid/util/Size;

    .line 706
    .line 707
    const/16 v5, 0x800

    .line 708
    .line 709
    const/16 v6, 0x600

    .line 710
    .line 711
    invoke-direct {v0, v5, v6}, Landroid/util/Size;-><init>(II)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    new-instance v0, Landroid/util/Size;

    .line 718
    .line 719
    const/16 v6, 0x480

    .line 720
    .line 721
    invoke-direct {v0, v5, v6}, Landroid/util/Size;-><init>(II)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 725
    .line 726
    .line 727
    new-instance v0, Landroid/util/Size;

    .line 728
    .line 729
    const/16 v5, 0x438

    .line 730
    .line 731
    const/16 v6, 0x780

    .line 732
    .line 733
    invoke-direct {v0, v6, v5}, Landroid/util/Size;-><init>(II)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 737
    .line 738
    .line 739
    goto/16 :goto_2

    .line 740
    .line 741
    :cond_11
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    move-result v0

    .line 745
    if-eqz v0, :cond_7

    .line 746
    .line 747
    if-eq v1, v9, :cond_12

    .line 748
    .line 749
    if-eq v1, v10, :cond_12

    .line 750
    .line 751
    goto/16 :goto_2

    .line 752
    .line 753
    :cond_12
    new-instance v0, Landroid/util/Size;

    .line 754
    .line 755
    const/16 v5, 0xa10

    .line 756
    .line 757
    const/16 v6, 0x78c

    .line 758
    .line 759
    invoke-direct {v0, v5, v6}, Landroid/util/Size;-><init>(II)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    new-instance v0, Landroid/util/Size;

    .line 766
    .line 767
    const/16 v5, 0xa00

    .line 768
    .line 769
    const/16 v6, 0x5a0

    .line 770
    .line 771
    invoke-direct {v0, v5, v6}, Landroid/util/Size;-><init>(II)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 775
    .line 776
    .line 777
    new-instance v0, Landroid/util/Size;

    .line 778
    .line 779
    const/16 v6, 0x780

    .line 780
    .line 781
    invoke-direct {v0, v6, v6}, Landroid/util/Size;-><init>(II)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    new-instance v0, Landroid/util/Size;

    .line 788
    .line 789
    const/16 v5, 0x800

    .line 790
    .line 791
    const/16 v7, 0x600

    .line 792
    .line 793
    invoke-direct {v0, v5, v7}, Landroid/util/Size;-><init>(II)V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 797
    .line 798
    .line 799
    new-instance v0, Landroid/util/Size;

    .line 800
    .line 801
    const/16 v7, 0x480

    .line 802
    .line 803
    invoke-direct {v0, v5, v7}, Landroid/util/Size;-><init>(II)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 807
    .line 808
    .line 809
    new-instance v0, Landroid/util/Size;

    .line 810
    .line 811
    const/16 v5, 0x438

    .line 812
    .line 813
    invoke-direct {v0, v6, v5}, Landroid/util/Size;-><init>(II)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 817
    .line 818
    .line 819
    goto/16 :goto_2

    .line 820
    .line 821
    :cond_13
    const-string v5, "REDMI"

    .line 822
    .line 823
    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 824
    .line 825
    .line 826
    move-result v3

    .line 827
    if-eqz v3, :cond_14

    .line 828
    .line 829
    const-string v3, "joyeuse"

    .line 830
    .line 831
    sget-object v5, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 832
    .line 833
    invoke-virtual {v3, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 834
    .line 835
    .line 836
    move-result v3

    .line 837
    if-eqz v3, :cond_14

    .line 838
    .line 839
    new-instance v3, Ljava/util/ArrayList;

    .line 840
    .line 841
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    move-result v0

    .line 848
    if-eqz v0, :cond_7

    .line 849
    .line 850
    const/16 v0, 0x100

    .line 851
    .line 852
    if-ne v1, v0, :cond_7

    .line 853
    .line 854
    new-instance v0, Landroid/util/Size;

    .line 855
    .line 856
    const/16 v5, 0x2440

    .line 857
    .line 858
    const/16 v6, 0x1b20

    .line 859
    .line 860
    invoke-direct {v0, v5, v6}, Landroid/util/Size;-><init>(II)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 864
    .line 865
    .line 866
    goto/16 :goto_2

    .line 867
    .line 868
    :cond_14
    const-string v0, "ExcludedSupportedSizesQuirk"

    .line 869
    .line 870
    const-string v3, "Cannot retrieve list of supported sizes to exclude on this device."

    .line 871
    .line 872
    invoke-static {v0, v3}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 876
    .line 877
    :goto_3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 878
    .line 879
    .line 880
    move-result v3

    .line 881
    if-eqz v3, :cond_15

    .line 882
    .line 883
    goto :goto_4

    .line 884
    :cond_15
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 885
    .line 886
    .line 887
    :goto_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 888
    .line 889
    .line 890
    move-result v0

    .line 891
    if-eqz v0, :cond_16

    .line 892
    .line 893
    const-string v0, "OutputSizesCorrector"

    .line 894
    .line 895
    const-string v3, "Sizes array becomes empty after excluding problematic output sizes."

    .line 896
    .line 897
    invoke-static {v0, v3}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 898
    .line 899
    .line 900
    :cond_16
    const/4 v0, 0x0

    .line 901
    new-array v0, v0, [Landroid/util/Size;

    .line 902
    .line 903
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    check-cast v0, [Landroid/util/Size;

    .line 908
    .line 909
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 910
    .line 911
    .line 912
    move-result-object v1

    .line 913
    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    invoke-virtual {v0}, [Landroid/util/Size;->clone()Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    check-cast v0, [Landroid/util/Size;

    .line 921
    .line 922
    return-object v0

    .line 923
    :cond_17
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 924
    .line 925
    const-string v2, "Retrieved output sizes array is null or empty for format "

    .line 926
    .line 927
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 931
    .line 932
    .line 933
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v0

    .line 937
    const-string v1, "StreamConfigurationMapCompat"

    .line 938
    .line 939
    invoke-static {v1, v0}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 940
    .line 941
    .line 942
    return-object v3
.end method

.method public s(D)D
    .locals 12

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpg-double v2, p1, v0

    .line 4
    .line 5
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 6
    .line 7
    if-gez v2, :cond_0

    .line 8
    .line 9
    move-wide p1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    cmpl-double v2, p1, v3

    .line 12
    .line 13
    if-lez v2, :cond_1

    .line 14
    .line 15
    move-wide p1, v3

    .line 16
    :cond_1
    :goto_0
    iget-object v2, p0, Lac1;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, [D

    .line 19
    .line 20
    invoke-static {v2, p1, p2}, Ljava/util/Arrays;->binarySearch([DD)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-lez v2, :cond_2

    .line 25
    .line 26
    return-wide v3

    .line 27
    :cond_2
    if-eqz v2, :cond_3

    .line 28
    .line 29
    neg-int v0, v2

    .line 30
    add-int/lit8 v1, v0, -0x1

    .line 31
    .line 32
    iget-object v2, p0, Lac1;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, [F

    .line 35
    .line 36
    aget v3, v2, v1

    .line 37
    .line 38
    add-int/lit8 v0, v0, -0x2

    .line 39
    .line 40
    aget v2, v2, v0

    .line 41
    .line 42
    sub-float/2addr v3, v2

    .line 43
    float-to-double v3, v3

    .line 44
    iget-object v5, p0, Lac1;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v5, [D

    .line 47
    .line 48
    aget-wide v6, v5, v1

    .line 49
    .line 50
    aget-wide v8, v5, v0

    .line 51
    .line 52
    sub-double/2addr v6, v8

    .line 53
    div-double/2addr v3, v6

    .line 54
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, [D

    .line 57
    .line 58
    aget-wide v0, p0, v0

    .line 59
    .line 60
    float-to-double v5, v2

    .line 61
    mul-double v10, v3, v8

    .line 62
    .line 63
    sub-double/2addr v5, v10

    .line 64
    sub-double v10, p1, v8

    .line 65
    .line 66
    mul-double/2addr v10, v5

    .line 67
    add-double/2addr v10, v0

    .line 68
    mul-double/2addr p1, p1

    .line 69
    mul-double/2addr v8, v8

    .line 70
    sub-double/2addr p1, v8

    .line 71
    mul-double/2addr p1, v3

    .line 72
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 73
    .line 74
    div-double/2addr p1, v0

    .line 75
    add-double/2addr p1, v10

    .line 76
    return-wide p1

    .line 77
    :cond_3
    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lac1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "pos ="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lac1;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, [D

    .line 21
    .line 22
    invoke-static {v1}, Ljava/util/Arrays;->toString([D)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, " period="

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lac1;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, [F

    .line 37
    .line 38
    invoke-static {p0}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const/16 v1, 0x20

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lac1;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const/16 v1, 0x7b

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object p0, p0, Lac1;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, Lwc0;

    .line 72
    .line 73
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, Lwc0;

    .line 76
    .line 77
    const-string v1, ""

    .line 78
    .line 79
    :goto_0
    if-eqz p0, :cond_1

    .line 80
    .line 81
    iget-object v2, p0, Lwc0;->b:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    if-eqz v2, :cond_0

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_0

    .line 97
    .line 98
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-static {v1}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    const/4 v3, 0x1

    .line 111
    sub-int/2addr v2, v3

    .line 112
    invoke-virtual {v0, v1, v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    :goto_1
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p0, Lwc0;

    .line 122
    .line 123
    const-string v1, ", "

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    const/16 p0, 0x7d

    .line 127
    .line 128
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public u(Ljava/lang/String;Lvv1;)Lyv1;
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
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-static {p0, p1, p2}, Lac1;->x(Ljava/util/LinkedHashMap;Ljava/lang/String;Lvv1;)Lyv1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public v(Lzy2;)Ljava/util/ArrayList;
    .locals 12

    .line 1
    iget-object v0, p0, Lac1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lxp;

    .line 4
    .line 5
    move-object v1, p1

    .line 6
    check-cast v1, Ljw0;

    .line 7
    .line 8
    sget-object v2, Ljw0;->B:Llf;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-interface {v1, v2, v3}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ljava/util/List;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    new-instance v4, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v4, v3

    .line 26
    :goto_0
    if-eqz v4, :cond_1

    .line 27
    .line 28
    return-object v4

    .line 29
    :cond_1
    sget-object v2, Ljw0;->A:Llf;

    .line 30
    .line 31
    invoke-interface {v1, v2, v3}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lq32;

    .line 36
    .line 37
    sget-object v4, Ljw0;->z:Llf;

    .line 38
    .line 39
    invoke-interface {v1, v4, v3}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {p1}, Lhw0;->l()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v4, :cond_3

    .line 50
    .line 51
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_3

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, Landroid/util/Pair;

    .line 66
    .line 67
    iget-object v7, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v7, Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-ne v7, v5, :cond_2

    .line 76
    .line 77
    iget-object v4, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v4, [Landroid/util/Size;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move-object v4, v3

    .line 83
    :goto_1
    if-nez v4, :cond_4

    .line 84
    .line 85
    move-object v4, v3

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    :goto_2
    if-nez v4, :cond_5

    .line 92
    .line 93
    invoke-interface {v0, v5}, Lxp;->g(I)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 100
    .line 101
    .line 102
    new-instance v4, Lhx;

    .line 103
    .line 104
    const/4 v6, 0x1

    .line 105
    invoke-direct {v4, v6}, Lhx;-><init>(Z)V

    .line 106
    .line 107
    .line 108
    invoke-static {v0, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_6

    .line 116
    .line 117
    new-instance v4, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    const-string v7, "The retrieved supported resolutions from camera info internal is empty. Format is "

    .line 120
    .line 121
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v5, "."

    .line 128
    .line 129
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    const-string v5, "SupportedOutputSizesCollector"

    .line 137
    .line 138
    invoke-static {v5, v4}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :cond_6
    const/4 v4, 0x0

    .line 142
    if-nez v2, :cond_19

    .line 143
    .line 144
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, Laj2;

    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_7

    .line 156
    .line 157
    return-object v0

    .line 158
    :cond_7
    new-instance v1, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 161
    .line 162
    .line 163
    new-instance v0, Lhx;

    .line 164
    .line 165
    invoke-direct {v0, v6}, Lhx;-><init>(Z)V

    .line 166
    .line 167
    .line 168
    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 169
    .line 170
    .line 171
    new-instance v0, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 174
    .line 175
    .line 176
    check-cast p1, Ljw0;

    .line 177
    .line 178
    sget-object v2, Ljw0;->y:Llf;

    .line 179
    .line 180
    invoke-interface {p1, v2, v3}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Landroid/util/Size;

    .line 185
    .line 186
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    check-cast v4, Landroid/util/Size;

    .line 191
    .line 192
    if-eqz v2, :cond_8

    .line 193
    .line 194
    invoke-static {v4}, Lue2;->a(Landroid/util/Size;)I

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    mul-int/2addr v8, v7

    .line 207
    if-ge v5, v8, :cond_9

    .line 208
    .line 209
    :cond_8
    move-object v2, v4

    .line 210
    :cond_9
    invoke-virtual {p0, p1}, Laj2;->a(Ljw0;)Landroid/util/Size;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    sget-object v5, Lue2;->b:Landroid/util/Size;

    .line 215
    .line 216
    invoke-static {v5}, Lue2;->a(Landroid/util/Size;)I

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    invoke-static {v2}, Lue2;->a(Landroid/util/Size;)I

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    if-ge v8, v7, :cond_a

    .line 225
    .line 226
    sget-object v5, Lue2;->a:Landroid/util/Size;

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_a
    if-eqz v4, :cond_b

    .line 230
    .line 231
    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    .line 236
    .line 237
    .line 238
    move-result v9

    .line 239
    mul-int/2addr v9, v8

    .line 240
    if-ge v9, v7, :cond_b

    .line 241
    .line 242
    move-object v5, v4

    .line 243
    :cond_b
    :goto_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    :cond_c
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    if-eqz v8, :cond_d

    .line 252
    .line 253
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    check-cast v8, Landroid/util/Size;

    .line 258
    .line 259
    invoke-static {v8}, Lue2;->a(Landroid/util/Size;)I

    .line 260
    .line 261
    .line 262
    move-result v9

    .line 263
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 268
    .line 269
    .line 270
    move-result v11

    .line 271
    mul-int/2addr v11, v10

    .line 272
    if-gt v9, v11, :cond_c

    .line 273
    .line 274
    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    invoke-virtual {v8}, Landroid/util/Size;->getHeight()I

    .line 279
    .line 280
    .line 281
    move-result v10

    .line 282
    mul-int/2addr v10, v9

    .line 283
    invoke-static {v5}, Lue2;->a(Landroid/util/Size;)I

    .line 284
    .line 285
    .line 286
    move-result v9

    .line 287
    if-lt v10, v9, :cond_c

    .line 288
    .line 289
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    if-nez v9, :cond_c

    .line 294
    .line 295
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 300
    .line 301
    .line 302
    move-result v7

    .line 303
    if-nez v7, :cond_18

    .line 304
    .line 305
    sget-object v1, Ljw0;->q:Llf;

    .line 306
    .line 307
    invoke-interface {p1, v1}, Lx02;->h(Llf;)Z

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    if-eqz v2, :cond_e

    .line 312
    .line 313
    invoke-interface {p1, v1}, Lx02;->e(Llf;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    check-cast v1, Ljava/lang/Integer;

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    iget-boolean v2, p0, Laj2;->d:Z

    .line 324
    .line 325
    invoke-static {v1, v2}, Lac1;->w(IZ)Landroid/util/Rational;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    goto :goto_5

    .line 330
    :cond_e
    invoke-virtual {p0, p1}, Laj2;->a(Ljw0;)Landroid/util/Size;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    if-eqz v1, :cond_11

    .line 335
    .line 336
    invoke-static {v0}, Lac1;->t(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    :cond_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v5

    .line 348
    if-eqz v5, :cond_10

    .line 349
    .line 350
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    check-cast v5, Landroid/util/Rational;

    .line 355
    .line 356
    invoke-static {v5, v1}, Lsd;->a(Landroid/util/Rational;Landroid/util/Size;)Z

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    if-eqz v7, :cond_f

    .line 361
    .line 362
    move-object v1, v5

    .line 363
    goto :goto_5

    .line 364
    :cond_10
    new-instance v2, Landroid/util/Rational;

    .line 365
    .line 366
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 367
    .line 368
    .line 369
    move-result v5

    .line 370
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    invoke-direct {v2, v5, v1}, Landroid/util/Rational;-><init>(II)V

    .line 375
    .line 376
    .line 377
    move-object v1, v2

    .line 378
    goto :goto_5

    .line 379
    :cond_11
    move-object v1, v3

    .line 380
    :goto_5
    if-nez v4, :cond_12

    .line 381
    .line 382
    sget-object v2, Ljw0;->x:Llf;

    .line 383
    .line 384
    invoke-interface {p1, v2, v3}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    move-object v4, p1

    .line 389
    check-cast v4, Landroid/util/Size;

    .line 390
    .line 391
    :cond_12
    new-instance p1, Ljava/util/ArrayList;

    .line 392
    .line 393
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 394
    .line 395
    .line 396
    new-instance v2, Ljava/util/HashMap;

    .line 397
    .line 398
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 399
    .line 400
    .line 401
    if-nez v1, :cond_13

    .line 402
    .line 403
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 404
    .line 405
    .line 406
    if-eqz v4, :cond_17

    .line 407
    .line 408
    invoke-static {p1, v4, v6}, Lac1;->M(Ljava/util/List;Landroid/util/Size;Z)V

    .line 409
    .line 410
    .line 411
    return-object p1

    .line 412
    :cond_13
    invoke-static {v0}, Lac1;->B(Ljava/util/ArrayList;)Ljava/util/HashMap;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    if-eqz v4, :cond_14

    .line 417
    .line 418
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 427
    .line 428
    .line 429
    move-result v3

    .line 430
    if-eqz v3, :cond_14

    .line 431
    .line 432
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v3

    .line 436
    check-cast v3, Landroid/util/Rational;

    .line 437
    .line 438
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    check-cast v3, Ljava/util/List;

    .line 443
    .line 444
    invoke-static {v3, v4, v6}, Lac1;->M(Ljava/util/List;Landroid/util/Size;Z)V

    .line 445
    .line 446
    .line 447
    goto :goto_6

    .line 448
    :cond_14
    new-instance v2, Ljava/util/ArrayList;

    .line 449
    .line 450
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 455
    .line 456
    .line 457
    new-instance v3, Lrd;

    .line 458
    .line 459
    iget-object p0, p0, Laj2;->c:Landroid/util/Rational;

    .line 460
    .line 461
    invoke-direct {v3, v1, p0}, Lrd;-><init>(Landroid/util/Rational;Landroid/util/Rational;)V

    .line 462
    .line 463
    .line 464
    invoke-static {v2, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 468
    .line 469
    .line 470
    move-result-object p0

    .line 471
    :cond_15
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 472
    .line 473
    .line 474
    move-result v1

    .line 475
    if-eqz v1, :cond_17

    .line 476
    .line 477
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    check-cast v1, Landroid/util/Rational;

    .line 482
    .line 483
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    check-cast v1, Ljava/util/List;

    .line 488
    .line 489
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    :cond_16
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 494
    .line 495
    .line 496
    move-result v2

    .line 497
    if-eqz v2, :cond_15

    .line 498
    .line 499
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    check-cast v2, Landroid/util/Size;

    .line 504
    .line 505
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v3

    .line 509
    if-nez v3, :cond_16

    .line 510
    .line 511
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    goto :goto_7

    .line 515
    :cond_17
    return-object p1

    .line 516
    :cond_18
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 517
    .line 518
    new-instance p1, Ljava/lang/StringBuilder;

    .line 519
    .line 520
    const-string v0, "All supported output sizes are filtered out according to current resolution selection settings. \nminSize = "

    .line 521
    .line 522
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    const-string v0, "\nmaxSize = "

    .line 529
    .line 530
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    const-string v0, "\ninitial size list: "

    .line 537
    .line 538
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object p1

    .line 548
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    throw p0

    .line 552
    :cond_19
    move-object v2, p1

    .line 553
    check-cast v2, Ljw0;

    .line 554
    .line 555
    sget-object v5, Ljw0;->y:Llf;

    .line 556
    .line 557
    invoke-interface {v2, v5, v3}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    check-cast v2, Landroid/util/Size;

    .line 562
    .line 563
    invoke-interface {v1}, Ljw0;->s()I

    .line 564
    .line 565
    .line 566
    sget-object v3, Lzy2;->N:Llf;

    .line 567
    .line 568
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 569
    .line 570
    invoke-interface {p1, v3, v5}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v3

    .line 574
    check-cast v3, Ljava/lang/Boolean;

    .line 575
    .line 576
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 577
    .line 578
    .line 579
    move-result v3

    .line 580
    if-nez v3, :cond_1a

    .line 581
    .line 582
    invoke-interface {p1}, Lhw0;->l()I

    .line 583
    .line 584
    .line 585
    :cond_1a
    sget-object p1, Ljw0;->A:Llf;

    .line 586
    .line 587
    invoke-interface {v1, p1}, Lx02;->e(Llf;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object p1

    .line 591
    check-cast p1, Lq32;

    .line 592
    .line 593
    iget-object p0, p0, Lac1;->c:Ljava/lang/Object;

    .line 594
    .line 595
    check-cast p0, Landroid/util/Rational;

    .line 596
    .line 597
    iget-object v1, p1, Lq32;->a:Lxt0;

    .line 598
    .line 599
    invoke-static {v0}, Lac1;->B(Ljava/util/ArrayList;)Ljava/util/HashMap;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    if-eqz p0, :cond_1b

    .line 604
    .line 605
    invoke-virtual {p0}, Landroid/util/Rational;->getNumerator()I

    .line 606
    .line 607
    .line 608
    move-result v3

    .line 609
    invoke-virtual {p0}, Landroid/util/Rational;->getDenominator()I

    .line 610
    .line 611
    .line 612
    move-result v5

    .line 613
    if-lt v3, v5, :cond_1c

    .line 614
    .line 615
    :cond_1b
    move v3, v6

    .line 616
    goto :goto_8

    .line 617
    :cond_1c
    move v3, v4

    .line 618
    :goto_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    invoke-static {v4, v3}, Lac1;->w(IZ)Landroid/util/Rational;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    new-instance v3, Ljava/util/ArrayList;

    .line 626
    .line 627
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 628
    .line 629
    .line 630
    move-result-object v5

    .line 631
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 632
    .line 633
    .line 634
    new-instance v5, Lrd;

    .line 635
    .line 636
    invoke-direct {v5, v1, p0}, Lrd;-><init>(Landroid/util/Rational;Landroid/util/Rational;)V

    .line 637
    .line 638
    .line 639
    invoke-static {v3, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 640
    .line 641
    .line 642
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 643
    .line 644
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 652
    .line 653
    .line 654
    move-result v3

    .line 655
    if-eqz v3, :cond_1d

    .line 656
    .line 657
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v3

    .line 661
    check-cast v3, Landroid/util/Rational;

    .line 662
    .line 663
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v5

    .line 667
    check-cast v5, Ljava/util/List;

    .line 668
    .line 669
    invoke-virtual {p0, v3, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    goto :goto_9

    .line 673
    :cond_1d
    if-eqz v2, :cond_20

    .line 674
    .line 675
    sget-object v0, Lue2;->a:Landroid/util/Size;

    .line 676
    .line 677
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 678
    .line 679
    .line 680
    move-result v0

    .line 681
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 682
    .line 683
    .line 684
    move-result v1

    .line 685
    mul-int/2addr v1, v0

    .line 686
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 695
    .line 696
    .line 697
    move-result v2

    .line 698
    if-eqz v2, :cond_20

    .line 699
    .line 700
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    check-cast v2, Landroid/util/Rational;

    .line 705
    .line 706
    invoke-virtual {p0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v2

    .line 710
    check-cast v2, Ljava/util/List;

    .line 711
    .line 712
    new-instance v3, Ljava/util/ArrayList;

    .line 713
    .line 714
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 715
    .line 716
    .line 717
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 718
    .line 719
    .line 720
    move-result-object v5

    .line 721
    :cond_1e
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 722
    .line 723
    .line 724
    move-result v7

    .line 725
    if-eqz v7, :cond_1f

    .line 726
    .line 727
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v7

    .line 731
    check-cast v7, Landroid/util/Size;

    .line 732
    .line 733
    invoke-static {v7}, Lue2;->a(Landroid/util/Size;)I

    .line 734
    .line 735
    .line 736
    move-result v8

    .line 737
    if-gt v8, v1, :cond_1e

    .line 738
    .line 739
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    goto :goto_b

    .line 743
    :cond_1f
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 744
    .line 745
    .line 746
    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 747
    .line 748
    .line 749
    goto :goto_a

    .line 750
    :cond_20
    iget-object p1, p1, Lq32;->b:Lr32;

    .line 751
    .line 752
    if-nez p1, :cond_21

    .line 753
    .line 754
    goto :goto_d

    .line 755
    :cond_21
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    :cond_22
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 764
    .line 765
    .line 766
    move-result v1

    .line 767
    if-eqz v1, :cond_29

    .line 768
    .line 769
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v1

    .line 773
    check-cast v1, Landroid/util/Rational;

    .line 774
    .line 775
    invoke-virtual {p0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    check-cast v1, Ljava/util/List;

    .line 780
    .line 781
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 782
    .line 783
    .line 784
    move-result v2

    .line 785
    if-eqz v2, :cond_23

    .line 786
    .line 787
    goto :goto_c

    .line 788
    :cond_23
    iget v2, p1, Lr32;->b:I

    .line 789
    .line 790
    sget-object v3, Lr32;->c:Lr32;

    .line 791
    .line 792
    if-eq p1, v3, :cond_22

    .line 793
    .line 794
    iget-object v3, p1, Lr32;->a:Landroid/util/Size;

    .line 795
    .line 796
    if-eqz v2, :cond_28

    .line 797
    .line 798
    if-eq v2, v6, :cond_27

    .line 799
    .line 800
    const/4 v5, 0x2

    .line 801
    if-eq v2, v5, :cond_26

    .line 802
    .line 803
    const/4 v5, 0x3

    .line 804
    if-eq v2, v5, :cond_25

    .line 805
    .line 806
    const/4 v5, 0x4

    .line 807
    if-eq v2, v5, :cond_24

    .line 808
    .line 809
    goto :goto_c

    .line 810
    :cond_24
    invoke-static {v1, v3, v4}, Lac1;->N(Ljava/util/List;Landroid/util/Size;Z)V

    .line 811
    .line 812
    .line 813
    goto :goto_c

    .line 814
    :cond_25
    invoke-static {v1, v3, v6}, Lac1;->N(Ljava/util/List;Landroid/util/Size;Z)V

    .line 815
    .line 816
    .line 817
    goto :goto_c

    .line 818
    :cond_26
    invoke-static {v1, v3, v4}, Lac1;->M(Ljava/util/List;Landroid/util/Size;Z)V

    .line 819
    .line 820
    .line 821
    goto :goto_c

    .line 822
    :cond_27
    invoke-static {v1, v3, v6}, Lac1;->M(Ljava/util/List;Landroid/util/Size;Z)V

    .line 823
    .line 824
    .line 825
    goto :goto_c

    .line 826
    :cond_28
    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 827
    .line 828
    .line 829
    move-result v2

    .line 830
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 831
    .line 832
    .line 833
    if-eqz v2, :cond_22

    .line 834
    .line 835
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    goto :goto_c

    .line 839
    :cond_29
    :goto_d
    new-instance p1, Ljava/util/ArrayList;

    .line 840
    .line 841
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 842
    .line 843
    .line 844
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 845
    .line 846
    .line 847
    move-result-object p0

    .line 848
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 849
    .line 850
    .line 851
    move-result-object p0

    .line 852
    :cond_2a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 853
    .line 854
    .line 855
    move-result v0

    .line 856
    if-eqz v0, :cond_2c

    .line 857
    .line 858
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    check-cast v0, Ljava/util/List;

    .line 863
    .line 864
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    :cond_2b
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 869
    .line 870
    .line 871
    move-result v1

    .line 872
    if-eqz v1, :cond_2a

    .line 873
    .line 874
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v1

    .line 878
    check-cast v1, Landroid/util/Size;

    .line 879
    .line 880
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 881
    .line 882
    .line 883
    move-result v2

    .line 884
    if-nez v2, :cond_2b

    .line 885
    .line 886
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 887
    .line 888
    .line 889
    goto :goto_e

    .line 890
    :cond_2c
    return-object p1
.end method

.method public y()Ljava/util/ArrayList;
    .locals 7

    .line 1
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/util/Map$Entry;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Ljava/lang/String;

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/util/Map;

    .line 45
    .line 46
    new-instance v3, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_0

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Ljava/util/Map$Entry;

    .line 74
    .line 75
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, Lyv1;

    .line 84
    .line 85
    invoke-virtual {v4}, Lyv1;->getCurrentState()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    new-instance v6, Lkotlin/Pair;

    .line 94
    .line 95
    invoke-direct {v6, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_0
    invoke-static {v3}, Loc1;->g(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    new-instance v3, Lou1;

    .line 107
    .line 108
    invoke-direct {v3, v2, v1}, Lou1;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_1
    return-object v0
.end method

.method public z(DD)D
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lac1;->s(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    add-double/2addr p0, p3

    .line 6
    const-wide p2, 0x401921fb54442d18L    # 6.283185307179586

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    mul-double/2addr p0, p2

    .line 12
    invoke-static {p0, p1}, Ljava/lang/Math;->sin(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide p0

    .line 16
    return-wide p0
.end method

.method public zza()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lac1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljd3;

    .line 4
    .line 5
    invoke-interface {v0}, Ljd3;->zza()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lac1;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljd3;

    .line 12
    .line 13
    invoke-interface {v1}, Ljd3;->zza()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ldf3;

    .line 18
    .line 19
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lpi3;

    .line 22
    .line 23
    iget-object p0, p0, Lpi3;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lqf3;

    .line 26
    .line 27
    iget-object p0, p0, Lqf3;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Landroid/content/Context;

    .line 30
    .line 31
    new-instance v2, Lyg3;

    .line 32
    .line 33
    check-cast v0, Lwq3;

    .line 34
    .line 35
    invoke-direct {v2, v0, v1, p0}, Lyg3;-><init>(Lwq3;Ldf3;Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    return-object v2
.end method
