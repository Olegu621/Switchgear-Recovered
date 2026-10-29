.class final Lcom/google/android/gms/internal/drive/zzjr$zza;
.super Lcom/google/android/gms/internal/drive/zzjr;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/drive/zzjr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zza"
.end annotation


# instance fields
.field private final buffer:[B

.field private final limit:I

.field private final offset:I

.field private position:I


# direct methods
.method public constructor <init>([BII)V
    .locals 2

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzjr;-><init>(Lcom/google/android/gms/internal/drive/zzjs;)V

    .line 3
    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    sub-int/2addr v0, p3

    .line 9
    or-int/2addr v0, p3

    .line 10
    const/4 v1, 0x0

    .line 11
    if-ltz v0, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->buffer:[B

    .line 14
    .line 15
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->offset:I

    .line 16
    .line 17
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 18
    .line 19
    iput p3, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->limit:I

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    array-length p0, p1

    .line 23
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    filled-new-array {p0, p1, p3}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string p1, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"

    .line 40
    .line 41
    invoke-static {p1, p0}, Lio/sentry/u2;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    throw p2

    .line 45
    :cond_1
    const-string p0, "buffer"

    .line 46
    .line 47
    invoke-static {p0}, Ln4;->s(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p2
.end method

.method private final write([BII)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->buffer:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 4
    .line 5
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 6
    .line 7
    .line 8
    iget p1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 9
    .line 10
    add-int/2addr p1, p3

    .line 11
    iput p1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception p1

    .line 15
    new-instance p2, Lcom/google/android/gms/internal/drive/zzjr$zzb;

    .line 16
    .line 17
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->limit:I

    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    filled-new-array {v0, p0, p3}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string p3, "Pos: %d, limit: %d, len: %d"

    .line 38
    .line 39
    invoke-static {p3, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {p2, p0, p1}, Lcom/google/android/gms/internal/drive/zzjr$zzb;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw p2
.end method


# virtual methods
.method public final zza(IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 37
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzb(II)V

    .line 38
    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzl(J)V

    return-void
.end method

.method public final zza(ILcom/google/android/gms/internal/drive/zzjc;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 33
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzb(II)V

    .line 34
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zza(Lcom/google/android/gms/internal/drive/zzjc;)V

    return-void
.end method

.method public final zza(ILcom/google/android/gms/internal/drive/zzlq;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x3

    .line 39
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzb(II)V

    const/4 v2, 0x2

    .line 40
    invoke-virtual {p0, v2, p1}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzd(II)V

    .line 41
    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzb(II)V

    .line 42
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzb(Lcom/google/android/gms/internal/drive/zzlq;)V

    const/4 p1, 0x4

    .line 43
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzb(II)V

    return-void
.end method

.method public final zza(ILcom/google/android/gms/internal/drive/zzlq;Lcom/google/android/gms/internal/drive/zzmf;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzb(II)V

    .line 3
    .line 4
    .line 5
    move-object p1, p2

    .line 6
    check-cast p1, Lcom/google/android/gms/internal/drive/zzit;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/drive/zzit;->zzbm()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, -0x1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-interface {p3, p1}, Lcom/google/android/gms/internal/drive/zzmf;->zzn(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/drive/zzit;->zzo(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzy(I)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzjr;->zzoh:Lcom/google/android/gms/internal/drive/zzjt;

    .line 26
    .line 27
    invoke-interface {p3, p2, p0}, Lcom/google/android/gms/internal/drive/zzmf;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final zza(ILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 31
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzb(II)V

    .line 32
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzl(Ljava/lang/String;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/drive/zzjc;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 35
    invoke-virtual {p1}, Lcom/google/android/gms/internal/drive/zzjc;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzy(I)V

    .line 36
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/drive/zzjc;->zza(Lcom/google/android/gms/internal/drive/zzjb;)V

    return-void
.end method

.method public final zza([BII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 44
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/drive/zzjr$zza;->write([BII)V

    return-void
.end method

.method public final zzaa(I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->buffer:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 8
    .line 9
    int-to-byte v3, p1

    .line 10
    aput-byte v3, v0, v1

    .line 11
    .line 12
    add-int/lit8 v3, v1, 0x2

    .line 13
    .line 14
    iput v3, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 15
    .line 16
    shr-int/lit8 v4, p1, 0x8

    .line 17
    .line 18
    int-to-byte v4, v4

    .line 19
    aput-byte v4, v0, v2

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0x3

    .line 22
    .line 23
    iput v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 24
    .line 25
    shr-int/lit8 v4, p1, 0x10

    .line 26
    .line 27
    int-to-byte v4, v4

    .line 28
    aput-byte v4, v0, v3

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x4

    .line 31
    .line 32
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 33
    .line 34
    ushr-int/lit8 p1, p1, 0x18

    .line 35
    .line 36
    int-to-byte p1, p1

    .line 37
    aput-byte p1, v0, v2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception p1

    .line 41
    new-instance v0, Lcom/google/android/gms/internal/drive/zzjr$zzb;

    .line 42
    .line 43
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 44
    .line 45
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->limit:I

    .line 50
    .line 51
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const/4 v2, 0x1

    .line 56
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    filled-new-array {v1, p0, v2}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string v1, "Pos: %d, limit: %d, len: %d"

    .line 65
    .line 66
    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzjr$zzb;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    throw v0
.end method

.method public final zzb(II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    .line 20
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzy(I)V

    return-void
.end method

.method public final zzb(ILcom/google/android/gms/internal/drive/zzjc;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x3

    .line 3
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzb(II)V

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    invoke-virtual {p0, v2, p1}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzd(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1, p2}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zza(ILcom/google/android/gms/internal/drive/zzjc;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x4

    .line 14
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzb(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final zzb(IZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzb(II)V

    int-to-byte p1, p2

    .line 19
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzc(B)V

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/drive/zzlq;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 21
    invoke-interface {p1}, Lcom/google/android/gms/internal/drive/zzlq;->zzcx()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzy(I)V

    .line 22
    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/drive/zzlq;->zzb(Lcom/google/android/gms/internal/drive/zzjr;)V

    return-void
.end method

.method public final zzc(B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->buffer:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 8
    .line 9
    aput-byte p1, v0, v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception p1

    .line 13
    new-instance v0, Lcom/google/android/gms/internal/drive/zzjr$zzb;

    .line 14
    .line 15
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->limit:I

    .line 22
    .line 23
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    filled-new-array {v1, p0, v2}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string v1, "Pos: %d, limit: %d, len: %d"

    .line 37
    .line 38
    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzjr$zzb;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    throw v0
.end method

.method public final zzc(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 48
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzb(II)V

    .line 49
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzx(I)V

    return-void
.end method

.method public final zzc(IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 46
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzb(II)V

    .line 47
    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzn(J)V

    return-void
.end method

.method public final zzca()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->limit:I

    .line 2
    .line 3
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
.end method

.method public final zzd(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzb(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzy(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final zzd([BII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzy(I)V

    const/4 p2, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/drive/zzjr$zza;->write([BII)V

    return-void
.end method

.method public final zzf(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzb(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzaa(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final zzl(J)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzjr;->zzcc()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x7

    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    const-wide/16 v4, -0x80

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzca()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v6, 0xa

    .line 17
    .line 18
    if-lt v0, v6, :cond_1

    .line 19
    .line 20
    :goto_0
    and-long v6, p1, v4

    .line 21
    .line 22
    cmp-long v0, v6, v2

    .line 23
    .line 24
    iget-object v6, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->buffer:[B

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 29
    .line 30
    add-int/lit8 v1, v0, 0x1

    .line 31
    .line 32
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 33
    .line 34
    int-to-long v0, v0

    .line 35
    long-to-int p0, p1

    .line 36
    int-to-byte p0, p0

    .line 37
    invoke-static {v6, v0, v1, p0}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 42
    .line 43
    add-int/lit8 v7, v0, 0x1

    .line 44
    .line 45
    iput v7, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 46
    .line 47
    int-to-long v7, v0

    .line 48
    long-to-int v0, p1

    .line 49
    and-int/lit8 v0, v0, 0x7f

    .line 50
    .line 51
    or-int/lit16 v0, v0, 0x80

    .line 52
    .line 53
    int-to-byte v0, v0

    .line 54
    invoke-static {v6, v7, v8, v0}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 55
    .line 56
    .line 57
    ushr-long/2addr p1, v1

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    :goto_1
    and-long v6, p1, v4

    .line 60
    .line 61
    cmp-long v0, v6, v2

    .line 62
    .line 63
    iget-object v6, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->buffer:[B

    .line 64
    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 68
    .line 69
    add-int/lit8 v1, v0, 0x1

    .line 70
    .line 71
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 72
    .line 73
    long-to-int p1, p1

    .line 74
    int-to-byte p1, p1

    .line 75
    aput-byte p1, v6, v0

    .line 76
    .line 77
    return-void

    .line 78
    :catch_0
    move-exception p1

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 81
    .line 82
    add-int/lit8 v7, v0, 0x1

    .line 83
    .line 84
    iput v7, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 85
    .line 86
    long-to-int v7, p1

    .line 87
    and-int/lit8 v7, v7, 0x7f

    .line 88
    .line 89
    or-int/lit16 v7, v7, 0x80

    .line 90
    .line 91
    int-to-byte v7, v7

    .line 92
    aput-byte v7, v6, v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    .line 94
    ushr-long/2addr p1, v1

    .line 95
    goto :goto_1

    .line 96
    :goto_2
    new-instance p2, Lcom/google/android/gms/internal/drive/zzjr$zzb;

    .line 97
    .line 98
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 99
    .line 100
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->limit:I

    .line 105
    .line 106
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    const/4 v1, 0x1

    .line 111
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    filled-new-array {v0, p0, v1}, [Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    const-string v0, "Pos: %d, limit: %d, len: %d"

    .line 120
    .line 121
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-direct {p2, p0, p1}, Lcom/google/android/gms/internal/drive/zzjr$zzb;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    throw p2
.end method

.method public final zzl(Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 129
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 130
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    .line 131
    invoke-static {v1}, Lcom/google/android/gms/internal/drive/zzjr;->zzad(I)I

    move-result v1

    .line 132
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/drive/zzjr;->zzad(I)I

    move-result v2

    if-ne v2, v1, :cond_0

    add-int v1, v0, v2

    .line 133
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 134
    iget-object v3, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->buffer:[B

    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzca()I

    move-result v4

    invoke-static {p1, v3, v1, v4}, Lcom/google/android/gms/internal/drive/zznf;->zza(Ljava/lang/CharSequence;[BII)I

    move-result v1

    .line 135
    iput v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    sub-int v3, v1, v0

    sub-int/2addr v3, v2

    .line 136
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzy(I)V

    .line 137
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    return-void

    :catch_0
    move-exception v1

    goto :goto_0

    .line 138
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/drive/zznf;->zza(Ljava/lang/CharSequence;)I

    move-result v1

    .line 139
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzy(I)V

    .line 140
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->buffer:[B

    iget v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzca()I

    move-result v3

    invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/internal/drive/zznf;->zza(Ljava/lang/CharSequence;[BII)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I
    :try_end_0
    .catch Lcom/google/android/gms/internal/drive/zznj; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :catch_1
    move-exception p0

    .line 141
    new-instance p1, Lcom/google/android/gms/internal/drive/zzjr$zzb;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/drive/zzjr$zzb;-><init>(Ljava/lang/Throwable;)V

    throw p1

    .line 142
    :goto_0
    iput v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 143
    invoke-virtual {p0, p1, v1}, Lcom/google/android/gms/internal/drive/zzjr;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/drive/zznj;)V

    return-void
.end method

.method public final zzn(J)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->buffer:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 8
    .line 9
    long-to-int v3, p1

    .line 10
    int-to-byte v3, v3

    .line 11
    aput-byte v3, v0, v1

    .line 12
    .line 13
    add-int/lit8 v3, v1, 0x2

    .line 14
    .line 15
    iput v3, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 16
    .line 17
    const/16 v4, 0x8

    .line 18
    .line 19
    shr-long v5, p1, v4

    .line 20
    .line 21
    long-to-int v5, v5

    .line 22
    int-to-byte v5, v5

    .line 23
    aput-byte v5, v0, v2

    .line 24
    .line 25
    add-int/lit8 v2, v1, 0x3

    .line 26
    .line 27
    iput v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 28
    .line 29
    const/16 v5, 0x10

    .line 30
    .line 31
    shr-long v5, p1, v5

    .line 32
    .line 33
    long-to-int v5, v5

    .line 34
    int-to-byte v5, v5

    .line 35
    aput-byte v5, v0, v3

    .line 36
    .line 37
    add-int/lit8 v3, v1, 0x4

    .line 38
    .line 39
    iput v3, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 40
    .line 41
    const/16 v5, 0x18

    .line 42
    .line 43
    shr-long v5, p1, v5

    .line 44
    .line 45
    long-to-int v5, v5

    .line 46
    int-to-byte v5, v5

    .line 47
    aput-byte v5, v0, v2

    .line 48
    .line 49
    add-int/lit8 v2, v1, 0x5

    .line 50
    .line 51
    iput v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 52
    .line 53
    const/16 v5, 0x20

    .line 54
    .line 55
    shr-long v5, p1, v5

    .line 56
    .line 57
    long-to-int v5, v5

    .line 58
    int-to-byte v5, v5

    .line 59
    aput-byte v5, v0, v3

    .line 60
    .line 61
    add-int/lit8 v3, v1, 0x6

    .line 62
    .line 63
    iput v3, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 64
    .line 65
    const/16 v5, 0x28

    .line 66
    .line 67
    shr-long v5, p1, v5

    .line 68
    .line 69
    long-to-int v5, v5

    .line 70
    int-to-byte v5, v5

    .line 71
    aput-byte v5, v0, v2

    .line 72
    .line 73
    add-int/lit8 v2, v1, 0x7

    .line 74
    .line 75
    iput v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 76
    .line 77
    const/16 v5, 0x30

    .line 78
    .line 79
    shr-long v5, p1, v5

    .line 80
    .line 81
    long-to-int v5, v5

    .line 82
    int-to-byte v5, v5

    .line 83
    aput-byte v5, v0, v3

    .line 84
    .line 85
    add-int/2addr v1, v4

    .line 86
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 87
    .line 88
    const/16 v1, 0x38

    .line 89
    .line 90
    shr-long/2addr p1, v1

    .line 91
    long-to-int p1, p1

    .line 92
    int-to-byte p1, p1

    .line 93
    aput-byte p1, v0, v2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    return-void

    .line 96
    :catch_0
    move-exception p1

    .line 97
    new-instance p2, Lcom/google/android/gms/internal/drive/zzjr$zzb;

    .line 98
    .line 99
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 100
    .line 101
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->limit:I

    .line 106
    .line 107
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    const/4 v1, 0x1

    .line 112
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    filled-new-array {v0, p0, v1}, [Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    const-string v0, "Pos: %d, limit: %d, len: %d"

    .line 121
    .line 122
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-direct {p2, p0, p1}, Lcom/google/android/gms/internal/drive/zzjr$zzb;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    throw p2
.end method

.method public final zzx(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzy(I)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    int-to-long v0, p1

    .line 8
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzl(J)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final zzy(I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzjr;->zzcc()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzix;->zzbr()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjr$zza;->zzca()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x5

    .line 18
    if-lt v0, v1, :cond_4

    .line 19
    .line 20
    and-int/lit8 v0, p1, -0x80

    .line 21
    .line 22
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->buffer:[B

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 27
    .line 28
    add-int/lit8 v2, v0, 0x1

    .line 29
    .line 30
    iput v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 31
    .line 32
    int-to-long v2, v0

    .line 33
    int-to-byte p0, p1

    .line 34
    invoke-static {v1, v2, v3, p0}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 39
    .line 40
    add-int/lit8 v2, v0, 0x1

    .line 41
    .line 42
    iput v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 43
    .line 44
    int-to-long v2, v0

    .line 45
    or-int/lit16 v0, p1, 0x80

    .line 46
    .line 47
    int-to-byte v0, v0

    .line 48
    invoke-static {v1, v2, v3, v0}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 49
    .line 50
    .line 51
    ushr-int/lit8 v0, p1, 0x7

    .line 52
    .line 53
    and-int/lit8 v1, v0, -0x80

    .line 54
    .line 55
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->buffer:[B

    .line 56
    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    iget p1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 60
    .line 61
    add-int/lit8 v1, p1, 0x1

    .line 62
    .line 63
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 64
    .line 65
    int-to-long p0, p1

    .line 66
    int-to-byte v0, v0

    .line 67
    invoke-static {v2, p0, p1, v0}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 72
    .line 73
    add-int/lit8 v3, v1, 0x1

    .line 74
    .line 75
    iput v3, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 76
    .line 77
    int-to-long v3, v1

    .line 78
    or-int/lit16 v0, v0, 0x80

    .line 79
    .line 80
    int-to-byte v0, v0

    .line 81
    invoke-static {v2, v3, v4, v0}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 82
    .line 83
    .line 84
    ushr-int/lit8 v0, p1, 0xe

    .line 85
    .line 86
    and-int/lit8 v1, v0, -0x80

    .line 87
    .line 88
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->buffer:[B

    .line 89
    .line 90
    if-nez v1, :cond_2

    .line 91
    .line 92
    iget p1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 93
    .line 94
    add-int/lit8 v1, p1, 0x1

    .line 95
    .line 96
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 97
    .line 98
    int-to-long p0, p1

    .line 99
    int-to-byte v0, v0

    .line 100
    invoke-static {v2, p0, p1, v0}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_2
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 105
    .line 106
    add-int/lit8 v3, v1, 0x1

    .line 107
    .line 108
    iput v3, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 109
    .line 110
    int-to-long v3, v1

    .line 111
    or-int/lit16 v0, v0, 0x80

    .line 112
    .line 113
    int-to-byte v0, v0

    .line 114
    invoke-static {v2, v3, v4, v0}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 115
    .line 116
    .line 117
    ushr-int/lit8 v0, p1, 0x15

    .line 118
    .line 119
    and-int/lit8 v1, v0, -0x80

    .line 120
    .line 121
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->buffer:[B

    .line 122
    .line 123
    if-nez v1, :cond_3

    .line 124
    .line 125
    iget p1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 126
    .line 127
    add-int/lit8 v1, p1, 0x1

    .line 128
    .line 129
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 130
    .line 131
    int-to-long p0, p1

    .line 132
    int-to-byte v0, v0

    .line 133
    invoke-static {v2, p0, p1, v0}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_3
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 138
    .line 139
    add-int/lit8 v3, v1, 0x1

    .line 140
    .line 141
    iput v3, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 142
    .line 143
    int-to-long v3, v1

    .line 144
    or-int/lit16 v0, v0, 0x80

    .line 145
    .line 146
    int-to-byte v0, v0

    .line 147
    invoke-static {v2, v3, v4, v0}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 148
    .line 149
    .line 150
    ushr-int/lit8 p1, p1, 0x1c

    .line 151
    .line 152
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->buffer:[B

    .line 153
    .line 154
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 155
    .line 156
    add-int/lit8 v2, v1, 0x1

    .line 157
    .line 158
    iput v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 159
    .line 160
    int-to-long v1, v1

    .line 161
    int-to-byte p0, p1

    .line 162
    invoke-static {v0, v1, v2, p0}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_4
    :goto_0
    and-int/lit8 v0, p1, -0x80

    .line 167
    .line 168
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->buffer:[B

    .line 169
    .line 170
    if-nez v0, :cond_5

    .line 171
    .line 172
    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 173
    .line 174
    add-int/lit8 v2, v0, 0x1

    .line 175
    .line 176
    iput v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 177
    .line 178
    int-to-byte p1, p1

    .line 179
    aput-byte p1, v1, v0

    .line 180
    .line 181
    return-void

    .line 182
    :catch_0
    move-exception p1

    .line 183
    goto :goto_1

    .line 184
    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 185
    .line 186
    add-int/lit8 v2, v0, 0x1

    .line 187
    .line 188
    iput v2, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 189
    .line 190
    and-int/lit8 v2, p1, 0x7f

    .line 191
    .line 192
    or-int/lit16 v2, v2, 0x80

    .line 193
    .line 194
    int-to-byte v2, v2

    .line 195
    aput-byte v2, v1, v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 196
    .line 197
    ushr-int/lit8 p1, p1, 0x7

    .line 198
    .line 199
    goto :goto_0

    .line 200
    :goto_1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzjr$zzb;

    .line 201
    .line 202
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->position:I

    .line 203
    .line 204
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzjr$zza;->limit:I

    .line 209
    .line 210
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    const/4 v2, 0x1

    .line 215
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    filled-new-array {v1, p0, v2}, [Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    const-string v1, "Pos: %d, limit: %d, len: %d"

    .line 224
    .line 225
    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzjr$zzb;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    throw v0
.end method
