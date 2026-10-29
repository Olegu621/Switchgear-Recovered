.class public final Lcom/usercentrics/tcf/core/model/gvl/Vendor;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;,
        Lcom/usercentrics/tcf/core/model/gvl/Vendor$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/tcf/core/model/gvl/Vendor$Companion;

.field public static final t:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/List;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Lcom/usercentrics/tcf/core/model/gvl/Overflow;

.field public final j:Ljava/lang/Double;

.field public final k:Z

.field public final l:Ljava/lang/String;

.field public final m:Z

.field public final n:Ljava/lang/Boolean;

.field public final o:I

.field public final p:Ljava/lang/String;

.field public final q:Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/usercentrics/tcf/core/model/gvl/Vendor$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->Companion:Lcom/usercentrics/tcf/core/model/gvl/Vendor$Companion;

    .line 7
    .line 8
    new-instance v0, Lgd;

    .line 9
    .line 10
    sget-object v1, Laz0;->a:Laz0;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 14
    .line 15
    .line 16
    new-instance v3, Lgd;

    .line 17
    .line 18
    invoke-direct {v3, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lgd;

    .line 22
    .line 23
    invoke-direct {v4, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 24
    .line 25
    .line 26
    new-instance v5, Lgd;

    .line 27
    .line 28
    invoke-direct {v5, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 29
    .line 30
    .line 31
    new-instance v6, Lgd;

    .line 32
    .line 33
    invoke-direct {v6, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 34
    .line 35
    .line 36
    new-instance v7, Lgd;

    .line 37
    .line 38
    invoke-direct {v7, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 39
    .line 40
    .line 41
    new-instance v8, Lgd;

    .line 42
    .line 43
    sget-object v9, Lcom/usercentrics/tcf/core/model/gvl/VendorUrl$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/VendorUrl$$serializer;

    .line 44
    .line 45
    invoke-direct {v8, v9, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 46
    .line 47
    .line 48
    new-instance v9, Lgd;

    .line 49
    .line 50
    invoke-direct {v9, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 51
    .line 52
    .line 53
    const/16 v1, 0x13

    .line 54
    .line 55
    new-array v1, v1, [Lkotlinx/serialization/KSerializer;

    .line 56
    .line 57
    aput-object v0, v1, v2

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    aput-object v3, v1, v0

    .line 61
    .line 62
    const/4 v0, 0x2

    .line 63
    aput-object v4, v1, v0

    .line 64
    .line 65
    const/4 v0, 0x3

    .line 66
    aput-object v5, v1, v0

    .line 67
    .line 68
    const/4 v0, 0x4

    .line 69
    aput-object v6, v1, v0

    .line 70
    .line 71
    const/4 v0, 0x5

    .line 72
    aput-object v7, v1, v0

    .line 73
    .line 74
    const/4 v0, 0x6

    .line 75
    const/4 v2, 0x0

    .line 76
    aput-object v2, v1, v0

    .line 77
    .line 78
    const/4 v0, 0x7

    .line 79
    aput-object v2, v1, v0

    .line 80
    .line 81
    const/16 v0, 0x8

    .line 82
    .line 83
    aput-object v2, v1, v0

    .line 84
    .line 85
    const/16 v0, 0x9

    .line 86
    .line 87
    aput-object v2, v1, v0

    .line 88
    .line 89
    const/16 v0, 0xa

    .line 90
    .line 91
    aput-object v2, v1, v0

    .line 92
    .line 93
    const/16 v0, 0xb

    .line 94
    .line 95
    aput-object v2, v1, v0

    .line 96
    .line 97
    const/16 v0, 0xc

    .line 98
    .line 99
    aput-object v2, v1, v0

    .line 100
    .line 101
    const/16 v0, 0xd

    .line 102
    .line 103
    aput-object v2, v1, v0

    .line 104
    .line 105
    const/16 v0, 0xe

    .line 106
    .line 107
    aput-object v2, v1, v0

    .line 108
    .line 109
    const/16 v0, 0xf

    .line 110
    .line 111
    aput-object v2, v1, v0

    .line 112
    .line 113
    const/16 v0, 0x10

    .line 114
    .line 115
    aput-object v2, v1, v0

    .line 116
    .line 117
    const/16 v0, 0x11

    .line 118
    .line 119
    aput-object v8, v1, v0

    .line 120
    .line 121
    const/16 v0, 0x12

    .line 122
    .line 123
    aput-object v9, v1, v0

    .line 124
    .line 125
    sput-object v1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->t:[Lkotlinx/serialization/KSerializer;

    .line 126
    .line 127
    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/usercentrics/tcf/core/model/gvl/Overflow;Ljava/lang/Double;ZLjava/lang/String;ZLjava/lang/Boolean;ILjava/lang/String;Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;Ljava/util/List;Ljava/util/List;)V
    .locals 3

    const v0, 0x3c43f

    and-int v1, p1, v0

    const/4 v2, 0x0

    if-ne v0, v1, :cond_8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->a:Ljava/util/List;

    iput-object p3, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->b:Ljava/util/List;

    iput-object p4, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->c:Ljava/util/List;

    iput-object p5, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->d:Ljava/util/List;

    iput-object p6, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->e:Ljava/util/List;

    iput-object p7, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->f:Ljava/util/List;

    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_0

    .line 2
    const-string p2, ""

    .line 3
    iput-object p2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->g:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p8, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->g:Ljava/lang/String;

    :goto_0
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_1

    iput-object v2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->h:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p9, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->h:Ljava/lang/String;

    :goto_1
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_2

    iput-object v2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->i:Lcom/usercentrics/tcf/core/model/gvl/Overflow;

    goto :goto_2

    :cond_2
    iput-object p10, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->i:Lcom/usercentrics/tcf/core/model/gvl/Overflow;

    :goto_2
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_3

    iput-object v2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->j:Ljava/lang/Double;

    goto :goto_3

    :cond_3
    iput-object p11, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->j:Ljava/lang/Double;

    :goto_3
    iput-boolean p12, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->k:Z

    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_4

    iput-object v2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->l:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 p2, p13

    iput-object p2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->l:Ljava/lang/String;

    :goto_4
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_5

    const/4 p2, 0x0

    :goto_5
    iput-boolean p2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->m:Z

    goto :goto_6

    :cond_5
    move/from16 p2, p14

    goto :goto_5

    :goto_6
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_6

    .line 4
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    :goto_7
    iput-object p2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->n:Ljava/lang/Boolean;

    move/from16 p2, p16

    goto :goto_8

    :cond_6
    move-object/from16 p2, p15

    goto :goto_7

    :goto_8
    iput p2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->o:I

    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->p:Ljava/lang/String;

    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->q:Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;

    move-object/from16 p2, p19

    iput-object p2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->r:Ljava/util/List;

    const/high16 p2, 0x40000

    and-int/2addr p1, p2

    if-nez p1, :cond_7

    iput-object v2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->s:Ljava/util/List;

    return-void

    :cond_7
    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->s:Ljava/util/List;

    return-void

    :cond_8
    sget-object p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;

    invoke-virtual {p0}, Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p0

    invoke-static {p1, v0, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    throw v2
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
    instance-of v1, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;

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
    check-cast p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->a:Ljava/util/List;

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
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->b:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->b:Ljava/util/List;

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
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->c:Ljava/util/List;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->c:Ljava/util/List;

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
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->d:Ljava/util/List;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->d:Ljava/util/List;

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
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->e:Ljava/util/List;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->e:Ljava/util/List;

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
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->f:Ljava/util/List;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->f:Ljava/util/List;

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
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->g:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->g:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->h:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->h:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->i:Lcom/usercentrics/tcf/core/model/gvl/Overflow;

    .line 102
    .line 103
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->i:Lcom/usercentrics/tcf/core/model/gvl/Overflow;

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
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->j:Ljava/lang/Double;

    .line 113
    .line 114
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->j:Ljava/lang/Double;

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
    iget-boolean v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->k:Z

    .line 124
    .line 125
    iget-boolean v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->k:Z

    .line 126
    .line 127
    if-eq v1, v3, :cond_c

    .line 128
    .line 129
    return v2

    .line 130
    :cond_c
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->l:Ljava/lang/String;

    .line 131
    .line 132
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->l:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-nez v1, :cond_d

    .line 139
    .line 140
    return v2

    .line 141
    :cond_d
    iget-boolean v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->m:Z

    .line 142
    .line 143
    iget-boolean v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->m:Z

    .line 144
    .line 145
    if-eq v1, v3, :cond_e

    .line 146
    .line 147
    return v2

    .line 148
    :cond_e
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->n:Ljava/lang/Boolean;

    .line 149
    .line 150
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->n:Ljava/lang/Boolean;

    .line 151
    .line 152
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-nez v1, :cond_f

    .line 157
    .line 158
    return v2

    .line 159
    :cond_f
    iget v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->o:I

    .line 160
    .line 161
    iget v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->o:I

    .line 162
    .line 163
    if-eq v1, v3, :cond_10

    .line 164
    .line 165
    return v2

    .line 166
    :cond_10
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->p:Ljava/lang/String;

    .line 167
    .line 168
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->p:Ljava/lang/String;

    .line 169
    .line 170
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-nez v1, :cond_11

    .line 175
    .line 176
    return v2

    .line 177
    :cond_11
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->q:Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;

    .line 178
    .line 179
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->q:Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;

    .line 180
    .line 181
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-nez v1, :cond_12

    .line 186
    .line 187
    return v2

    .line 188
    :cond_12
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->r:Ljava/util/List;

    .line 189
    .line 190
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->r:Ljava/util/List;

    .line 191
    .line 192
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-nez v1, :cond_13

    .line 197
    .line 198
    return v2

    .line 199
    :cond_13
    iget-object p0, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->s:Ljava/util/List;

    .line 200
    .line 201
    iget-object p1, p1, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->s:Ljava/util/List;

    .line 202
    .line 203
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    if-nez p0, :cond_14

    .line 208
    .line 209
    return v2

    .line 210
    :cond_14
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->f:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const/4 v2, 0x0

    .line 47
    iget-object v3, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->h:Ljava/lang/String;

    .line 48
    .line 49
    if-nez v3, :cond_0

    .line 50
    .line 51
    move v3, v2

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    :goto_0
    add-int/2addr v0, v3

    .line 58
    mul-int/2addr v0, v1

    .line 59
    iget-object v3, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->i:Lcom/usercentrics/tcf/core/model/gvl/Overflow;

    .line 60
    .line 61
    if-nez v3, :cond_1

    .line 62
    .line 63
    move v3, v2

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    iget v3, v3, Lcom/usercentrics/tcf/core/model/gvl/Overflow;->a:I

    .line 66
    .line 67
    invoke-static {v3}, Ljava/lang/Integer;->hashCode(I)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    :goto_1
    add-int/2addr v0, v3

    .line 72
    mul-int/2addr v0, v1

    .line 73
    iget-object v3, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->j:Ljava/lang/Double;

    .line 74
    .line 75
    if-nez v3, :cond_2

    .line 76
    .line 77
    move v3, v2

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    :goto_2
    add-int/2addr v0, v3

    .line 84
    mul-int/2addr v0, v1

    .line 85
    iget-boolean v3, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->k:Z

    .line 86
    .line 87
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget-object v3, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->l:Ljava/lang/String;

    .line 92
    .line 93
    if-nez v3, :cond_3

    .line 94
    .line 95
    move v3, v2

    .line 96
    goto :goto_3

    .line 97
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    :goto_3
    add-int/2addr v0, v3

    .line 102
    mul-int/2addr v0, v1

    .line 103
    iget-boolean v3, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->m:Z

    .line 104
    .line 105
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    iget-object v3, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->n:Ljava/lang/Boolean;

    .line 110
    .line 111
    if-nez v3, :cond_4

    .line 112
    .line 113
    move v3, v2

    .line 114
    goto :goto_4

    .line 115
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    :goto_4
    add-int/2addr v0, v3

    .line 120
    mul-int/2addr v0, v1

    .line 121
    iget v3, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->o:I

    .line 122
    .line 123
    invoke-static {v3, v0, v1}, Lcom/appsflyer/internal/j;->a(III)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    iget-object v3, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->p:Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {v0, v1, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    iget-object v3, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->q:Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;

    .line 134
    .line 135
    if-nez v3, :cond_5

    .line 136
    .line 137
    move v3, v2

    .line 138
    goto :goto_5

    .line 139
    :cond_5
    invoke-virtual {v3}, Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;->hashCode()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    :goto_5
    add-int/2addr v0, v3

    .line 144
    mul-int/2addr v0, v1

    .line 145
    iget-object v3, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->r:Ljava/util/List;

    .line 146
    .line 147
    if-nez v3, :cond_6

    .line 148
    .line 149
    move v3, v2

    .line 150
    goto :goto_6

    .line 151
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    :goto_6
    add-int/2addr v0, v3

    .line 156
    mul-int/2addr v0, v1

    .line 157
    iget-object p0, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->s:Ljava/util/List;

    .line 158
    .line 159
    if-nez p0, :cond_7

    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    :goto_7
    add-int/2addr v0, v2

    .line 167
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Vendor(purposes="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", legIntPurposes="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->b:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", flexiblePurposes="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->c:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", specialPurposes="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->d:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", features="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->e:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", specialFeatures="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->f:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", policyUrl="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", deletedDate="

    .line 69
    .line 70
    const-string v2, ", overflow="

    .line 71
    .line 72
    iget-object v3, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->g:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v4, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->h:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->i:Lcom/usercentrics/tcf/core/model/gvl/Overflow;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", cookieMaxAgeSeconds="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->j:Ljava/lang/Double;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", usesNonCookieAccess="

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget-boolean v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->k:Z

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ", deviceStorageDisclosureUrl="

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->l:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, ", usesCookies="

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget-boolean v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->m:Z

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v1, ", cookieRefresh="

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->n:Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v1, ", id="

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    iget v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->o:I

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v1, ", name="

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->p:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v1, ", dataRetention="

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->q:Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;

    .line 160
    .line 161
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v1, ", urls="

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->r:Ljava/util/List;

    .line 170
    .line 171
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v1, ", dataDeclaration="

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    iget-object p0, p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->s:Ljava/util/List;

    .line 180
    .line 181
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string p0, ")"

    .line 185
    .line 186
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    return-object p0
.end method
