.class public final Lb10;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlinx/serialization/KSerializer;


# instance fields
.field public final synthetic a:I

.field public final b:Lkotlinx/serialization/KSerializer;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Lkotlinx/serialization/descriptors/SerialDescriptor;


# direct methods
.method public constructor <init>(Ldv;Lkotlinx/serialization/KSerializer;[Lkotlinx/serialization/KSerializer;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lb10;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lb10;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lb10;->b:Lkotlinx/serialization/KSerializer;

    .line 10
    .line 11
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Lb10;->d:Ljava/lang/Object;

    .line 19
    .line 20
    sget-object p2, Lba2;->k:Lba2;

    .line 21
    .line 22
    new-array p3, v0, [Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 23
    .line 24
    new-instance v0, Lo;

    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    invoke-direct {v0, p0, v1}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    const-string v1, "kotlinx.serialization.ContextualSerializer"

    .line 31
    .line 32
    invoke-static {v1, p2, p3, v0}, Lhu0;->K(Ljava/lang/String;Lpy0;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Laa2;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    new-instance p3, Lx00;

    .line 37
    .line 38
    invoke-direct {p3, p2, p1}, Lx00;-><init>(Laa2;Ldv;)V

    .line 39
    .line 40
    .line 41
    iput-object p3, p0, Lb10;->e:Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb10;->a:I

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lb10;->b:Lkotlinx/serialization/KSerializer;

    .line 46
    iput-object p2, p0, Lb10;->c:Ljava/lang/Object;

    .line 47
    iput-object p3, p0, Lb10;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 48
    new-array p1, p1, [Lkotlinx/serialization/descriptors/SerialDescriptor;

    new-instance p2, Lo;

    const/16 p3, 0x14

    invoke-direct {p2, p0, p3}, Lo;-><init>(Ljava/lang/Object;I)V

    const-string p3, "kotlin.Triple"

    invoke-static {p3, p1, p2}, Lhu0;->J(Ljava/lang/String;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Laa2;

    move-result-object p1

    iput-object p1, p0, Lb10;->e:Lkotlinx/serialization/descriptors/SerialDescriptor;

    return-void
.end method


# virtual methods
.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lb10;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lb10;->b:Lkotlinx/serialization/KSerializer;

    .line 4
    .line 5
    iget-object v2, p0, Lb10;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lb10;->d:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lb10;->e:Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 14
    .line 15
    check-cast p0, Laa2;

    .line 16
    .line 17
    invoke-interface {p1, p0}, Lkotlinx/serialization/encoding/Decoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lky;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object v0, Lpy0;->g:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v5, v0

    .line 24
    move-object v6, v5

    .line 25
    move-object v7, v6

    .line 26
    :goto_0
    invoke-interface {p1, p0}, Lky;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 27
    .line 28
    .line 29
    move-result v8

    .line 30
    const/4 v9, -0x1

    .line 31
    if-eq v8, v9, :cond_3

    .line 32
    .line 33
    if-eqz v8, :cond_2

    .line 34
    .line 35
    const/4 v9, 0x1

    .line 36
    if-eq v8, v9, :cond_1

    .line 37
    .line 38
    const/4 v7, 0x2

    .line 39
    if-ne v8, v7, :cond_0

    .line 40
    .line 41
    move-object v8, v3

    .line 42
    check-cast v8, Lkotlinx/serialization/KSerializer;

    .line 43
    .line 44
    invoke-interface {p1, p0, v7, v8, v4}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p0, Lea2;

    .line 50
    .line 51
    const-string p1, "Unexpected index "

    .line 52
    .line 53
    invoke-static {v8, p1}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p0

    .line 61
    :cond_1
    move-object v6, v2

    .line 62
    check-cast v6, Lkotlinx/serialization/KSerializer;

    .line 63
    .line 64
    invoke-interface {p1, p0, v9, v6, v4}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    const/4 v5, 0x0

    .line 70
    invoke-interface {p1, p0, v5, v1, v4}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    invoke-interface {p1, p0}, Lky;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 76
    .line 77
    .line 78
    if-eq v5, v0, :cond_6

    .line 79
    .line 80
    if-eq v6, v0, :cond_5

    .line 81
    .line 82
    if-eq v7, v0, :cond_4

    .line 83
    .line 84
    new-instance p0, Lzr2;

    .line 85
    .line 86
    invoke-direct {p0, v5, v6, v7}, Lzr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_4
    new-instance p0, Lea2;

    .line 91
    .line 92
    const-string p1, "Element \'third\' is missing"

    .line 93
    .line 94
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p0

    .line 98
    :cond_5
    new-instance p0, Lea2;

    .line 99
    .line 100
    const-string p1, "Element \'second\' is missing"

    .line 101
    .line 102
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p0

    .line 106
    :cond_6
    new-instance p0, Lea2;

    .line 107
    .line 108
    const-string p1, "Element \'first\' is missing"

    .line 109
    .line 110
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p0

    .line 114
    :pswitch_0
    invoke-interface {p1}, Lkotlinx/serialization/encoding/Decoder;->a()Lb5;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast v2, Ldv;

    .line 119
    .line 120
    check-cast v3, Ljava/util/List;

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object p0, p0, Lb5;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p0, Ljava/util/Map;

    .line 131
    .line 132
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    if-nez p0, :cond_7

    .line 137
    .line 138
    invoke-interface {p1, v1}, Lkotlinx/serialization/encoding/Decoder;->u(Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    goto :goto_1

    .line 143
    :cond_7
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 144
    .line 145
    .line 146
    :goto_1
    return-object v4

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    .line 1
    iget v0, p0, Lb10;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lb10;->e:Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 7
    .line 8
    check-cast p0, Laa2;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lb10;->e:Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 12
    .line 13
    check-cast p0, Lx00;

    .line 14
    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lb10;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lb10;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lb10;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lb10;->b:Lkotlinx/serialization/KSerializer;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p2, Lzr2;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lb10;->e:Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 18
    .line 19
    check-cast p0, Laa2;

    .line 20
    .line 21
    invoke-interface {p1, p0}, Lkotlinx/serialization/encoding/Encoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lly;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v0, 0x0

    .line 26
    iget-object v4, p2, Lzr2;->a:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-interface {p1, p0, v0, v3, v4}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    check-cast v2, Lkotlinx/serialization/KSerializer;

    .line 32
    .line 33
    iget-object v0, p2, Lzr2;->b:Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    invoke-interface {p1, p0, v3, v2, v0}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    check-cast v1, Lkotlinx/serialization/KSerializer;

    .line 40
    .line 41
    iget-object p2, p2, Lzr2;->c:Ljava/lang/Object;

    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    invoke-interface {p1, p0, v0, v1, p2}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1, p0}, Lly;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-interface {p1}, Lkotlinx/serialization/encoding/Encoder;->a()Lb5;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast v2, Ldv;

    .line 59
    .line 60
    check-cast v1, Ljava/util/List;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, Lb5;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, Ljava/util/Map;

    .line 71
    .line 72
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-nez p0, :cond_0

    .line 77
    .line 78
    invoke-interface {p1, v3, p2}, Lkotlinx/serialization/encoding/Encoder;->A(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 83
    .line 84
    .line 85
    :goto_0
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
