.class public final Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;,
        Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$Companion;

.field public static final r:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Lfj0;

.field public final h:Z

.field public final i:Lbm;

.field public final j:Z

.field public final k:I

.field public final l:Z

.field public final m:Z

.field public final n:Ljava/lang/String;

.field public final o:Z

.field public final p:Ljava/lang/String;

.field public final q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->Companion:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$Companion;

    .line 7
    .line 8
    new-instance v0, Loe0;

    .line 9
    .line 10
    const-string v1, "com.usercentrics.sdk.v2.settings.data.FirstLayerMobileVariant"

    .line 11
    .line 12
    invoke-static {}, Lfj0;->values()[Lfj0;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v0, v1, v2}, Loe0;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Loe0;

    .line 20
    .line 21
    const-string v2, "com.usercentrics.sdk.v2.settings.data.CCPARegion"

    .line 22
    .line 23
    invoke-static {}, Lbm;->values()[Lbm;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-direct {v1, v2, v3}, Loe0;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 28
    .line 29
    .line 30
    const/16 v2, 0x11

    .line 31
    .line 32
    new-array v2, v2, [Lkotlinx/serialization/KSerializer;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    aput-object v4, v2, v3

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    aput-object v4, v2, v3

    .line 40
    .line 41
    const/4 v3, 0x2

    .line 42
    aput-object v4, v2, v3

    .line 43
    .line 44
    const/4 v3, 0x3

    .line 45
    aput-object v4, v2, v3

    .line 46
    .line 47
    const/4 v3, 0x4

    .line 48
    aput-object v4, v2, v3

    .line 49
    .line 50
    const/4 v3, 0x5

    .line 51
    aput-object v4, v2, v3

    .line 52
    .line 53
    const/4 v3, 0x6

    .line 54
    aput-object v0, v2, v3

    .line 55
    .line 56
    const/4 v0, 0x7

    .line 57
    aput-object v4, v2, v0

    .line 58
    .line 59
    const/16 v0, 0x8

    .line 60
    .line 61
    aput-object v1, v2, v0

    .line 62
    .line 63
    const/16 v0, 0x9

    .line 64
    .line 65
    aput-object v4, v2, v0

    .line 66
    .line 67
    const/16 v0, 0xa

    .line 68
    .line 69
    aput-object v4, v2, v0

    .line 70
    .line 71
    const/16 v0, 0xb

    .line 72
    .line 73
    aput-object v4, v2, v0

    .line 74
    .line 75
    const/16 v0, 0xc

    .line 76
    .line 77
    aput-object v4, v2, v0

    .line 78
    .line 79
    const/16 v0, 0xd

    .line 80
    .line 81
    aput-object v4, v2, v0

    .line 82
    .line 83
    const/16 v0, 0xe

    .line 84
    .line 85
    aput-object v4, v2, v0

    .line 86
    .line 87
    const/16 v0, 0xf

    .line 88
    .line 89
    aput-object v4, v2, v0

    .line 90
    .line 91
    const/16 v0, 0x10

    .line 92
    .line 93
    aput-object v4, v2, v0

    .line 94
    .line 95
    sput-object v2, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->r:[Lkotlinx/serialization/KSerializer;

    .line 96
    .line 97
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj0;ZLbm;ZIZZLjava/lang/String;ZLjava/lang/String;Z)V
    .locals 3

    and-int/lit8 v0, p1, 0x3f

    const/4 v1, 0x0

    const/16 v2, 0x3f

    if-ne v2, v0, :cond_b

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->e:Ljava/lang/String;

    iput-object p7, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->f:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_0

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->g:Lfj0;

    goto :goto_0

    :cond_0
    iput-object p8, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->g:Lfj0;

    :goto_0
    and-int/lit16 p2, p1, 0x80

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-boolean p3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->h:Z

    goto :goto_1

    :cond_1
    iput-boolean p9, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->h:Z

    :goto_1
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_2

    .line 2
    sget-object p2, Lbm;->a:Lbm;

    .line 3
    iput-object p2, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->i:Lbm;

    goto :goto_2

    :cond_2
    iput-object p10, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->i:Lbm;

    :goto_2
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_3

    iput-boolean p3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->j:Z

    goto :goto_3

    :cond_3
    iput-boolean p11, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->j:Z

    :goto_3
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_4

    const/16 p2, 0x16d

    iput p2, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->k:I

    goto :goto_4

    :cond_4
    iput p12, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->k:I

    :goto_4
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_5

    iput-boolean p3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->l:Z

    goto :goto_5

    :cond_5
    move/from16 p2, p13

    iput-boolean p2, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->l:Z

    :goto_5
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_6

    iput-boolean p3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->m:Z

    goto :goto_6

    :cond_6
    move/from16 p2, p14

    iput-boolean p2, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->m:Z

    :goto_6
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_7

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->n:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->n:Ljava/lang/String;

    :goto_7
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_8

    iput-boolean p3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->o:Z

    goto :goto_8

    :cond_8
    move/from16 p2, p16

    iput-boolean p2, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->o:Z

    :goto_8
    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_9

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->p:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->p:Ljava/lang/String;

    :goto_9
    const/high16 p2, 0x10000

    and-int/2addr p1, p2

    if-nez p1, :cond_a

    iput-boolean p3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->q:Z

    return-void

    :cond_a
    move/from16 p1, p18

    iput-boolean p1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->q:Z

    return-void

    :cond_b
    sget-object p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;

    invoke-virtual {p0}, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p0

    invoke-static {p1, v2, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    throw v1
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
    instance-of v1, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

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
    check-cast p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->a:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->b:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->c:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->d:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->e:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->f:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->g:Lfj0;

    .line 80
    .line 81
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->g:Lfj0;

    .line 82
    .line 83
    if-eq v1, v3, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->h:Z

    .line 87
    .line 88
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->h:Z

    .line 89
    .line 90
    if-eq v1, v3, :cond_9

    .line 91
    .line 92
    return v2

    .line 93
    :cond_9
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->i:Lbm;

    .line 94
    .line 95
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->i:Lbm;

    .line 96
    .line 97
    if-eq v1, v3, :cond_a

    .line 98
    .line 99
    return v2

    .line 100
    :cond_a
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->j:Z

    .line 101
    .line 102
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->j:Z

    .line 103
    .line 104
    if-eq v1, v3, :cond_b

    .line 105
    .line 106
    return v2

    .line 107
    :cond_b
    iget v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->k:I

    .line 108
    .line 109
    iget v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->k:I

    .line 110
    .line 111
    if-eq v1, v3, :cond_c

    .line 112
    .line 113
    return v2

    .line 114
    :cond_c
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->l:Z

    .line 115
    .line 116
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->l:Z

    .line 117
    .line 118
    if-eq v1, v3, :cond_d

    .line 119
    .line 120
    return v2

    .line 121
    :cond_d
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->m:Z

    .line 122
    .line 123
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->m:Z

    .line 124
    .line 125
    if-eq v1, v3, :cond_e

    .line 126
    .line 127
    return v2

    .line 128
    :cond_e
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->n:Ljava/lang/String;

    .line 129
    .line 130
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->n:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-nez v1, :cond_f

    .line 137
    .line 138
    return v2

    .line 139
    :cond_f
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->o:Z

    .line 140
    .line 141
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->o:Z

    .line 142
    .line 143
    if-eq v1, v3, :cond_10

    .line 144
    .line 145
    return v2

    .line 146
    :cond_10
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->p:Ljava/lang/String;

    .line 147
    .line 148
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->p:Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-nez v1, :cond_11

    .line 155
    .line 156
    return v2

    .line 157
    :cond_11
    iget-boolean p0, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->q:Z

    .line 158
    .line 159
    iget-boolean p1, p1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->q:Z

    .line 160
    .line 161
    if-eq p0, p1, :cond_12

    .line 162
    .line 163
    return v2

    .line 164
    :cond_12
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v2, 0x0

    .line 41
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->g:Lfj0;

    .line 42
    .line 43
    if-nez v3, :cond_0

    .line 44
    .line 45
    move v3, v2

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    :goto_0
    add-int/2addr v0, v3

    .line 52
    mul-int/2addr v0, v1

    .line 53
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->h:Z

    .line 54
    .line 55
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->i:Lbm;

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    add-int/2addr v3, v0

    .line 66
    mul-int/2addr v3, v1

    .line 67
    iget-boolean v0, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->j:Z

    .line 68
    .line 69
    invoke-static {v3, v1, v0}, Len;->h(IIZ)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget v3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->k:I

    .line 74
    .line 75
    invoke-static {v3, v0, v1}, Lcom/appsflyer/internal/j;->a(III)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->l:Z

    .line 80
    .line 81
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->m:Z

    .line 86
    .line 87
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->n:Ljava/lang/String;

    .line 92
    .line 93
    if-nez v3, :cond_1

    .line 94
    .line 95
    move v3, v2

    .line 96
    goto :goto_1

    .line 97
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    :goto_1
    add-int/2addr v0, v3

    .line 102
    mul-int/2addr v0, v1

    .line 103
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->o:Z

    .line 104
    .line 105
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->p:Ljava/lang/String;

    .line 110
    .line 111
    if-nez v3, :cond_2

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    :goto_2
    add-int/2addr v0, v2

    .line 119
    mul-int/2addr v0, v1

    .line 120
    iget-boolean p0, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->q:Z

    .line 121
    .line 122
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    add-int/2addr p0, v0

    .line 127
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", btnSave="

    .line 2
    .line 3
    const-string v1, ", firstLayerTitle="

    .line 4
    .line 5
    const-string v2, "CCPASettings(optOutNoticeLabel="

    .line 6
    .line 7
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Len;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", secondLayerTitle="

    .line 16
    .line 17
    const-string v2, ", secondLayerDescription="

    .line 18
    .line 19
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", btnMoreInfo="

    .line 27
    .line 28
    const-string v2, ", firstLayerMobileVariant="

    .line 29
    .line 30
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->f:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->g:Lfj0;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", isActive="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->h:Z

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", region="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->i:Lbm;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", showOnPageLoad="

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->j:Z

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, ", reshowAfterDays="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->k:I

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", iabAgreementExists="

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->l:Z

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ", removeDoNotSellToggle="

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->m:Z

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ", appFirstLayerDescription="

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->n:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, ", firstLayerMobileDescriptionIsActive="

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->o:Z

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v1, ", firstLayerMobileDescription="

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->p:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v1, ", secondLayerHideLanguageSwitch="

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v1, ")"

    .line 138
    .line 139
    iget-boolean p0, p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->q:Z

    .line 140
    .line 141
    invoke-static {v0, p0, v1}, Len;->o(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    return-object p0
.end method
