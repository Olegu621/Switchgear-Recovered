.class Lcom/google/android/gms/internal/drive/zzjm;
.super Lcom/google/android/gms/internal/drive/zzjl;


# instance fields
.field protected final zzny:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/drive/zzjl;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzjm;->zzny:[B

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/drive/zzjc;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjm;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    move-object v3, p1

    .line 16
    check-cast v3, Lcom/google/android/gms/internal/drive/zzjc;

    .line 17
    .line 18
    invoke-virtual {v3}, Lcom/google/android/gms/internal/drive/zzjc;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eq v1, v3, :cond_2

    .line 23
    .line 24
    return v2

    .line 25
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjm;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    return v0

    .line 32
    :cond_3
    instance-of v0, p1, Lcom/google/android/gms/internal/drive/zzjm;

    .line 33
    .line 34
    if-eqz v0, :cond_5

    .line 35
    .line 36
    check-cast p1, Lcom/google/android/gms/internal/drive/zzjm;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjc;->zzbv()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p1}, Lcom/google/android/gms/internal/drive/zzjc;->zzbv()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    if-eq v0, v1, :cond_4

    .line 51
    .line 52
    return v2

    .line 53
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjm;->size()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/drive/zzjm;->zza(Lcom/google/android/gms/internal/drive/zzjc;II)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    return p0

    .line 62
    :cond_5
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzjm;->zzny:[B

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public final zza(III)I
    .locals 0

    .line 91
    iget-object p2, p0, Lcom/google/android/gms/internal/drive/zzjm;->zzny:[B

    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjm;->zzbw()I

    move-result p0

    invoke-static {p1, p2, p0, p3}, Lcom/google/android/gms/internal/drive/zzkm;->zza(I[BII)I

    move-result p0

    return p0
.end method

.method public final zza(II)Lcom/google/android/gms/internal/drive/zzjc;
    .locals 1

    const/4 p1, 0x0

    .line 88
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjm;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/drive/zzjc;->zzb(III)I

    move-result p1

    if-nez p1, :cond_0

    .line 89
    sget-object p0, Lcom/google/android/gms/internal/drive/zzjc;->zznq:Lcom/google/android/gms/internal/drive/zzjc;

    return-object p0

    .line 90
    :cond_0
    new-instance p2, Lcom/google/android/gms/internal/drive/zzjh;

    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzjm;->zzny:[B

    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjm;->zzbw()I

    move-result p0

    invoke-direct {p2, v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzjh;-><init>([BII)V

    return-object p2
.end method

.method public final zza(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 3

    .line 87
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzjm;->zzny:[B

    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjm;->zzbw()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjm;->size()I

    move-result p0

    invoke-direct {v0, v1, v2, p0, p1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public final zza(Lcom/google/android/gms/internal/drive/zzjb;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzjm;->zzny:[B

    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjm;->zzbw()I

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjm;->size()I

    move-result p0

    invoke-virtual {p1, v0, v1, p0}, Lcom/google/android/gms/internal/drive/zzjb;->zza([BII)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/drive/zzjc;II)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/drive/zzjc;->size()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x0

    .line 6
    if-gt p3, p2, :cond_4

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/drive/zzjc;->size()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-gt p3, p2, :cond_3

    .line 13
    .line 14
    instance-of p2, p1, Lcom/google/android/gms/internal/drive/zzjm;

    .line 15
    .line 16
    if-eqz p2, :cond_2

    .line 17
    .line 18
    check-cast p1, Lcom/google/android/gms/internal/drive/zzjm;

    .line 19
    .line 20
    iget-object p2, p0, Lcom/google/android/gms/internal/drive/zzjm;->zzny:[B

    .line 21
    .line 22
    iget-object v1, p1, Lcom/google/android/gms/internal/drive/zzjm;->zzny:[B

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjm;->zzbw()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, p3

    .line 29
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjm;->zzbw()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-virtual {p1}, Lcom/google/android/gms/internal/drive/zzjm;->zzbw()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    :goto_0
    if-ge p0, v2, :cond_1

    .line 38
    .line 39
    aget-byte p3, p2, p0

    .line 40
    .line 41
    aget-byte v3, v1, p1

    .line 42
    .line 43
    if-eq p3, v3, :cond_0

    .line 44
    .line 45
    return v0

    .line 46
    :cond_0
    add-int/lit8 p0, p0, 0x1

    .line 47
    .line 48
    add-int/lit8 p1, p1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 p0, 0x1

    .line 52
    return p0

    .line 53
    :cond_2
    invoke-virtual {p1, v0, p3}, Lcom/google/android/gms/internal/drive/zzjc;->zza(II)Lcom/google/android/gms/internal/drive/zzjc;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0, v0, p3}, Lcom/google/android/gms/internal/drive/zzjm;->zza(II)Lcom/google/android/gms/internal/drive/zzjc;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/drive/zzjc;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    return p0

    .line 66
    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/drive/zzjc;->size()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    const/16 p1, 0x3b

    .line 71
    .line 72
    invoke-static {p1, p3, p0}, Lpk3;->c(III)V

    .line 73
    .line 74
    .line 75
    return v0

    .line 76
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjm;->size()I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    const/16 p1, 0x28

    .line 81
    .line 82
    invoke-static {p1, p3, p0}, Lpk3;->j(III)V

    .line 83
    .line 84
    .line 85
    return v0
.end method

.method public final zzbu()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjm;->zzbw()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzjm;->zzny:[B

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjm;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    add-int/2addr p0, v0

    .line 12
    invoke-static {v1, v0, p0}, Lcom/google/android/gms/internal/drive/zznf;->zze([BII)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public zzbw()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public zzs(I)B
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzjm;->zzny:[B

    .line 2
    .line 3
    aget-byte p0, p0, p1

    .line 4
    .line 5
    return p0
.end method

.method public zzt(I)B
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzjm;->zzny:[B

    .line 2
    .line 3
    aget-byte p0, p0, p1

    .line 4
    .line 5
    return p0
.end method
