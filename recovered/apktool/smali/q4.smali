.class public final Lq4;
.super Lkx0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final e:Lex1;

.field public static final f:Lex1;


# instance fields
.field public final synthetic d:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ln4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ln4;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lex1;

    .line 8
    .line 9
    const-class v2, Lk4;

    .line 10
    .line 11
    invoke-direct {v1, v2, v0}, Lex1;-><init>(Ljava/lang/Class;Lfx1;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lq4;->e:Lex1;

    .line 15
    .line 16
    new-instance v0, Lds0;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, v1}, Lds0;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lex1;

    .line 23
    .line 24
    const-class v2, Lnu0;

    .line 25
    .line 26
    invoke-direct {v1, v2, v0}, Lex1;-><init>(Ljava/lang/Class;Lfx1;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Lq4;->f:Lex1;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lq4;->d:I

    .line 3
    .line 4
    new-instance v0, Lo4;

    .line 5
    .line 6
    const-class v1, Lwa1;

    .line 7
    .line 8
    const/16 v2, 0x8

    .line 9
    .line 10
    invoke-direct {v0, v2, v1}, Lo4;-><init>(ILjava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    filled-new-array {v0}, [Lo4;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-class v1, Lmu0;

    .line 18
    .line 19
    invoke-direct {p0, v1, v0}, Lkx0;-><init>(Ljava/lang/Class;[Lo4;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;[Lo4;I)V
    .locals 0

    .line 23
    iput p3, p0, Lq4;->d:I

    invoke-direct {p0, p1, p2}, Lkx0;-><init>(Ljava/lang/Class;[Lo4;)V

    return-void
.end method

.method public static A(II)Lb41;
    .locals 2

    .line 1
    invoke-static {}, Ld6;->y()Lc6;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Loq0;->e()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Loq0;->b:Lsq0;

    .line 9
    .line 10
    check-cast v1, Ld6;

    .line 11
    .line 12
    invoke-static {v1, p0}, Ld6;->w(Ld6;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Loq0;->b()Lsq0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ld6;

    .line 20
    .line 21
    new-instance v0, Lb41;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, Lb41;-><init>(Lsq0;I)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static B(II)Lb41;
    .locals 2

    .line 1
    invoke-static {}, Ll6;->y()Lk6;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Loq0;->e()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Loq0;->b:Lsq0;

    .line 9
    .line 10
    check-cast v1, Ll6;

    .line 11
    .line 12
    invoke-static {v1, p0}, Ll6;->w(Ll6;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Loq0;->b()Lsq0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ll6;

    .line 20
    .line 21
    new-instance v0, Lb41;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, Lb41;-><init>(Lsq0;I)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static C(IILst0;I)Lb41;
    .locals 4

    .line 1
    new-instance v0, Lb41;

    .line 2
    .line 3
    invoke-static {}, Lpu0;->B()Lou0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, Lsu0;->B()Lru0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Loq0;->e()V

    .line 12
    .line 13
    .line 14
    iget-object v3, v2, Loq0;->b:Lsq0;

    .line 15
    .line 16
    check-cast v3, Lsu0;

    .line 17
    .line 18
    invoke-static {v3, p2}, Lsu0;->w(Lsu0;Lst0;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Loq0;->e()V

    .line 22
    .line 23
    .line 24
    iget-object p2, v2, Loq0;->b:Lsq0;

    .line 25
    .line 26
    check-cast p2, Lsu0;

    .line 27
    .line 28
    invoke-static {p2, p1}, Lsu0;->x(Lsu0;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Loq0;->b()Lsq0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lsu0;

    .line 36
    .line 37
    invoke-virtual {v1}, Loq0;->e()V

    .line 38
    .line 39
    .line 40
    iget-object p2, v1, Loq0;->b:Lsq0;

    .line 41
    .line 42
    check-cast p2, Lpu0;

    .line 43
    .line 44
    invoke-static {p2, p1}, Lpu0;->w(Lpu0;Lsu0;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Loq0;->e()V

    .line 48
    .line 49
    .line 50
    iget-object p1, v1, Loq0;->b:Lsq0;

    .line 51
    .line 52
    check-cast p1, Lpu0;

    .line 53
    .line 54
    invoke-static {p1, p0}, Lpu0;->x(Lpu0;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Loq0;->b()Lsq0;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Lpu0;

    .line 62
    .line 63
    invoke-direct {v0, p0, p3}, Lb41;-><init>(Lsq0;I)V

    .line 64
    .line 65
    .line 66
    return-object v0
.end method

.method public static D(Lu4;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu4;->y()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    if-lt v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lu4;->y()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/16 v0, 0x10

    .line 14
    .line 15
    if-gt p0, v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p0, "tag size too long"

    .line 19
    .line 20
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const-string p0, "tag size too short"

    .line 25
    .line 26
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static E(Lsu0;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lsu0;->A()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    if-lt v0, v1, :cond_a

    .line 8
    .line 9
    invoke-virtual {p0}, Lsu0;->z()Lst0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    const-string v2, "tag size too big"

    .line 19
    .line 20
    if-eq v0, v1, :cond_8

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    if-eq v0, v1, :cond_6

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    if-eq v0, v1, :cond_4

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    if-eq v0, v1, :cond_2

    .line 30
    .line 31
    const/4 v1, 0x5

    .line 32
    if-ne v0, v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Lsu0;->A()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    const/16 v0, 0x1c

    .line 39
    .line 40
    if-gt p0, v0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v2}, Lds0;->t(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    const-string p0, "unknown hash type"

    .line 48
    .line 49
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    invoke-virtual {p0}, Lsu0;->A()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    const/16 v0, 0x40

    .line 58
    .line 59
    if-gt p0, v0, :cond_3

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    invoke-static {v2}, Lds0;->t(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_4
    invoke-virtual {p0}, Lsu0;->A()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    const/16 v0, 0x20

    .line 71
    .line 72
    if-gt p0, v0, :cond_5

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    invoke-static {v2}, Lds0;->t(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_6
    invoke-virtual {p0}, Lsu0;->A()I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    const/16 v0, 0x30

    .line 84
    .line 85
    if-gt p0, v0, :cond_7

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_7
    invoke-static {v2}, Lds0;->t(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_8
    invoke-virtual {p0}, Lsu0;->A()I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    const/16 v0, 0x14

    .line 97
    .line 98
    if-gt p0, v0, :cond_9

    .line 99
    .line 100
    :goto_0
    return-void

    .line 101
    :cond_9
    invoke-static {v2}, Lds0;->t(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_a
    const-string p0, "tag size too small"

    .line 106
    .line 107
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public static y(II)Lb41;
    .locals 2

    .line 1
    invoke-static {}, Lt5;->A()Ls5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Loq0;->e()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Loq0;->b:Lsq0;

    .line 9
    .line 10
    check-cast v1, Lt5;

    .line 11
    .line 12
    invoke-static {v1, p0}, Lt5;->x(Lt5;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lw5;->z()Lv5;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Loq0;->e()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Loq0;->b:Lsq0;

    .line 23
    .line 24
    check-cast v1, Lw5;

    .line 25
    .line 26
    invoke-static {v1}, Lw5;->w(Lw5;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Loq0;->b()Lsq0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lw5;

    .line 34
    .line 35
    invoke-virtual {v0}, Loq0;->e()V

    .line 36
    .line 37
    .line 38
    iget-object v1, v0, Loq0;->b:Lsq0;

    .line 39
    .line 40
    check-cast v1, Lt5;

    .line 41
    .line 42
    invoke-static {v1, p0}, Lt5;->w(Lt5;Lw5;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Loq0;->b()Lsq0;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Lt5;

    .line 50
    .line 51
    new-instance v0, Lb41;

    .line 52
    .line 53
    invoke-direct {v0, p0, p1}, Lb41;-><init>(Lsq0;I)V

    .line 54
    .line 55
    .line 56
    return-object v0
.end method

.method public static z(III)Lb41;
    .locals 5

    .line 1
    new-instance v0, Lb41;

    .line 2
    .line 3
    invoke-static {}, Ll5;->B()Lk5;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, Ln5;->z()Lm5;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Loq0;->e()V

    .line 12
    .line 13
    .line 14
    iget-object v3, v2, Loq0;->b:Lsq0;

    .line 15
    .line 16
    check-cast v3, Ln5;

    .line 17
    .line 18
    invoke-static {v3}, Ln5;->w(Ln5;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Loq0;->b()Lsq0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ln5;

    .line 26
    .line 27
    invoke-virtual {v1}, Loq0;->e()V

    .line 28
    .line 29
    .line 30
    iget-object v3, v1, Loq0;->b:Lsq0;

    .line 31
    .line 32
    check-cast v3, Ll5;

    .line 33
    .line 34
    invoke-static {v3, v2}, Ll5;->w(Ll5;Ln5;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Loq0;->e()V

    .line 38
    .line 39
    .line 40
    iget-object v2, v1, Loq0;->b:Lsq0;

    .line 41
    .line 42
    check-cast v2, Ll5;

    .line 43
    .line 44
    invoke-static {v2, p0}, Ll5;->x(Ll5;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Loq0;->b()Lsq0;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Ll5;

    .line 52
    .line 53
    invoke-static {}, Lpu0;->B()Lou0;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {}, Lsu0;->B()Lru0;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Loq0;->e()V

    .line 62
    .line 63
    .line 64
    iget-object v3, v2, Loq0;->b:Lsq0;

    .line 65
    .line 66
    check-cast v3, Lsu0;

    .line 67
    .line 68
    sget-object v4, Lst0;->e:Lst0;

    .line 69
    .line 70
    invoke-static {v3, v4}, Lsu0;->w(Lsu0;Lst0;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Loq0;->e()V

    .line 74
    .line 75
    .line 76
    iget-object v3, v2, Loq0;->b:Lsq0;

    .line 77
    .line 78
    check-cast v3, Lsu0;

    .line 79
    .line 80
    invoke-static {v3, p1}, Lsu0;->x(Lsu0;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Loq0;->b()Lsq0;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Lsu0;

    .line 88
    .line 89
    invoke-virtual {v1}, Loq0;->e()V

    .line 90
    .line 91
    .line 92
    iget-object v2, v1, Loq0;->b:Lsq0;

    .line 93
    .line 94
    check-cast v2, Lpu0;

    .line 95
    .line 96
    invoke-static {v2, p1}, Lpu0;->w(Lpu0;Lsu0;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Loq0;->e()V

    .line 100
    .line 101
    .line 102
    iget-object p1, v1, Loq0;->b:Lsq0;

    .line 103
    .line 104
    check-cast p1, Lpu0;

    .line 105
    .line 106
    const/16 v2, 0x20

    .line 107
    .line 108
    invoke-static {p1, v2}, Lpu0;->x(Lpu0;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Loq0;->b()Lsq0;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, Lpu0;

    .line 116
    .line 117
    invoke-static {}, La5;->A()Lz4;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Loq0;->e()V

    .line 122
    .line 123
    .line 124
    iget-object v2, v1, Loq0;->b:Lsq0;

    .line 125
    .line 126
    check-cast v2, La5;

    .line 127
    .line 128
    invoke-static {v2, p0}, La5;->w(La5;Ll5;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Loq0;->e()V

    .line 132
    .line 133
    .line 134
    iget-object p0, v1, Loq0;->b:Lsq0;

    .line 135
    .line 136
    check-cast p0, La5;

    .line 137
    .line 138
    invoke-static {p0, p1}, La5;->x(La5;Lpu0;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Loq0;->b()Lsq0;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    check-cast p0, La5;

    .line 146
    .line 147
    invoke-direct {v0, p0, p2}, Lb41;-><init>(Lsq0;I)V

    .line 148
    .line 149
    .line 150
    return-object v0
.end method


# virtual methods
.method public l()I
    .locals 1

    .line 1
    iget v0, p0, Lq4;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, Lkx0;->l()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_1
    const/4 p0, 0x2

    .line 12
    return p0

    .line 13
    :pswitch_2
    const/4 p0, 0x2

    .line 14
    return p0

    .line 15
    :pswitch_3
    const/4 p0, 0x2

    .line 16
    return p0

    .line 17
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final m()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Lq4;->d:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    const-string p0, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    const-string p0, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    const-string p0, "type.googleapis.com/google.crypto.tink.AesSivKey"

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    const-string p0, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    const-string p0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    const-string p0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    const-string p0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    const-string p0, "type.googleapis.com/google.crypto.tink.HmacKey"

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    const-string p0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final o()Lsq3;
    .locals 3

    .line 1
    iget v0, p0, Lq4;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lp4;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, p0, v1, v2}, Lp4;-><init>(Lq4;BS)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    new-instance v0, Lp4;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v0, p0, v1, v2}, Lp4;-><init>(Lq4;BI)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, Lp4;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v0, p0, v1, v2}, Lp4;-><init>(Lq4;BC)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_2
    new-instance v0, Lp4;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v0, p0, v1, v2}, Lp4;-><init>(Lq4;BZ)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_3
    new-instance v0, Lp4;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {v0, p0, v1}, Lp4;-><init>(Lq4;S)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_4
    new-instance v0, Lp4;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {v0, p0, v1}, Lp4;-><init>(Lq4;I)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_5
    new-instance v0, Lp4;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-direct {v0, p0, v1}, Lp4;-><init>(Lq4;C)V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_6
    new-instance v0, Lp4;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-direct {v0, p0, v1}, Lp4;-><init>(Lq4;B)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_7
    new-instance v0, Lp4;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lp4;-><init>(Lq4;)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_8
    new-instance v0, Lp4;

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    invoke-direct {v0, p0, v1, v1}, Lp4;-><init>(Lq4;BB)V

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :pswitch_9
    new-instance p0, Lp4;

    .line 80
    .line 81
    const-class v0, Lm4;

    .line 82
    .line 83
    invoke-direct {p0, v0}, Lp4;-><init>(Ljava/lang/Class;)V

    .line 84
    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p()Lh31;
    .locals 2

    .line 1
    iget p0, p0, Lq4;->d:I

    .line 2
    .line 3
    sget-object v0, Lh31;->f:Lh31;

    .line 4
    .line 5
    sget-object v1, Lh31;->c:Lh31;

    .line 6
    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    return-object v1

    .line 11
    :pswitch_0
    return-object v0

    .line 12
    :pswitch_1
    return-object v1

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Lvl;)Lw;
    .locals 0

    .line 1
    iget p0, p0, Lq4;->d:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p1, p0}, Ll93;->B(Lvl;Ldg0;)Ll93;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p1, p0}, Lu41;->B(Lvl;Ldg0;)Lu41;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_1
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p1, p0}, Lp41;->B(Lvl;Ldg0;)Lp41;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_2
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p1, p0}, Lcs;->B(Lvl;Ldg0;)Lcs;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_3
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p1, p0}, Lq6;->B(Lvl;Ldg0;)Lq6;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_4
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p1, p0}, Li6;->B(Lvl;Ldg0;)Li6;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_5
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p1, p0}, La6;->B(Lvl;Ldg0;)La6;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_6
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p1, p0}, Lq5;->D(Lvl;Ldg0;)Lq5;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :pswitch_7
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p1, p0}, Lx4;->D(Lvl;Ldg0;)Lx4;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :pswitch_8
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p1, p0}, Lmu0;->E(Lvl;Ldg0;)Lmu0;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :pswitch_9
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p1, p0}, Lj4;->D(Lvl;Ldg0;)Lj4;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final x(Lw;)V
    .locals 9

    .line 1
    iget p0, p0, Lq4;->d:I

    .line 2
    .line 3
    const-string v0, "key too short"

    .line 4
    .line 5
    const/16 v1, 0xc

    .line 6
    .line 7
    const/16 v2, 0x10

    .line 8
    .line 9
    const/16 v3, 0x20

    .line 10
    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Ll93;

    .line 15
    .line 16
    invoke-virtual {p1}, Ll93;->z()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Lr13;->c(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ll93;->y()Lvl;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Lvl;->size()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-ne p0, v3, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string p0, "invalid XChaCha20Poly1305Key: incorrect key length"

    .line 35
    .line 36
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    return-void

    .line 40
    :pswitch_0
    check-cast p1, Lu41;

    .line 41
    .line 42
    invoke-virtual {p1}, Lu41;->z()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {p0}, Lr13;->c(I)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    check-cast p1, Lp41;

    .line 51
    .line 52
    invoke-virtual {p1}, Lp41;->z()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-static {p0}, Lr13;->c(I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_2
    check-cast p1, Lcs;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcs;->z()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    invoke-static {p0}, Lr13;->c(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lcs;->y()Lvl;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Lvl;->size()I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-ne p0, v3, :cond_1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    const-string p0, "invalid ChaCha20Poly1305Key: incorrect key length"

    .line 81
    .line 82
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :goto_1
    return-void

    .line 86
    :pswitch_3
    check-cast p1, Lq6;

    .line 87
    .line 88
    invoke-virtual {p1}, Lq6;->z()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-static {p0}, Lr13;->c(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lq6;->y()Lvl;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, Lvl;->size()I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    const/16 v0, 0x40

    .line 104
    .line 105
    if-ne p0, v0, :cond_2

    .line 106
    .line 107
    return-void

    .line 108
    :cond_2
    new-instance p0, Ljava/security/InvalidKeyException;

    .line 109
    .line 110
    invoke-virtual {p1}, Lq6;->y()Lvl;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1}, Lvl;->size()I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v1, "invalid key size: "

    .line 121
    .line 122
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string p1, ". Valid keys must have 64 bytes."

    .line 129
    .line 130
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-direct {p0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw p0

    .line 141
    :pswitch_4
    check-cast p1, Li6;

    .line 142
    .line 143
    invoke-virtual {p1}, Li6;->z()I

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    invoke-static {p0}, Lr13;->c(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Li6;->y()Lvl;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {p0}, Lvl;->size()I

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    invoke-static {p0}, Lr13;->a(I)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :pswitch_5
    check-cast p1, La6;

    .line 163
    .line 164
    invoke-virtual {p1}, La6;->z()I

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    invoke-static {p0}, Lr13;->c(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1}, La6;->y()Lvl;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {p0}, Lvl;->size()I

    .line 176
    .line 177
    .line 178
    move-result p0

    .line 179
    invoke-static {p0}, Lr13;->a(I)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :pswitch_6
    check-cast p1, Lq5;

    .line 184
    .line 185
    invoke-virtual {p1}, Lq5;->B()I

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    invoke-static {p0}, Lr13;->c(I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1}, Lq5;->z()Lvl;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-virtual {p0}, Lvl;->size()I

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    invoke-static {p0}, Lr13;->a(I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1}, Lq5;->A()Lw5;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-virtual {p0}, Lw5;->y()I

    .line 208
    .line 209
    .line 210
    move-result p0

    .line 211
    if-eq p0, v1, :cond_4

    .line 212
    .line 213
    invoke-virtual {p1}, Lq5;->A()Lw5;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-virtual {p0}, Lw5;->y()I

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    if-ne p0, v2, :cond_3

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_3
    const-string p0, "invalid IV size; acceptable values have 12 or 16 bytes"

    .line 225
    .line 226
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    :cond_4
    :goto_2
    return-void

    .line 230
    :pswitch_7
    check-cast p1, Lx4;

    .line 231
    .line 232
    invoke-virtual {p1}, Lx4;->B()I

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    invoke-static {p0}, Lr13;->c(I)V

    .line 237
    .line 238
    .line 239
    new-instance p0, Lo4;

    .line 240
    .line 241
    const-class v3, Lh5;

    .line 242
    .line 243
    const/4 v4, 0x2

    .line 244
    invoke-direct {p0, v4, v3}, Lo4;-><init>(ILjava/lang/Class;)V

    .line 245
    .line 246
    .line 247
    filled-new-array {p0}, [Lo4;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    new-instance v3, Ljava/util/HashMap;

    .line 252
    .line 253
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 254
    .line 255
    .line 256
    const/4 v4, 0x0

    .line 257
    aget-object v5, p0, v4

    .line 258
    .line 259
    iget-object v6, v5, Lo4;->a:Ljava/lang/Class;

    .line 260
    .line 261
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    iget-object v7, v5, Lo4;->a:Ljava/lang/Class;

    .line 266
    .line 267
    const-string v8, "KeyTypeManager constructed with duplicate factories for primitive "

    .line 268
    .line 269
    if-nez v6, :cond_8

    .line 270
    .line 271
    invoke-virtual {v3, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    aget-object p0, p0, v4

    .line 275
    .line 276
    iget-object p0, p0, Lo4;->a:Ljava/lang/Class;

    .line 277
    .line 278
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1}, Lx4;->z()Lj5;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-virtual {p0}, Lj5;->C()I

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    invoke-static {v3}, Lr13;->c(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p0}, Lj5;->A()Lvl;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    invoke-virtual {v3}, Lvl;->size()I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    invoke-static {v3}, Lr13;->a(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p0}, Lj5;->B()Ln5;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    invoke-virtual {p0}, Ln5;->y()I

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    if-lt v3, v1, :cond_7

    .line 312
    .line 313
    invoke-virtual {p0}, Ln5;->y()I

    .line 314
    .line 315
    .line 316
    move-result p0

    .line 317
    if-gt p0, v2, :cond_7

    .line 318
    .line 319
    new-instance p0, Lo4;

    .line 320
    .line 321
    const-class v1, Lwa1;

    .line 322
    .line 323
    const/16 v3, 0x8

    .line 324
    .line 325
    invoke-direct {p0, v3, v1}, Lo4;-><init>(ILjava/lang/Class;)V

    .line 326
    .line 327
    .line 328
    filled-new-array {p0}, [Lo4;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    new-instance v1, Ljava/util/HashMap;

    .line 333
    .line 334
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 335
    .line 336
    .line 337
    aget-object v3, p0, v4

    .line 338
    .line 339
    iget-object v5, v3, Lo4;->a:Ljava/lang/Class;

    .line 340
    .line 341
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    iget-object v6, v3, Lo4;->a:Ljava/lang/Class;

    .line 346
    .line 347
    if-nez v5, :cond_6

    .line 348
    .line 349
    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    aget-object p0, p0, v4

    .line 353
    .line 354
    iget-object p0, p0, Lo4;->a:Ljava/lang/Class;

    .line 355
    .line 356
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 357
    .line 358
    .line 359
    invoke-virtual {p1}, Lx4;->A()Lmu0;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    invoke-virtual {p0}, Lmu0;->C()I

    .line 364
    .line 365
    .line 366
    move-result p1

    .line 367
    invoke-static {p1}, Lr13;->c(I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {p0}, Lmu0;->A()Lvl;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    invoke-virtual {p1}, Lvl;->size()I

    .line 375
    .line 376
    .line 377
    move-result p1

    .line 378
    if-lt p1, v2, :cond_5

    .line 379
    .line 380
    invoke-virtual {p0}, Lmu0;->B()Lsu0;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    invoke-static {p0}, Lq4;->E(Lsu0;)V

    .line 385
    .line 386
    .line 387
    goto :goto_3

    .line 388
    :cond_5
    invoke-static {v0}, Lds0;->t(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    goto :goto_3

    .line 392
    :cond_6
    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    invoke-static {p0, v8}, Ln4;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    goto :goto_3

    .line 400
    :cond_7
    const-string p0, "invalid IV size"

    .line 401
    .line 402
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    goto :goto_3

    .line 406
    :cond_8
    invoke-virtual {v7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object p0

    .line 410
    invoke-static {p0, v8}, Ln4;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    :goto_3
    return-void

    .line 414
    :pswitch_8
    check-cast p1, Lmu0;

    .line 415
    .line 416
    invoke-virtual {p1}, Lmu0;->C()I

    .line 417
    .line 418
    .line 419
    move-result p0

    .line 420
    invoke-static {p0}, Lr13;->c(I)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {p1}, Lmu0;->A()Lvl;

    .line 424
    .line 425
    .line 426
    move-result-object p0

    .line 427
    invoke-virtual {p0}, Lvl;->size()I

    .line 428
    .line 429
    .line 430
    move-result p0

    .line 431
    if-lt p0, v2, :cond_9

    .line 432
    .line 433
    invoke-virtual {p1}, Lmu0;->B()Lsu0;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    invoke-static {p0}, Lq4;->E(Lsu0;)V

    .line 438
    .line 439
    .line 440
    goto :goto_4

    .line 441
    :cond_9
    invoke-static {v0}, Lds0;->t(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    :goto_4
    return-void

    .line 445
    :pswitch_9
    check-cast p1, Lj4;

    .line 446
    .line 447
    invoke-virtual {p1}, Lj4;->B()I

    .line 448
    .line 449
    .line 450
    move-result p0

    .line 451
    invoke-static {p0}, Lr13;->c(I)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {p1}, Lj4;->z()Lvl;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    invoke-virtual {p0}, Lvl;->size()I

    .line 459
    .line 460
    .line 461
    move-result p0

    .line 462
    if-ne p0, v3, :cond_a

    .line 463
    .line 464
    invoke-virtual {p1}, Lj4;->A()Lu4;

    .line 465
    .line 466
    .line 467
    move-result-object p0

    .line 468
    invoke-static {p0}, Lq4;->D(Lu4;)V

    .line 469
    .line 470
    .line 471
    goto :goto_5

    .line 472
    :cond_a
    const-string p0, "AesCmacKey size wrong, must be 32 bytes"

    .line 473
    .line 474
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    :goto_5
    return-void

    .line 478
    nop

    .line 479
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
