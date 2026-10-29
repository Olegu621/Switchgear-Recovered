.class public final Loh2;
.super Lhu0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lj11;


# instance fields
.field public final e:Lb11;

.field public final f:I

.field public final g:Lkn;

.field public final h:Lb5;

.field public i:I

.field public j:Ld5;

.field public final k:Lwl0;


# direct methods
.method public constructor <init>(Lb11;ILkn;Lkotlinx/serialization/descriptors/SerialDescriptor;Ld5;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Loh2;->e:Lb11;

    .line 10
    .line 11
    iput p2, p0, Loh2;->f:I

    .line 12
    .line 13
    iput-object p3, p0, Loh2;->g:Lkn;

    .line 14
    .line 15
    iget-object p2, p1, Lb11;->b:Lb5;

    .line 16
    .line 17
    iput-object p2, p0, Loh2;->h:Lb5;

    .line 18
    .line 19
    const/4 p2, -0x1

    .line 20
    iput p2, p0, Loh2;->i:I

    .line 21
    .line 22
    iput-object p5, p0, Loh2;->j:Ld5;

    .line 23
    .line 24
    iget-object p1, p1, Lb11;->a:Lwl0;

    .line 25
    .line 26
    iput-object p1, p0, Loh2;->k:Lwl0;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    throw p0
.end method


# virtual methods
.method public final A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p4, p0, Loh2;->g:Lkn;

    .line 2
    .line 3
    iget-object p4, p4, Lkn;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p4, Lbx0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget p1, p0, Loh2;->f:I

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    and-int/lit8 p1, p2, 0x1

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    move p1, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    const/4 p2, -0x2

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object v0, p4, Lbx0;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, [I

    .line 32
    .line 33
    iget v2, p4, Lbx0;->c:I

    .line 34
    .line 35
    aget v0, v0, v2

    .line 36
    .line 37
    if-ne v0, p2, :cond_1

    .line 38
    .line 39
    iget-object v0, p4, Lbx0;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, [Ljava/lang/Object;

    .line 42
    .line 43
    sget-object v3, Ldc0;->U:Ldc0;

    .line 44
    .line 45
    aput-object v3, v0, v2

    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0, p3}, Loh2;->u(Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    iget-object p1, p4, Lbx0;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, [I

    .line 56
    .line 57
    iget p3, p4, Lbx0;->c:I

    .line 58
    .line 59
    aget p1, p1, p3

    .line 60
    .line 61
    if-eq p1, p2, :cond_2

    .line 62
    .line 63
    add-int/2addr p3, v1

    .line 64
    iput p3, p4, Lbx0;->c:I

    .line 65
    .line 66
    iget-object p1, p4, Lbx0;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, [Ljava/lang/Object;

    .line 69
    .line 70
    array-length v0, p1

    .line 71
    if-ne p3, v0, :cond_2

    .line 72
    .line 73
    mul-int/lit8 p3, p3, 0x2

    .line 74
    .line 75
    invoke-static {p1, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p4, Lbx0;->b:Ljava/lang/Object;

    .line 80
    .line 81
    iget-object p1, p4, Lbx0;->d:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, [I

    .line 84
    .line 85
    invoke-static {p1, p3}, Ljava/util/Arrays;->copyOf([II)[I

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p4, Lbx0;->d:Ljava/lang/Object;

    .line 90
    .line 91
    :cond_2
    iget-object p1, p4, Lbx0;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p1, [Ljava/lang/Object;

    .line 94
    .line 95
    iget p3, p4, Lbx0;->c:I

    .line 96
    .line 97
    aput-object p0, p1, p3

    .line 98
    .line 99
    iget-object p1, p4, Lbx0;->d:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, [I

    .line 102
    .line 103
    aput p2, p1, p3

    .line 104
    .line 105
    :cond_3
    return-object p0
.end method

.method public final B()B
    .locals 5

    .line 1
    iget-object p0, p0, Loh2;->g:Lkn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkn;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int v2, v0

    .line 8
    int-to-byte v2, v2

    .line 9
    int-to-long v3, v2

    .line 10
    cmp-long v3, v0, v3

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v3, "Failed to parse byte for input \'"

    .line 18
    .line 19
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v0, 0x27

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    const/4 v2, 0x6

    .line 36
    invoke-static {p0, v0, v1, v2}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    throw p0
.end method

.method public final C()S
    .locals 5

    .line 1
    iget-object p0, p0, Loh2;->g:Lkn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkn;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int v2, v0

    .line 8
    int-to-short v2, v2

    .line 9
    int-to-long v3, v2

    .line 10
    cmp-long v3, v0, v3

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v3, "Failed to parse short for input \'"

    .line 18
    .line 19
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v0, 0x27

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    const/4 v2, 0x6

    .line 36
    invoke-static {p0, v0, v1, v2}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    throw p0
.end method

.method public final D()F
    .locals 4

    .line 1
    iget-object p0, p0, Loh2;->g:Lkn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkn;->j()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :try_start_0
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 9
    .line 10
    .line 11
    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    return v0

    .line 25
    :cond_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p0, v0}, Lkb1;->R(Lkn;Ljava/lang/Number;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :catch_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v3, "Failed to parse type \'float\' for input \'"

    .line 36
    .line 37
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 v0, 0x27

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const/4 v2, 0x0

    .line 53
    const/4 v3, 0x6

    .line 54
    invoke-static {p0, v0, v2, v3}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 55
    .line 56
    .line 57
    throw v1
.end method

.method public final E()D
    .locals 4

    .line 1
    iget-object p0, p0, Loh2;->g:Lkn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkn;->j()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :try_start_0
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 9
    .line 10
    .line 11
    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    invoke-static {v2, v3}, Ljava/lang/Double;->isInfinite(D)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    return-wide v2

    .line 25
    :cond_0
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p0, v0}, Lkb1;->R(Lkn;Ljava/lang/Number;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :catch_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v3, "Failed to parse type \'double\' for input \'"

    .line 36
    .line 37
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 v0, 0x27

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const/4 v2, 0x0

    .line 53
    const/4 v3, 0x6

    .line 54
    invoke-static {p0, v0, v2, v3}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 55
    .line 56
    .line 57
    throw v1
.end method

.method public final a()Lb5;
    .locals 0

    .line 1
    iget-object p0, p0, Loh2;->h:Lb5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Loh2;->e:Lb11;

    .line 5
    .line 6
    iget-object v0, v0, Lb11;->a:Lwl0;

    .line 7
    .line 8
    iget-boolean v0, v0, Lwl0;->c:Z

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p1}, Lkotlinx/serialization/descriptors/SerialDescriptor;->f()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Loh2;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    :cond_1
    iget p1, p0, Loh2;->f:I

    .line 26
    .line 27
    invoke-static {p1}, Lpm2;->e(I)C

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget-object p0, p0, Loh2;->g:Lkn;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lkn;->g(C)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lkn;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lbx0;

    .line 39
    .line 40
    iget p1, p0, Lbx0;->c:I

    .line 41
    .line 42
    iget-object v0, p0, Lbx0;->d:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, [I

    .line 45
    .line 46
    aget v2, v0, p1

    .line 47
    .line 48
    const/4 v3, -0x2

    .line 49
    if-ne v2, v3, :cond_2

    .line 50
    .line 51
    aput v1, v0, p1

    .line 52
    .line 53
    add-int/2addr p1, v1

    .line 54
    iput p1, p0, Lbx0;->c:I

    .line 55
    .line 56
    :cond_2
    iget p1, p0, Lbx0;->c:I

    .line 57
    .line 58
    if-eq p1, v1, :cond_3

    .line 59
    .line 60
    add-int/2addr p1, v1

    .line 61
    iput p1, p0, Lbx0;->c:I

    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public final c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lky;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Loh2;->e:Lb11;

    .line 5
    .line 6
    invoke-static {v1, p1}, Lqj3;->M(Lb11;Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    iget-object v3, p0, Loh2;->g:Lkn;

    .line 11
    .line 12
    iget-object v0, v3, Lkn;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lbx0;

    .line 15
    .line 16
    iget v4, v0, Lbx0;->c:I

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    add-int/2addr v4, v5

    .line 20
    iput v4, v0, Lbx0;->c:I

    .line 21
    .line 22
    iget-object v6, v0, Lbx0;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v6, [Ljava/lang/Object;

    .line 25
    .line 26
    array-length v7, v6

    .line 27
    if-ne v4, v7, :cond_0

    .line 28
    .line 29
    mul-int/lit8 v7, v4, 0x2

    .line 30
    .line 31
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iput-object v6, v0, Lbx0;->b:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v6, v0, Lbx0;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v6, [I

    .line 40
    .line 41
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([II)[I

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    iput-object v6, v0, Lbx0;->d:Ljava/lang/Object;

    .line 46
    .line 47
    :cond_0
    iget-object v0, v0, Lbx0;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, [Ljava/lang/Object;

    .line 50
    .line 51
    aput-object p1, v0, v4

    .line 52
    .line 53
    invoke-static {v2}, Lpm2;->d(I)C

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {v3, v0}, Lkn;->g(C)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Lkn;->q()B

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v4, 0x4

    .line 65
    if-eq v0, v4, :cond_3

    .line 66
    .line 67
    invoke-static {v2}, Len;->y(I)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eq v0, v5, :cond_2

    .line 72
    .line 73
    const/4 v4, 0x2

    .line 74
    if-eq v0, v4, :cond_2

    .line 75
    .line 76
    const/4 v4, 0x3

    .line 77
    if-eq v0, v4, :cond_2

    .line 78
    .line 79
    iget v0, p0, Loh2;->f:I

    .line 80
    .line 81
    if-ne v0, v2, :cond_1

    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_1
    new-instance v0, Loh2;

    .line 85
    .line 86
    iget-object v5, p0, Loh2;->j:Ld5;

    .line 87
    .line 88
    move-object v4, p1

    .line 89
    invoke-direct/range {v0 .. v5}, Loh2;-><init>(Lb11;ILkn;Lkotlinx/serialization/descriptors/SerialDescriptor;Ld5;)V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_2
    move-object v4, p1

    .line 94
    new-instance v0, Loh2;

    .line 95
    .line 96
    iget-object v5, p0, Loh2;->j:Ld5;

    .line 97
    .line 98
    invoke-direct/range {v0 .. v5}, Loh2;-><init>(Lb11;ILkn;Lkotlinx/serialization/descriptors/SerialDescriptor;Ld5;)V

    .line 99
    .line 100
    .line 101
    return-object v0

    .line 102
    :cond_3
    const/4 p0, 0x0

    .line 103
    const/4 p1, 0x6

    .line 104
    const-string v0, "Unexpected leading comma"

    .line 105
    .line 106
    invoke-static {v3, v0, p0, p1}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 107
    .line 108
    .line 109
    const/4 p0, 0x0

    .line 110
    throw p0
.end method

.method public final d()Lb11;
    .locals 0

    .line 1
    iget-object p0, p0, Loh2;->e:Lb11;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()Z
    .locals 6

    .line 1
    iget-object p0, p0, Loh2;->g:Lkn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkn;->s()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, v0}, Lkn;->r(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lkn;->f:Ljava/io/Serializable;

    .line 12
    .line 13
    check-cast v1, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x6

    .line 21
    const/4 v5, 0x0

    .line 22
    if-ge v0, v2, :cond_2

    .line 23
    .line 24
    const/4 v2, -0x1

    .line 25
    if-eq v0, v2, :cond_2

    .line 26
    .line 27
    add-int/lit8 v2, v0, 0x1

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    or-int/lit8 v0, v0, 0x20

    .line 34
    .line 35
    const/16 v1, 0x66

    .line 36
    .line 37
    if-eq v0, v1, :cond_1

    .line 38
    .line 39
    const/16 v1, 0x74

    .line 40
    .line 41
    if-ne v0, v1, :cond_0

    .line 42
    .line 43
    const-string v0, "rue"

    .line 44
    .line 45
    invoke-virtual {p0, v2, v0}, Lkn;->c(ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 v5, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v1, "Expected valid boolean literal prefix, but had \'"

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lkn;->j()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const/16 v1, 0x27

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {p0, v0, v5, v4}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 74
    .line 75
    .line 76
    throw v3

    .line 77
    :cond_1
    const-string v0, "alse"

    .line 78
    .line 79
    invoke-virtual {p0, v2, v0}, Lkn;->c(ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    return v5

    .line 83
    :cond_2
    const-string v0, "EOF"

    .line 84
    .line 85
    invoke-static {p0, v0, v5, v4}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 86
    .line 87
    .line 88
    throw v3
.end method

.method public final g()C
    .locals 4

    .line 1
    iget-object p0, p0, Loh2;->g:Lkn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkn;->j()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "Expected single char, but got \'"

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v0, 0x27

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x6

    .line 40
    invoke-static {p0, v0, v3, v1}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    throw p0
.end method

.method public final h(Lkotlinx/serialization/descriptors/SerialDescriptor;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Loh2;->g:Lkn;

    .line 5
    .line 6
    invoke-virtual {v0}, Lkn;->i()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v0, v0, Lkn;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lbx0;

    .line 13
    .line 14
    invoke-virtual {v0}, Lbx0;->c()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, " at path "

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object p0, p0, Loh2;->e:Lb11;

    .line 25
    .line 26
    invoke-static {p1, p0, v1, v0}, Lw11;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;Lb11;Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final m()Lkotlinx/serialization/json/b;
    .locals 2

    .line 1
    new-instance v0, Ln7;

    .line 2
    .line 3
    iget-object v1, p0, Loh2;->e:Lb11;

    .line 4
    .line 5
    iget-object v1, v1, Lb11;->a:Lwl0;

    .line 6
    .line 7
    iget-object p0, p0, Loh2;->g:Lkn;

    .line 8
    .line 9
    invoke-direct {v0, v1, p0}, Ln7;-><init>(Lwl0;Lkn;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ln7;->e()Lkotlinx/serialization/json/b;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final o()I
    .locals 5

    .line 1
    iget-object p0, p0, Loh2;->g:Lkn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkn;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int v2, v0

    .line 8
    int-to-long v3, v2

    .line 9
    cmp-long v3, v0, v3

    .line 10
    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v3, "Failed to parse int for input \'"

    .line 17
    .line 18
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 v0, 0x27

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    const/4 v2, 0x6

    .line 35
    invoke-static {p0, v0, v1, v2}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    throw p0
.end method

.method public final r()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Loh2;->g:Lkn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkn;->i()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final s()J
    .locals 2

    .line 1
    iget-object p0, p0, Loh2;->g:Lkn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkn;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final u(Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Loh2;->g:Lkn;

    .line 2
    .line 3
    iget-object v1, p0, Loh2;->e:Lb11;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :try_start_0
    instance-of v2, p1, Lmt1;

    .line 9
    .line 10
    if-eqz v2, :cond_5

    .line 11
    .line 12
    move-object v2, p1

    .line 13
    check-cast v2, Lmt1;

    .line 14
    .line 15
    invoke-virtual {v2}, Lmt1;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v1, v2}, Lpy0;->L(Lb11;Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget v2, v0, Lkn;->b:I
    :try_end_0
    .catch Lej1; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    :try_start_1
    invoke-virtual {v0}, Lkn;->e()B

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/4 v4, 0x6

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eq v3, v4, :cond_0

    .line 35
    .line 36
    :goto_0
    goto :goto_2

    .line 37
    :goto_1
    move-object v3, v5

    .line 38
    goto :goto_3

    .line 39
    :cond_0
    invoke-virtual {v0}, Lkn;->k()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0}, Lkn;->e()B

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const/4 v6, 0x5

    .line 54
    if-eq v3, v6, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v0}, Lkn;->k()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    :try_start_2
    iput v2, v0, Lkn;->b:I

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    goto :goto_5

    .line 66
    :cond_2
    :goto_2
    iput v2, v0, Lkn;->b:I

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :goto_3
    if-eqz v3, :cond_3

    .line 70
    .line 71
    move-object v2, p1

    .line 72
    check-cast v2, Lmt1;

    .line 73
    .line 74
    invoke-virtual {v2, p0, v3}, Lmt1;->a(Lky;Ljava/lang/String;)Lkotlinx/serialization/KSerializer;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    goto :goto_4

    .line 79
    :catch_0
    move-exception p0

    .line 80
    goto :goto_6

    .line 81
    :cond_3
    :goto_4
    if-nez v5, :cond_4

    .line 82
    .line 83
    invoke-static {p0, p1}, Lpy0;->Q(Lj11;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_4
    new-instance p1, Ld5;

    .line 89
    .line 90
    invoke-direct {p1, v4}, Ld5;-><init>(I)V

    .line 91
    .line 92
    .line 93
    iput-object v1, p1, Ld5;->b:Ljava/lang/String;

    .line 94
    .line 95
    iput-object p1, p0, Loh2;->j:Ld5;

    .line 96
    .line 97
    invoke-interface {v5, p0}, Lkotlinx/serialization/KSerializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :goto_5
    iput v2, v0, Lkn;->b:I

    .line 103
    .line 104
    throw p0

    .line 105
    :cond_5
    invoke-interface {p1, p0}, Lkotlinx/serialization/KSerializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0
    :try_end_2
    .catch Lej1; {:try_start_2 .. :try_end_2} :catch_0

    .line 109
    return-object p0

    .line 110
    :goto_6
    new-instance p1, Lej1;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iget-object v0, v0, Lkn;->d:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Lbx0;

    .line 119
    .line 120
    invoke-virtual {v0}, Lbx0;->c()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    new-instance v2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v1, " at path: "

    .line 133
    .line 134
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iget-object v1, p0, Lej1;->a:Ljava/util/List;

    .line 145
    .line 146
    invoke-direct {p1, v1, v0, p0}, Lej1;-><init>(Ljava/util/List;Ljava/lang/String;Lej1;)V

    .line 147
    .line 148
    .line 149
    throw p1
.end method

.method public final w()Z
    .locals 0

    .line 1
    iget-object p0, p0, Loh2;->g:Lkn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkn;->u()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final x(Lkotlinx/serialization/descriptors/SerialDescriptor;)I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Loh2;->g:Lkn;

    .line 6
    .line 7
    iget-object v3, v2, Lkn;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lbx0;

    .line 10
    .line 11
    iget-object v4, v2, Lkn;->f:Ljava/io/Serializable;

    .line 12
    .line 13
    check-cast v4, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget v5, v0, Loh2;->f:I

    .line 19
    .line 20
    invoke-static {v5}, Len;->y(I)I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    const-string v7, "Unexpected trailing comma"

    .line 25
    .line 26
    const/4 v8, 0x6

    .line 27
    const/16 v9, 0x3a

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v11, 0x1

    .line 31
    const/4 v12, -0x1

    .line 32
    const/4 v13, 0x0

    .line 33
    if-eqz v6, :cond_e

    .line 34
    .line 35
    const/4 v1, 0x2

    .line 36
    if-eq v6, v1, :cond_4

    .line 37
    .line 38
    invoke-virtual {v2}, Lkn;->t()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {v2}, Lkn;->b()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    iget v4, v0, Loh2;->i:I

    .line 49
    .line 50
    if-eq v4, v12, :cond_1

    .line 51
    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const-string v0, "Expected end of the array or comma"

    .line 56
    .line 57
    invoke-static {v2, v0, v10, v8}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 58
    .line 59
    .line 60
    throw v13

    .line 61
    :cond_1
    :goto_0
    add-int/lit8 v12, v4, 0x1

    .line 62
    .line 63
    iput v12, v0, Loh2;->i:I

    .line 64
    .line 65
    goto/16 :goto_f

    .line 66
    .line 67
    :cond_2
    if-nez v1, :cond_3

    .line 68
    .line 69
    goto/16 :goto_f

    .line 70
    .line 71
    :cond_3
    invoke-static {v2, v7, v10, v8}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 72
    .line 73
    .line 74
    throw v13

    .line 75
    :cond_4
    iget v1, v0, Loh2;->i:I

    .line 76
    .line 77
    rem-int/lit8 v4, v1, 0x2

    .line 78
    .line 79
    if-eqz v4, :cond_5

    .line 80
    .line 81
    move v4, v11

    .line 82
    goto :goto_1

    .line 83
    :cond_5
    move v4, v10

    .line 84
    :goto_1
    if-eqz v4, :cond_6

    .line 85
    .line 86
    if-eq v1, v12, :cond_7

    .line 87
    .line 88
    invoke-virtual {v2}, Lkn;->t()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    goto :goto_2

    .line 93
    :cond_6
    invoke-virtual {v2, v9}, Lkn;->g(C)V

    .line 94
    .line 95
    .line 96
    :cond_7
    move v1, v10

    .line 97
    :goto_2
    invoke-virtual {v2}, Lkn;->b()Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_c

    .line 102
    .line 103
    if-eqz v4, :cond_b

    .line 104
    .line 105
    iget v4, v0, Loh2;->i:I

    .line 106
    .line 107
    iget v6, v2, Lkn;->b:I

    .line 108
    .line 109
    const/4 v8, 0x4

    .line 110
    if-ne v4, v12, :cond_9

    .line 111
    .line 112
    if-nez v1, :cond_8

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_8
    invoke-static {v2, v7, v6, v8}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 116
    .line 117
    .line 118
    throw v13

    .line 119
    :cond_9
    if-eqz v1, :cond_a

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_a
    const-string v0, "Expected comma after the key-value pair"

    .line 123
    .line 124
    invoke-static {v2, v0, v6, v8}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 125
    .line 126
    .line 127
    throw v13

    .line 128
    :cond_b
    :goto_3
    iget v1, v0, Loh2;->i:I

    .line 129
    .line 130
    add-int/lit8 v12, v1, 0x1

    .line 131
    .line 132
    iput v12, v0, Loh2;->i:I

    .line 133
    .line 134
    goto/16 :goto_f

    .line 135
    .line 136
    :cond_c
    if-nez v1, :cond_d

    .line 137
    .line 138
    goto/16 :goto_f

    .line 139
    .line 140
    :cond_d
    const-string v0, "Expected \'}\', but had \',\' instead"

    .line 141
    .line 142
    invoke-static {v2, v0, v10, v8}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 143
    .line 144
    .line 145
    throw v13

    .line 146
    :cond_e
    invoke-virtual {v2}, Lkn;->t()Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    :goto_4
    invoke-virtual {v2}, Lkn;->b()Z

    .line 151
    .line 152
    .line 153
    move-result v14

    .line 154
    if-eqz v14, :cond_23

    .line 155
    .line 156
    invoke-virtual {v2}, Lkn;->d()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-virtual {v2, v9}, Lkn;->g(C)V

    .line 161
    .line 162
    .line 163
    iget-object v14, v0, Loh2;->e:Lb11;

    .line 164
    .line 165
    invoke-static {v1, v14, v6}, Lw11;->o(Lkotlinx/serialization/descriptors/SerialDescriptor;Lb11;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v15

    .line 169
    const/4 v9, -0x3

    .line 170
    iget-object v12, v0, Loh2;->k:Lwl0;

    .line 171
    .line 172
    if-eq v15, v9, :cond_13

    .line 173
    .line 174
    iget-boolean v8, v12, Lwl0;->d:Z

    .line 175
    .line 176
    if-eqz v8, :cond_12

    .line 177
    .line 178
    invoke-interface {v1, v15}, Lkotlinx/serialization/descriptors/SerialDescriptor;->i(I)Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    invoke-interface {v8}, Lkotlinx/serialization/descriptors/SerialDescriptor;->c()Z

    .line 183
    .line 184
    .line 185
    move-result v16

    .line 186
    if-nez v16, :cond_f

    .line 187
    .line 188
    invoke-virtual {v2}, Lkn;->u()Z

    .line 189
    .line 190
    .line 191
    move-result v16

    .line 192
    if-nez v16, :cond_f

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_f
    invoke-interface {v8}, Lkotlinx/serialization/descriptors/SerialDescriptor;->e()Lpy0;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    sget-object v13, Lca2;->k:Lca2;

    .line 200
    .line 201
    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    if-eqz v10, :cond_12

    .line 206
    .line 207
    invoke-virtual {v2}, Lkn;->q()B

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    if-eq v10, v11, :cond_10

    .line 212
    .line 213
    const/4 v10, 0x0

    .line 214
    goto :goto_5

    .line 215
    :cond_10
    invoke-virtual {v2}, Lkn;->i()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    iput-object v10, v2, Lkn;->e:Ljava/io/Serializable;

    .line 220
    .line 221
    :goto_5
    if-nez v10, :cond_11

    .line 222
    .line 223
    goto :goto_7

    .line 224
    :cond_11
    invoke-static {v8, v14, v10}, Lw11;->o(Lkotlinx/serialization/descriptors/SerialDescriptor;Lb11;Ljava/lang/String;)I

    .line 225
    .line 226
    .line 227
    move-result v8

    .line 228
    if-ne v8, v9, :cond_12

    .line 229
    .line 230
    invoke-virtual {v2}, Lkn;->i()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    :goto_6
    invoke-virtual {v2}, Lkn;->t()Z

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    const/4 v9, 0x0

    .line 238
    goto :goto_8

    .line 239
    :cond_12
    :goto_7
    move v12, v15

    .line 240
    goto/16 :goto_f

    .line 241
    .line 242
    :cond_13
    move v9, v11

    .line 243
    const/4 v8, 0x0

    .line 244
    :goto_8
    if-eqz v9, :cond_22

    .line 245
    .line 246
    iget-boolean v8, v12, Lwl0;->c:Z

    .line 247
    .line 248
    if-nez v8, :cond_15

    .line 249
    .line 250
    iget-object v8, v0, Loh2;->j:Ld5;

    .line 251
    .line 252
    if-eqz v8, :cond_14

    .line 253
    .line 254
    iget-object v9, v8, Ld5;->b:Ljava/lang/String;

    .line 255
    .line 256
    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    if-eqz v9, :cond_14

    .line 261
    .line 262
    const/4 v9, 0x0

    .line 263
    iput-object v9, v8, Ld5;->b:Ljava/lang/String;

    .line 264
    .line 265
    goto :goto_9

    .line 266
    :cond_14
    iget v0, v2, Lkn;->b:I

    .line 267
    .line 268
    const/4 v1, 0x0

    .line 269
    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    const/4 v1, 0x6

    .line 278
    invoke-static {v1, v0, v6}, Lkotlin/text/StringsKt;->E(ILjava/lang/String;Ljava/lang/String;)I

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    new-instance v1, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    const-string v3, "Encountered an unknown key \'"

    .line 285
    .line 286
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    const/16 v3, 0x27

    .line 293
    .line 294
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    const-string v3, "Use \'ignoreUnknownKeys = true\' in \'Json {}\' builder to ignore unknown keys."

    .line 302
    .line 303
    invoke-virtual {v2, v0, v1, v3}, Lkn;->l(ILjava/lang/String;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    const/16 v17, 0x0

    .line 307
    .line 308
    throw v17

    .line 309
    :cond_15
    :goto_9
    new-instance v6, Ljava/util/ArrayList;

    .line 310
    .line 311
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2}, Lkn;->q()B

    .line 315
    .line 316
    .line 317
    move-result v8

    .line 318
    const/16 v9, 0x8

    .line 319
    .line 320
    if-eq v8, v9, :cond_16

    .line 321
    .line 322
    const/4 v10, 0x6

    .line 323
    if-eq v8, v10, :cond_17

    .line 324
    .line 325
    invoke-virtual {v2}, Lkn;->j()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    goto/16 :goto_d

    .line 329
    .line 330
    :cond_16
    const/4 v10, 0x6

    .line 331
    :cond_17
    :goto_a
    invoke-virtual {v2}, Lkn;->q()B

    .line 332
    .line 333
    .line 334
    move-result v8

    .line 335
    if-ne v8, v11, :cond_18

    .line 336
    .line 337
    invoke-virtual {v2}, Lkn;->d()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    goto :goto_a

    .line 341
    :cond_18
    if-ne v8, v9, :cond_19

    .line 342
    .line 343
    goto :goto_b

    .line 344
    :cond_19
    if-ne v8, v10, :cond_1a

    .line 345
    .line 346
    :goto_b
    invoke-static {v8}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 347
    .line 348
    .line 349
    move-result-object v8

    .line 350
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    goto/16 :goto_c

    .line 354
    .line 355
    :cond_1a
    const/16 v10, 0x9

    .line 356
    .line 357
    const-string v12, "List is empty."

    .line 358
    .line 359
    if-ne v8, v10, :cond_1d

    .line 360
    .line 361
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->y(Ljava/util/List;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v8

    .line 365
    check-cast v8, Ljava/lang/Number;

    .line 366
    .line 367
    invoke-virtual {v8}, Ljava/lang/Number;->byteValue()B

    .line 368
    .line 369
    .line 370
    move-result v8

    .line 371
    if-ne v8, v9, :cond_1c

    .line 372
    .line 373
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 374
    .line 375
    .line 376
    move-result v8

    .line 377
    if-nez v8, :cond_1b

    .line 378
    .line 379
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 380
    .line 381
    .line 382
    move-result v8

    .line 383
    sub-int/2addr v8, v11

    .line 384
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    goto :goto_c

    .line 388
    :cond_1b
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 389
    .line 390
    invoke-direct {v0, v12}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    throw v0

    .line 394
    :cond_1c
    iget v0, v2, Lkn;->b:I

    .line 395
    .line 396
    new-instance v1, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    const-string v2, "found ] instead of } at path: "

    .line 399
    .line 400
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    invoke-static {v1, v4, v0}, Lkb1;->d(Ljava/lang/String;Ljava/lang/CharSequence;I)Ll11;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    throw v0

    .line 415
    :cond_1d
    const/4 v10, 0x7

    .line 416
    if-ne v8, v10, :cond_20

    .line 417
    .line 418
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->y(Ljava/util/List;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v8

    .line 422
    check-cast v8, Ljava/lang/Number;

    .line 423
    .line 424
    invoke-virtual {v8}, Ljava/lang/Number;->byteValue()B

    .line 425
    .line 426
    .line 427
    move-result v8

    .line 428
    const/4 v10, 0x6

    .line 429
    if-ne v8, v10, :cond_1f

    .line 430
    .line 431
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 432
    .line 433
    .line 434
    move-result v8

    .line 435
    if-nez v8, :cond_1e

    .line 436
    .line 437
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 438
    .line 439
    .line 440
    move-result v8

    .line 441
    sub-int/2addr v8, v11

    .line 442
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    goto :goto_c

    .line 446
    :cond_1e
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 447
    .line 448
    invoke-direct {v0, v12}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    throw v0

    .line 452
    :cond_1f
    iget v0, v2, Lkn;->b:I

    .line 453
    .line 454
    new-instance v1, Ljava/lang/StringBuilder;

    .line 455
    .line 456
    const-string v2, "found } instead of ] at path: "

    .line 457
    .line 458
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    invoke-static {v1, v4, v0}, Lkb1;->d(Ljava/lang/String;Ljava/lang/CharSequence;I)Ll11;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    throw v0

    .line 473
    :cond_20
    const/16 v10, 0xa

    .line 474
    .line 475
    if-eq v8, v10, :cond_21

    .line 476
    .line 477
    :goto_c
    invoke-virtual {v2}, Lkn;->e()B

    .line 478
    .line 479
    .line 480
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 481
    .line 482
    .line 483
    move-result v8

    .line 484
    if-nez v8, :cond_16

    .line 485
    .line 486
    :goto_d
    invoke-virtual {v2}, Lkn;->t()Z

    .line 487
    .line 488
    .line 489
    move-result v6

    .line 490
    :goto_e
    const/4 v8, 0x6

    .line 491
    const/16 v9, 0x3a

    .line 492
    .line 493
    const/4 v10, 0x0

    .line 494
    const/4 v12, -0x1

    .line 495
    const/4 v13, 0x0

    .line 496
    goto/16 :goto_4

    .line 497
    .line 498
    :cond_21
    const-string v0, "Unexpected end of input due to malformed JSON during ignoring unknown keys"

    .line 499
    .line 500
    const/4 v1, 0x0

    .line 501
    const/4 v10, 0x6

    .line 502
    invoke-static {v2, v0, v1, v10}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 503
    .line 504
    .line 505
    const/16 v17, 0x0

    .line 506
    .line 507
    throw v17

    .line 508
    :cond_22
    move v6, v8

    .line 509
    goto :goto_e

    .line 510
    :cond_23
    if-nez v6, :cond_25

    .line 511
    .line 512
    const/4 v12, -0x1

    .line 513
    :goto_f
    const/4 v0, 0x3

    .line 514
    if-eq v5, v0, :cond_24

    .line 515
    .line 516
    iget-object v0, v3, Lbx0;->d:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v0, [I

    .line 519
    .line 520
    iget v1, v3, Lbx0;->c:I

    .line 521
    .line 522
    aput v12, v0, v1

    .line 523
    .line 524
    :cond_24
    return v12

    .line 525
    :cond_25
    const/4 v1, 0x0

    .line 526
    const/4 v10, 0x6

    .line 527
    invoke-static {v2, v7, v1, v10}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 528
    .line 529
    .line 530
    const/16 v17, 0x0

    .line 531
    .line 532
    throw v17
.end method

.method public final z(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lqh2;->a(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance p1, Lk11;

    .line 11
    .line 12
    iget-object v0, p0, Loh2;->g:Lkn;

    .line 13
    .line 14
    iget-object p0, p0, Loh2;->e:Lb11;

    .line 15
    .line 16
    invoke-direct {p1, v0, p0}, Lk11;-><init>(Lkn;Lb11;)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    return-object p0
.end method
