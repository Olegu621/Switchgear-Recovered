.class public abstract Lcom/google/android/recaptcha/internal/zzpp;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static final zza:Lcom/google/android/recaptcha/internal/zzpp;

.field private static final zzb:Lcom/google/android/recaptcha/internal/zzpp;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzpm;

    .line 2
    .line 3
    const/16 v1, 0x3d

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "base64()"

    .line 10
    .line 11
    const-string v3, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    .line 12
    .line 13
    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/recaptcha/internal/zzpm;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lcom/google/android/recaptcha/internal/zzpp;->zza:Lcom/google/android/recaptcha/internal/zzpp;

    .line 17
    .line 18
    new-instance v0, Lcom/google/android/recaptcha/internal/zzpm;

    .line 19
    .line 20
    const-string v2, "base64Url()"

    .line 21
    .line 22
    const-string v3, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"

    .line 23
    .line 24
    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/recaptcha/internal/zzpm;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/google/android/recaptcha/internal/zzpp;->zzb:Lcom/google/android/recaptcha/internal/zzpp;

    .line 28
    .line 29
    new-instance v0, Lcom/google/android/recaptcha/internal/zzpo;

    .line 30
    .line 31
    const-string v2, "base32()"

    .line 32
    .line 33
    const-string v3, "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"

    .line 34
    .line 35
    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/recaptcha/internal/zzpo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lcom/google/android/recaptcha/internal/zzpo;

    .line 39
    .line 40
    const-string v2, "base32Hex()"

    .line 41
    .line 42
    const-string v3, "0123456789ABCDEFGHIJKLMNOPQRSTUV"

    .line 43
    .line 44
    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/recaptcha/internal/zzpo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    .line 45
    .line 46
    .line 47
    sget v0, Lcom/google/android/recaptcha/internal/zzpl;->zza:I

    .line 48
    .line 49
    new-instance v0, Lcom/google/android/recaptcha/internal/zzpk;

    .line 50
    .line 51
    const/16 v1, 0x10

    .line 52
    .line 53
    new-array v2, v1, [C

    .line 54
    .line 55
    fill-array-data v2, :array_0

    .line 56
    .line 57
    .line 58
    const-string v3, "base16()"

    .line 59
    .line 60
    invoke-direct {v0, v3, v2}, Lcom/google/android/recaptcha/internal/zzpk;-><init>(Ljava/lang/String;[C)V

    .line 61
    .line 62
    .line 63
    new-instance v2, Lcom/google/android/recaptcha/internal/zzpo;

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    invoke-direct {v2, v0, v3}, Lcom/google/android/recaptcha/internal/zzpo;-><init>(Lcom/google/android/recaptcha/internal/zzpk;Ljava/lang/Character;)V

    .line 67
    .line 68
    .line 69
    const/16 v2, 0x200

    .line 70
    .line 71
    new-array v2, v2, [C

    .line 72
    .line 73
    invoke-static {v0}, Lcom/google/android/recaptcha/internal/zzpk;->zze(Lcom/google/android/recaptcha/internal/zzpk;)[C

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    array-length v3, v3

    .line 78
    const/4 v4, 0x0

    .line 79
    if-ne v3, v1, :cond_0

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    move v1, v4

    .line 84
    :goto_0
    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzmd;->zza(Z)V

    .line 85
    .line 86
    .line 87
    :goto_1
    const/16 v1, 0x100

    .line 88
    .line 89
    if-ge v4, v1, :cond_1

    .line 90
    .line 91
    ushr-int/lit8 v1, v4, 0x4

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzpk;->zza(I)C

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    aput-char v1, v2, v4

    .line 98
    .line 99
    or-int/lit16 v1, v4, 0x100

    .line 100
    .line 101
    and-int/lit8 v3, v4, 0xf

    .line 102
    .line 103
    invoke-virtual {v0, v3}, Lcom/google/android/recaptcha/internal/zzpk;->zza(I)C

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    aput-char v3, v2, v1

    .line 108
    .line 109
    add-int/lit8 v4, v4, 0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    return-void

    .line 113
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static zzg()Lcom/google/android/recaptcha/internal/zzpp;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzpp;->zza:Lcom/google/android/recaptcha/internal/zzpp;

    .line 2
    .line 3
    return-object v0
.end method

.method public static zzh()Lcom/google/android/recaptcha/internal/zzpp;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzpp;->zzb:Lcom/google/android/recaptcha/internal/zzpp;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public abstract zza([BLjava/lang/CharSequence;)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/recaptcha/internal/zzpn;
        }
    .end annotation
.end method

.method public abstract zzb(Ljava/lang/Appendable;[BII)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract zzc(I)I
.end method

.method public abstract zzd(I)I
.end method

.method public zze(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final zzi([BII)Ljava/lang/String;
    .locals 2

    .line 1
    array-length p2, p1

    .line 2
    const/4 v0, 0x0

    .line 3
    invoke-static {v0, p3, p2}, Lcom/google/android/recaptcha/internal/zzmd;->zzd(III)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-virtual {p0, p3}, Lcom/google/android/recaptcha/internal/zzpp;->zzd(I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p0, p2, p1, v0, p3}, Lcom/google/android/recaptcha/internal/zzpp;->zzb(Ljava/lang/Appendable;[BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :catch_0
    move-exception p0

    .line 24
    invoke-static {p0}, Ln4;->g(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public final zzj(Ljava/lang/CharSequence;)[B
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzpp;->zze(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0, v0}, Lcom/google/android/recaptcha/internal/zzpp;->zzc(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-array v1, v0, [B

    .line 14
    .line 15
    invoke-virtual {p0, v1, p1}, Lcom/google/android/recaptcha/internal/zzpp;->zza([BLjava/lang/CharSequence;)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-ne p0, v0, :cond_0

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_0
    new-array p1, p0, [B

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-static {v1, v0, p1, v0, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Lcom/google/android/recaptcha/internal/zzpn; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :catch_0
    move-exception p0

    .line 30
    invoke-static {p0}, Ln4;->n(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method
