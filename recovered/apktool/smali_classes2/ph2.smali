.class public final Lph2;
.super Lpy0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lp11;


# instance fields
.field public final k:Lzr3;

.field public final l:Lb11;

.field public final m:I

.field public final n:[Lp11;

.field public final o:Lb5;

.field public final p:Lwl0;

.field public q:Z

.field public r:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lzr3;Lb11;I[Lp11;)V
    .locals 1

    .line 1
    if-eqz p3, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    invoke-direct {p0, v0}, Lpy0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lph2;->k:Lzr3;

    .line 8
    .line 9
    iput-object p2, p0, Lph2;->l:Lb11;

    .line 10
    .line 11
    iput p3, p0, Lph2;->m:I

    .line 12
    .line 13
    iput-object p4, p0, Lph2;->n:[Lp11;

    .line 14
    .line 15
    iget-object p1, p2, Lb11;->b:Lb5;

    .line 16
    .line 17
    iput-object p1, p0, Lph2;->o:Lb5;

    .line 18
    .line 19
    iget-object p1, p2, Lb11;->a:Lwl0;

    .line 20
    .line 21
    iput-object p1, p0, Lph2;->p:Lwl0;

    .line 22
    .line 23
    invoke-static {p3}, Len;->y(I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p4, :cond_1

    .line 28
    .line 29
    aget-object p2, p4, p1

    .line 30
    .line 31
    if-nez p2, :cond_0

    .line 32
    .line 33
    if-eq p2, p0, :cond_1

    .line 34
    .line 35
    :cond_0
    aput-object p0, p4, p1

    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    throw p0
.end method


# virtual methods
.method public final A(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lmt1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lmt1;

    .line 10
    .line 11
    check-cast p1, Lmt1;

    .line 12
    .line 13
    invoke-virtual {p1}, Lmt1;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v1, p0, Lph2;->l:Lb11;

    .line 18
    .line 19
    invoke-static {v1, p1}, Lpy0;->L(Lb11;Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v0, p0, p2}, Ljb1;->p(Lmt1;Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/KSerializer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Lkotlinx/serialization/KSerializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Lkotlinx/serialization/descriptors/SerialDescriptor;->e()Lpy0;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Lpy0;->K(Lpy0;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lph2;->r:Ljava/lang/String;

    .line 42
    .line 43
    invoke-interface {v0, p0, p2}, Lkotlinx/serialization/KSerializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-interface {p1, p0, p2}, Lkotlinx/serialization/KSerializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final B(J)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lph2;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lph2;->F(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p0, p0, Lph2;->k:Lzr3;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lzr3;->s(J)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lph2;->p:Lwl0;

    .line 5
    .line 6
    iget-boolean p0, p0, Lwl0;->b:Z

    .line 7
    .line 8
    return p0
.end method

.method public final F(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lph2;->k:Lzr3;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lzr3;->u(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final S(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lph2;->m:I

    .line 5
    .line 6
    invoke-static {v0}, Len;->y(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x2c

    .line 11
    .line 12
    iget-object v2, p0, Lph2;->k:Lzr3;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-eq v0, v3, :cond_7

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/16 v5, 0x3a

    .line 19
    .line 20
    const/4 v6, 0x2

    .line 21
    if-eq v0, v6, :cond_4

    .line 22
    .line 23
    const/4 v6, 0x3

    .line 24
    if-eq v0, v6, :cond_1

    .line 25
    .line 26
    iget-boolean v0, v2, Lzr3;->b:Z

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Lzr3;->n(C)V

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {v2}, Lzr3;->l()V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1, p2}, Lkotlinx/serialization/descriptors/SerialDescriptor;->g(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, p1}, Lph2;->F(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v5}, Lzr3;->n(C)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lzr3;->v()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    if-nez p2, :cond_2

    .line 51
    .line 52
    iput-boolean v3, p0, Lph2;->q:Z

    .line 53
    .line 54
    :cond_2
    if-ne p2, v3, :cond_3

    .line 55
    .line 56
    invoke-virtual {v2, v1}, Lzr3;->n(C)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Lzr3;->v()V

    .line 60
    .line 61
    .line 62
    iput-boolean v4, p0, Lph2;->q:Z

    .line 63
    .line 64
    :cond_3
    return-void

    .line 65
    :cond_4
    iget-boolean p1, v2, Lzr3;->b:Z

    .line 66
    .line 67
    if-nez p1, :cond_6

    .line 68
    .line 69
    rem-int/2addr p2, v6

    .line 70
    if-nez p2, :cond_5

    .line 71
    .line 72
    invoke-virtual {v2, v1}, Lzr3;->n(C)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Lzr3;->l()V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    invoke-virtual {v2, v5}, Lzr3;->n(C)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Lzr3;->v()V

    .line 83
    .line 84
    .line 85
    move v3, v4

    .line 86
    :goto_0
    iput-boolean v3, p0, Lph2;->q:Z

    .line 87
    .line 88
    return-void

    .line 89
    :cond_6
    iput-boolean v3, p0, Lph2;->q:Z

    .line 90
    .line 91
    invoke-virtual {v2}, Lzr3;->l()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_7
    iget-boolean p0, v2, Lzr3;->b:Z

    .line 96
    .line 97
    if-nez p0, :cond_8

    .line 98
    .line 99
    invoke-virtual {v2, v1}, Lzr3;->n(C)V

    .line 100
    .line 101
    .line 102
    :cond_8
    invoke-virtual {v2}, Lzr3;->l()V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final a()Lb5;
    .locals 0

    .line 1
    iget-object p0, p0, Lph2;->o:Lb5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lph2;->m:I

    .line 5
    .line 6
    invoke-static {p1}, Lpm2;->e(I)C

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lph2;->k:Lzr3;

    .line 10
    .line 11
    invoke-virtual {p0}, Lzr3;->l()V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lpm2;->e(I)C

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p0, p1}, Lzr3;->n(C)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lly;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lph2;->l:Lb11;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lqj3;->M(Lb11;Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Lpm2;->d(I)C

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iget-object v3, p0, Lph2;->k:Lzr3;

    .line 15
    .line 16
    invoke-virtual {v3, v2}, Lzr3;->n(C)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    iput-boolean v2, v3, Lzr3;->b:Z

    .line 21
    .line 22
    iget-object v2, p0, Lph2;->r:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v3}, Lzr3;->l()V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lph2;->r:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v2}, Lzr3;->u(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/16 v2, 0x3a

    .line 38
    .line 39
    invoke-virtual {v3, v2}, Lzr3;->n(C)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Lkotlinx/serialization/descriptors/SerialDescriptor;->a()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Lph2;->F(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    iput-object p1, p0, Lph2;->r:Ljava/lang/String;

    .line 51
    .line 52
    :cond_0
    iget p1, p0, Lph2;->m:I

    .line 53
    .line 54
    if-ne p1, v1, :cond_1

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_1
    iget-object p0, p0, Lph2;->n:[Lp11;

    .line 58
    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    invoke-static {v1}, Len;->y(I)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    aget-object p1, p0, p1

    .line 66
    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_2
    new-instance p1, Lph2;

    .line 71
    .line 72
    invoke-direct {p1, v3, v0, v1, p0}, Lph2;-><init>(Lzr3;Lb11;I[Lp11;)V

    .line 73
    .line 74
    .line 75
    return-object p1
.end method

.method public final d()Lb11;
    .locals 0

    .line 1
    iget-object p0, p0, Lph2;->l:Lb11;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object p0, p0, Lph2;->k:Lzr3;

    .line 2
    .line 3
    iget-object p0, p0, Lzr3;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ln7;

    .line 6
    .line 7
    const-string v0, "null"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ln7;->p(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final g(D)V
    .locals 2

    .line 1
    iget-object v0, p0, Lph2;->k:Lzr3;

    .line 2
    .line 3
    iget-object v0, v0, Lzr3;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ln7;

    .line 6
    .line 7
    iget-boolean v1, p0, Lph2;->q:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v1}, Lph2;->F(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {v0, p0}, Ln7;->p(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v0}, Ln7;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1, p0}, Lkb1;->a(Ljava/lang/String;Ljava/lang/Number;)Ll11;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    throw p0
.end method

.method public final h(S)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lph2;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lph2;->F(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p0, p0, Lph2;->k:Lzr3;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lzr3;->t(S)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final j(B)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lph2;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lph2;->F(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p0, p0, Lph2;->k:Lzr3;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lzr3;->m(B)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final k(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lph2;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lph2;->F(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p0, p0, Lph2;->k:Lzr3;

    .line 14
    .line 15
    iget-object p0, p0, Lzr3;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ln7;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Ln7;->p(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final m(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lph2;->k:Lzr3;

    .line 2
    .line 3
    iget-object v0, v0, Lzr3;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ln7;

    .line 6
    .line 7
    iget-boolean v1, p0, Lph2;->q:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v1}, Lph2;->F(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {v0, p0}, Ln7;->p(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-static {p1}, Ljava/lang/Float;->isInfinite(F)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v0}, Ln7;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1, p0}, Lkb1;->a(Ljava/lang/String;Ljava/lang/Number;)Ll11;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    throw p0
.end method

.method public final o(C)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lph2;->F(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2, p3, p4}, Lpy0;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, p2}, Lkotlinx/serialization/descriptors/SerialDescriptor;->g(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, Lph2;->F(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final w(Lkotlinx/serialization/json/b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ln11;->a:Ln11;

    .line 5
    .line 6
    invoke-virtual {p0, v0, p1}, Lph2;->A(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final y(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lph2;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lph2;->F(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p0, p0, Lph2;->k:Lzr3;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lzr3;->r(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final z(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;
    .locals 3

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
    if-eqz p1, :cond_1

    .line 9
    .line 10
    new-instance p1, Lph2;

    .line 11
    .line 12
    iget-object v0, p0, Lph2;->k:Lzr3;

    .line 13
    .line 14
    instance-of v1, v0, Ljy;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v1, Ljy;

    .line 20
    .line 21
    iget-object v0, v0, Lzr3;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ln7;

    .line 24
    .line 25
    iget-boolean v2, p0, Lph2;->q:Z

    .line 26
    .line 27
    invoke-direct {v1, v0, v2}, Ljy;-><init>(Ln7;Z)V

    .line 28
    .line 29
    .line 30
    move-object v0, v1

    .line 31
    :goto_0
    iget v1, p0, Lph2;->m:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    iget-object p0, p0, Lph2;->l:Lb11;

    .line 35
    .line 36
    invoke-direct {p1, v0, p0, v1, v2}, Lph2;-><init>(Lzr3;Lb11;I[Lp11;)V

    .line 37
    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_1
    return-object p0
.end method
