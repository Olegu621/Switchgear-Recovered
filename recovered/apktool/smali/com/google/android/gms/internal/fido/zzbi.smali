.class final Lcom/google/android/gms/internal/fido/zzbi;
.super Lcom/google/android/gms/internal/fido/zzbk;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field final zza:[C


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance p1, Lcom/google/android/gms/internal/fido/zzbh;

    .line 2
    .line 3
    const/16 p2, 0x10

    .line 4
    .line 5
    new-array v0, p2, [C

    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    .line 10
    const-string v1, "base16()"

    .line 11
    .line 12
    invoke-direct {p1, v1, v0}, Lcom/google/android/gms/internal/fido/zzbh;-><init>(Ljava/lang/String;[C)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/fido/zzbk;-><init>(Lcom/google/android/gms/internal/fido/zzbh;Ljava/lang/Character;)V

    .line 17
    .line 18
    .line 19
    const/16 v0, 0x200

    .line 20
    .line 21
    new-array v0, v0, [C

    .line 22
    .line 23
    iput-object v0, p0, Lcom/google/android/gms/internal/fido/zzbi;->zza:[C

    .line 24
    .line 25
    invoke-static {p1}, Lcom/google/android/gms/internal/fido/zzbh;->zzc(Lcom/google/android/gms/internal/fido/zzbh;)[C

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    array-length v0, v0

    .line 30
    const/4 v1, 0x0

    .line 31
    if-ne v0, p2, :cond_0

    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move p2, v1

    .line 36
    :goto_0
    invoke-static {p2}, Lcom/google/android/gms/internal/fido/zzas;->zzc(Z)V

    .line 37
    .line 38
    .line 39
    :goto_1
    const/16 p2, 0x100

    .line 40
    .line 41
    if-ge v1, p2, :cond_1

    .line 42
    .line 43
    iget-object p2, p0, Lcom/google/android/gms/internal/fido/zzbi;->zza:[C

    .line 44
    .line 45
    ushr-int/lit8 v0, v1, 0x4

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/fido/zzbh;->zza(I)C

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    aput-char v0, p2, v1

    .line 52
    .line 53
    iget-object p2, p0, Lcom/google/android/gms/internal/fido/zzbi;->zza:[C

    .line 54
    .line 55
    or-int/lit16 v0, v1, 0x100

    .line 56
    .line 57
    and-int/lit8 v2, v1, 0xf

    .line 58
    .line 59
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/fido/zzbh;->zza(I)C

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    aput-char v2, p2, v0

    .line 64
    .line 65
    add-int/lit8 v1, v1, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    return-void

    .line 69
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


# virtual methods
.method public final zza(Ljava/lang/Appendable;[BII)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    array-length p3, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    invoke-static {v0, p4, p3}, Lcom/google/android/gms/internal/fido/zzas;->zze(III)V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-ge v0, p4, :cond_0

    .line 7
    .line 8
    aget-byte p3, p2, v0

    .line 9
    .line 10
    and-int/lit16 p3, p3, 0xff

    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/android/gms/internal/fido/zzbi;->zza:[C

    .line 13
    .line 14
    aget-char v1, v1, p3

    .line 15
    .line 16
    invoke-interface {p1, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/google/android/gms/internal/fido/zzbi;->zza:[C

    .line 20
    .line 21
    or-int/lit16 p3, p3, 0x100

    .line 22
    .line 23
    aget-char p3, v1, p3

    .line 24
    .line 25
    invoke-interface {p1, p3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 26
    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method
