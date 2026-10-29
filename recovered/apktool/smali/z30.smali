.class public abstract Lz30;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lcom/google/android/gms/common/data/DataHolder;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lz30;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-ltz p2, :cond_0

    .line 11
    .line 12
    iget v1, p1, Lcom/google/android/gms/common/data/DataHolder;->v:I

    .line 13
    .line 14
    if-ge p2, v1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    :cond_0
    invoke-static {v0}, Lkb1;->r(Z)V

    .line 18
    .line 19
    .line 20
    iput p2, p0, Lz30;->b:I

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lcom/google/android/gms/common/data/DataHolder;->H1(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput p1, p0, Lz30;->c:I

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget v0, p0, Lz30;->c:I

    .line 2
    .line 3
    iget-object v1, p0, Lz30;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 4
    .line 5
    iget p0, p0, Lz30;->b:I

    .line 6
    .line 7
    invoke-virtual {v1, p0, v0, p1}, Lcom/google/android/gms/common/data/DataHolder;->D1(IILjava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final b(Ljava/lang/String;)F
    .locals 3

    .line 1
    iget-object v0, p0, Lz30;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 2
    .line 3
    iget v1, p0, Lz30;->b:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/common/data/DataHolder;->I1(ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lcom/google/android/gms/common/data/DataHolder;->d:[Landroid/database/CursorWindow;

    .line 9
    .line 10
    iget p0, p0, Lz30;->c:I

    .line 11
    .line 12
    aget-object p0, v2, p0

    .line 13
    .line 14
    iget-object v0, v0, Lcom/google/android/gms/common/data/DataHolder;->c:Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0, v1, p1}, Landroid/database/CursorWindow;->getFloat(II)F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public final d(Ljava/lang/String;)I
    .locals 2

    .line 1
    iget v0, p0, Lz30;->c:I

    .line 2
    .line 3
    iget-object v1, p0, Lz30;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 4
    .line 5
    iget p0, p0, Lz30;->b:I

    .line 6
    .line 7
    invoke-virtual {v1, p0, v0, p1}, Lcom/google/android/gms/common/data/DataHolder;->E1(IILjava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final e(Ljava/lang/String;)J
    .locals 2

    .line 1
    iget v0, p0, Lz30;->c:I

    .line 2
    .line 3
    iget-object v1, p0, Lz30;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 4
    .line 5
    iget p0, p0, Lz30;->b:I

    .line 6
    .line 7
    invoke-virtual {v1, p0, v0, p1}, Lcom/google/android/gms/common/data/DataHolder;->F1(IILjava/lang/String;)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lz30;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lz30;

    .line 7
    .line 8
    iget v0, p1, Lz30;->b:I

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v2, p0, Lz30;->b:I

    .line 15
    .line 16
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v0, v2}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget v0, p1, Lz30;->c:I

    .line 27
    .line 28
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget v2, p0, Lz30;->c:I

    .line 33
    .line 34
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v0, v2}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    iget-object p1, p1, Lz30;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 45
    .line 46
    iget-object p0, p0, Lz30;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 47
    .line 48
    if-ne p1, p0, :cond_0

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    return p0

    .line 52
    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lz30;->b:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lz30;->c:I

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object p0, p0, Lz30;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 14
    .line 15
    filled-new-array {v0, v1, p0}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public final j(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lz30;->c:I

    .line 2
    .line 3
    iget-object v1, p0, Lz30;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 4
    .line 5
    iget p0, p0, Lz30;->b:I

    .line 6
    .line 7
    invoke-virtual {v1, p0, v0, p1}, Lcom/google/android/gms/common/data/DataHolder;->G1(IILjava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final r(Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lz30;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/gms/common/data/DataHolder;->c:Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final u(Ljava/lang/String;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lz30;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 2
    .line 3
    iget v1, p0, Lz30;->b:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/common/data/DataHolder;->I1(ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lcom/google/android/gms/common/data/DataHolder;->d:[Landroid/database/CursorWindow;

    .line 9
    .line 10
    iget p0, p0, Lz30;->c:I

    .line 11
    .line 12
    aget-object p0, v2, p0

    .line 13
    .line 14
    iget-object v0, v0, Lcom/google/android/gms/common/data/DataHolder;->c:Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0, v1, p1}, Landroid/database/CursorWindow;->isNull(II)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public final w(Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .line 1
    iget v0, p0, Lz30;->c:I

    .line 2
    .line 3
    iget-object v1, p0, Lz30;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 4
    .line 5
    iget p0, p0, Lz30;->b:I

    .line 6
    .line 7
    invoke-virtual {v1, p0, v0, p1}, Lcom/google/android/gms/common/data/DataHolder;->G1(IILjava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
