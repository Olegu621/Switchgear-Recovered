.class public Lph3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/Class;

.field public final c:Z

.field public final d:Z

.field public final e:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;ZZ)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_a

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/16 v3, 0x5a

    .line 17
    .line 18
    const/16 v4, 0x41

    .line 19
    .line 20
    const/16 v5, 0x7a

    .line 21
    .line 22
    const/16 v6, 0x61

    .line 23
    .line 24
    if-lt v2, v6, :cond_0

    .line 25
    .line 26
    if-le v2, v5, :cond_1

    .line 27
    .line 28
    :cond_0
    if-lt v2, v4, :cond_9

    .line 29
    .line 30
    if-gt v2, v3, :cond_9

    .line 31
    .line 32
    :cond_1
    const/4 v2, 0x1

    .line 33
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-ge v2, v7, :cond_7

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-lt v7, v6, :cond_2

    .line 44
    .line 45
    if-le v7, v5, :cond_5

    .line 46
    .line 47
    :cond_2
    if-lt v7, v4, :cond_3

    .line 48
    .line 49
    if-gt v7, v3, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    const/16 v8, 0x30

    .line 53
    .line 54
    if-lt v7, v8, :cond_4

    .line 55
    .line 56
    const/16 v8, 0x39

    .line 57
    .line 58
    if-le v7, v8, :cond_5

    .line 59
    .line 60
    :cond_4
    const/16 v8, 0x5f

    .line 61
    .line 62
    if-ne v7, v8, :cond_6

    .line 63
    .line 64
    :cond_5
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_6
    const-string p0, "identifier must contain only ASCII letters, digits or underscore: "

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v1

    .line 77
    :cond_7
    iput-object p1, p0, Lph3;->a:Ljava/lang/String;

    .line 78
    .line 79
    iput-object p2, p0, Lph3;->b:Ljava/lang/Class;

    .line 80
    .line 81
    iput-boolean p3, p0, Lph3;->c:Z

    .line 82
    .line 83
    iput-boolean p4, p0, Lph3;->d:Z

    .line 84
    .line 85
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    const-wide/16 p2, 0x0

    .line 90
    .line 91
    :goto_2
    const/4 p4, 0x5

    .line 92
    if-ge v0, p4, :cond_8

    .line 93
    .line 94
    and-int/lit8 p4, p1, 0x3f

    .line 95
    .line 96
    const-wide/16 v1, 0x1

    .line 97
    .line 98
    shl-long/2addr v1, p4

    .line 99
    or-long/2addr p2, v1

    .line 100
    ushr-int/lit8 p1, p1, 0x6

    .line 101
    .line 102
    add-int/lit8 v0, v0, 0x1

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_8
    iput-wide p2, p0, Lph3;->e:J

    .line 106
    .line 107
    return-void

    .line 108
    :cond_9
    const-string p0, "identifier must start with an ASCII letter: "

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    :cond_a
    const-string p0, "identifier must not be empty"

    .line 119
    .line 120
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v1
.end method


# virtual methods
.method public a(Ljava/util/Iterator;Lii3;)V
    .locals 1

    .line 1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0, p2}, Lph3;->b(Ljava/lang/Object;Lii3;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;Lii3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lph3;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p2, p0, p1}, Lii3;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Ljava/util/Iterator;Lii3;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lph3;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lph3;->d:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    sget-object v0, Lxk3;->b:Lg5;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lxk3;

    .line 16
    .line 17
    iget v0, v0, Lxk3;->a:I

    .line 18
    .line 19
    const/16 v1, 0x14

    .line 20
    .line 21
    if-le v0, v1, :cond_1

    .line 22
    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lph3;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p2, v0, v1}, Lii3;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void

    .line 40
    :cond_1
    invoke-virtual {p0, p1, p2}, Lph3;->a(Ljava/util/Iterator;Lii3;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    const-string p0, "non repeating key"

    .line 45
    .line 46
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lph3;->b:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object p0, p0, Lph3;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    new-instance v5, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    add-int/2addr v2, v3

    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    add-int/2addr v2, v4

    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 40
    .line 41
    .line 42
    const-string v2, "/"

    .line 43
    .line 44
    const-string v3, "["

    .line 45
    .line 46
    invoke-static {v5, v0, v2, p0, v3}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string p0, "]"

    .line 50
    .line 51
    invoke-static {v5, v1, p0}, Lfm0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method
