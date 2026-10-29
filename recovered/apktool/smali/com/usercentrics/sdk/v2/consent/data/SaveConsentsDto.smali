.class public final Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto$$serializer;,
        Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto$Companion;

.field public static final q:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/util/List;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Z

.field public final n:Z

.field public final o:Ljava/lang/String;

.field public final p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->Companion:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto$Companion;

    .line 7
    .line 8
    new-instance v0, Lgd;

    .line 9
    .line 10
    sget-object v1, Lcom/usercentrics/sdk/v2/consent/data/ConsentStatusDto$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/consent/data/ConsentStatusDto$$serializer;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x10

    .line 17
    .line 18
    new-array v1, v1, [Lkotlinx/serialization/KSerializer;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aput-object v3, v1, v2

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    aput-object v3, v1, v2

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    aput-object v3, v1, v2

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    aput-object v3, v1, v2

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    aput-object v3, v1, v2

    .line 34
    .line 35
    const/4 v2, 0x5

    .line 36
    aput-object v3, v1, v2

    .line 37
    .line 38
    const/4 v2, 0x6

    .line 39
    aput-object v3, v1, v2

    .line 40
    .line 41
    const/4 v2, 0x7

    .line 42
    aput-object v3, v1, v2

    .line 43
    .line 44
    const/16 v2, 0x8

    .line 45
    .line 46
    aput-object v0, v1, v2

    .line 47
    .line 48
    const/16 v0, 0x9

    .line 49
    .line 50
    aput-object v3, v1, v0

    .line 51
    .line 52
    const/16 v0, 0xa

    .line 53
    .line 54
    aput-object v3, v1, v0

    .line 55
    .line 56
    const/16 v0, 0xb

    .line 57
    .line 58
    aput-object v3, v1, v0

    .line 59
    .line 60
    const/16 v0, 0xc

    .line 61
    .line 62
    aput-object v3, v1, v0

    .line 63
    .line 64
    const/16 v0, 0xd

    .line 65
    .line 66
    aput-object v3, v1, v0

    .line 67
    .line 68
    const/16 v0, 0xe

    .line 69
    .line 70
    aput-object v3, v1, v0

    .line 71
    .line 72
    const/16 v0, 0xf

    .line 73
    .line 74
    aput-object v3, v1, v0

    .line 75
    .line 76
    sput-object v1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->q:[Lkotlinx/serialization/KSerializer;

    .line 77
    .line 78
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V
    .locals 2

    and-int/lit16 v0, p1, 0x7fff

    const/16 v1, 0x7fff

    if-ne v1, v0, :cond_1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->e:Ljava/lang/String;

    iput-object p7, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->f:Ljava/lang/String;

    iput-object p8, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->g:Ljava/lang/String;

    iput-object p9, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->h:Ljava/lang/String;

    iput-object p10, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->i:Ljava/util/List;

    iput-object p11, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->j:Ljava/lang/String;

    iput-object p12, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->k:Ljava/lang/String;

    iput-object p13, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->l:Ljava/lang/String;

    move/from16 p2, p14

    iput-boolean p2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->m:Z

    move/from16 p2, p15

    iput-boolean p2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->n:Z

    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->o:Ljava/lang/String;

    const p2, 0x8000

    and-int/2addr p1, p2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->p:Z

    return-void

    :cond_0
    move/from16 p1, p17

    goto :goto_0

    :cond_1
    sget-object p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto$$serializer;

    invoke-virtual {p0}, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p0

    invoke-static {p1, v1, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V
    .locals 0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->d:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->e:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->f:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->g:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->h:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->i:Ljava/util/List;

    .line 12
    iput-object p10, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->j:Ljava/lang/String;

    .line 13
    const-string p1, "2.24.4"

    iput-object p1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->k:Ljava/lang/String;

    .line 14
    iput-object p11, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->l:Ljava/lang/String;

    .line 15
    iput-boolean p12, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->m:Z

    .line 16
    iput-boolean p13, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->n:Z

    .line 17
    iput-object p14, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->o:Ljava/lang/String;

    .line 18
    iput-boolean p15, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->p:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;

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
    check-cast p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->f:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->g:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->g:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->h:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->h:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_9

    .line 99
    .line 100
    return v2

    .line 101
    :cond_9
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->i:Ljava/util/List;

    .line 102
    .line 103
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->i:Ljava/util/List;

    .line 104
    .line 105
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_a

    .line 110
    .line 111
    return v2

    .line 112
    :cond_a
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->j:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->j:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_b

    .line 121
    .line 122
    return v2

    .line 123
    :cond_b
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->k:Ljava/lang/String;

    .line 124
    .line 125
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->k:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_c

    .line 132
    .line 133
    return v2

    .line 134
    :cond_c
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->l:Ljava/lang/String;

    .line 135
    .line 136
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->l:Ljava/lang/String;

    .line 137
    .line 138
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_d

    .line 143
    .line 144
    return v2

    .line 145
    :cond_d
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->m:Z

    .line 146
    .line 147
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->m:Z

    .line 148
    .line 149
    if-eq v1, v3, :cond_e

    .line 150
    .line 151
    return v2

    .line 152
    :cond_e
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->n:Z

    .line 153
    .line 154
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->n:Z

    .line 155
    .line 156
    if-eq v1, v3, :cond_f

    .line 157
    .line 158
    return v2

    .line 159
    :cond_f
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->o:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->o:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-nez v1, :cond_10

    .line 168
    .line 169
    return v2

    .line 170
    :cond_10
    iget-boolean p0, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->p:Z

    .line 171
    .line 172
    iget-boolean p1, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->p:Z

    .line 173
    .line 174
    if-eq p0, p1, :cond_11

    .line 175
    .line 176
    return v2

    .line 177
    :cond_11
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->i:Ljava/util/List;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->k:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->l:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-boolean v2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->m:Z

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, Len;->h(IIZ)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-boolean v2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->n:Z

    .line 83
    .line 84
    invoke-static {v0, v1, v2}, Len;->h(IIZ)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->o:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-boolean p0, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->p:Z

    .line 95
    .line 96
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    add-int/2addr p0, v0

    .line 101
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", appVersion="

    .line 2
    .line 3
    const-string v1, ", controllerId="

    .line 4
    .line 5
    const-string v2, "SaveConsentsDto(action="

    .line 6
    .line 7
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Len;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", language="

    .line 16
    .line 17
    const-string v2, ", settingsId="

    .line 18
    .line 19
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", settingsVersion="

    .line 27
    .line 28
    const-string v2, ", consentString="

    .line 29
    .line 30
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->f:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", consentMeta="

    .line 38
    .line 39
    const-string v2, ", consents="

    .line 40
    .line 41
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->g:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->h:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->i:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", bundleId="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", sdkVersion="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", userOS="

    .line 69
    .line 70
    const-string v2, ", xdevice="

    .line 71
    .line 72
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->k:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->l:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->m:Z

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", analytics="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->n:Z

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", acString="

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->o:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ", webhook="

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-boolean p0, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->p:Z

    .line 110
    .line 111
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string p0, ")"

    .line 115
    .line 116
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0
.end method
