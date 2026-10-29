.class public final Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lgz;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;,
        Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$Companion;

.field public static final l:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Ljava/lang/Boolean;

.field public final b:Ljava/lang/Boolean;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Z

.field public final h:Ljava/util/List;

.field public final i:Ljava/lang/Boolean;

.field public final j:Ljava/util/List;

.field public final k:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->Companion:Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$Companion;

    .line 7
    .line 8
    new-instance v0, Lgd;

    .line 9
    .line 10
    sget-object v1, Lcom/usercentrics/sdk/v2/settings/data/SubConsentTemplate$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/settings/data/SubConsentTemplate$$serializer;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lgd;

    .line 17
    .line 18
    sget-object v3, Lvh2;->a:Lvh2;

    .line 19
    .line 20
    invoke-direct {v1, v3, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 21
    .line 22
    .line 23
    const/16 v3, 0xb

    .line 24
    .line 25
    new-array v3, v3, [Lkotlinx/serialization/KSerializer;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    aput-object v4, v3, v2

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    aput-object v4, v3, v2

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    aput-object v4, v3, v2

    .line 35
    .line 36
    const/4 v2, 0x3

    .line 37
    aput-object v4, v3, v2

    .line 38
    .line 39
    const/4 v2, 0x4

    .line 40
    aput-object v4, v3, v2

    .line 41
    .line 42
    const/4 v2, 0x5

    .line 43
    aput-object v4, v3, v2

    .line 44
    .line 45
    const/4 v2, 0x6

    .line 46
    aput-object v4, v3, v2

    .line 47
    .line 48
    const/4 v2, 0x7

    .line 49
    aput-object v0, v3, v2

    .line 50
    .line 51
    const/16 v0, 0x8

    .line 52
    .line 53
    aput-object v4, v3, v0

    .line 54
    .line 55
    const/16 v0, 0x9

    .line 56
    .line 57
    aput-object v1, v3, v0

    .line 58
    .line 59
    const/16 v0, 0xa

    .line 60
    .line 61
    aput-object v4, v3, v0

    .line 62
    .line 63
    sput-object v3, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->l:[Lkotlinx/serialization/KSerializer;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x4c

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x4c

    .line 5
    .line 6
    if-ne v2, v0, :cond_8

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, p1, 0x1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->a:Ljava/lang/Boolean;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-object p2, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->a:Ljava/lang/Boolean;

    .line 19
    .line 20
    :goto_0
    and-int/lit8 p2, p1, 0x2

    .line 21
    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->b:Ljava/lang/Boolean;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->b:Ljava/lang/Boolean;

    .line 28
    .line 29
    :goto_1
    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->c:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p5, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->d:Ljava/lang/String;

    .line 32
    .line 33
    and-int/lit8 p2, p1, 0x10

    .line 34
    .line 35
    if-nez p2, :cond_2

    .line 36
    .line 37
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->e:Ljava/lang/String;

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    iput-object p6, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->e:Ljava/lang/String;

    .line 41
    .line 42
    :goto_2
    and-int/lit8 p2, p1, 0x20

    .line 43
    .line 44
    if-nez p2, :cond_3

    .line 45
    .line 46
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->f:Ljava/lang/String;

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_3
    iput-object p7, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->f:Ljava/lang/String;

    .line 50
    .line 51
    :goto_3
    iput-boolean p8, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->g:Z

    .line 52
    .line 53
    and-int/lit16 p2, p1, 0x80

    .line 54
    .line 55
    if-nez p2, :cond_4

    .line 56
    .line 57
    sget-object p2, Lnd0;->a:Lnd0;

    .line 58
    .line 59
    iput-object p2, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->h:Ljava/util/List;

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_4
    iput-object p9, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->h:Ljava/util/List;

    .line 63
    .line 64
    :goto_4
    and-int/lit16 p2, p1, 0x100

    .line 65
    .line 66
    if-nez p2, :cond_5

    .line 67
    .line 68
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->i:Ljava/lang/Boolean;

    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_5
    iput-object p10, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->i:Ljava/lang/Boolean;

    .line 72
    .line 73
    :goto_5
    and-int/lit16 p2, p1, 0x200

    .line 74
    .line 75
    if-nez p2, :cond_6

    .line 76
    .line 77
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->j:Ljava/util/List;

    .line 78
    .line 79
    goto :goto_6

    .line 80
    :cond_6
    iput-object p11, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->j:Ljava/util/List;

    .line 81
    .line 82
    :goto_6
    and-int/lit16 p1, p1, 0x400

    .line 83
    .line 84
    if-nez p1, :cond_7

    .line 85
    .line 86
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->k:Ljava/lang/Boolean;

    .line 87
    .line 88
    return-void

    .line 89
    :cond_7
    iput-object p12, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->k:Ljava/lang/Boolean;

    .line 90
    .line 91
    return-void

    .line 92
    :cond_8
    sget-object p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;

    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p1, v2, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 99
    .line 100
    .line 101
    throw v1
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->g:Z

    .line 2
    .line 3
    return p0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->a:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

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
    instance-of v1, p1, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;

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
    check-cast p1, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->a:Ljava/lang/Boolean;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->a:Ljava/lang/Boolean;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->b:Ljava/lang/Boolean;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->b:Ljava/lang/Boolean;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->c:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->d:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->e:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->f:Ljava/lang/String;

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
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->g:Z

    .line 80
    .line 81
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->g:Z

    .line 82
    .line 83
    if-eq v1, v3, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->h:Ljava/util/List;

    .line 87
    .line 88
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->h:Ljava/util/List;

    .line 89
    .line 90
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_9

    .line 95
    .line 96
    return v2

    .line 97
    :cond_9
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->i:Ljava/lang/Boolean;

    .line 98
    .line 99
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->i:Ljava/lang/Boolean;

    .line 100
    .line 101
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_a

    .line 106
    .line 107
    return v2

    .line 108
    :cond_a
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->j:Ljava/util/List;

    .line 109
    .line 110
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->j:Ljava/util/List;

    .line 111
    .line 112
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-nez v1, :cond_b

    .line 117
    .line 118
    return v2

    .line 119
    :cond_b
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->k:Ljava/lang/Boolean;

    .line 120
    .line 121
    iget-object p1, p1, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->k:Ljava/lang/Boolean;

    .line 122
    .line 123
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    if-nez p0, :cond_c

    .line 128
    .line 129
    return v2

    .line 130
    :cond_c
    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->a:Ljava/lang/Boolean;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    const/16 v2, 0x1f

    .line 13
    .line 14
    mul-int/2addr v1, v2

    .line 15
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->b:Ljava/lang/Boolean;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    move v3, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    :goto_1
    add-int/2addr v1, v3

    .line 26
    mul-int/2addr v1, v2

    .line 27
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->c:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->d:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->e:Ljava/lang/String;

    .line 40
    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    move v3, v0

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    :goto_2
    add-int/2addr v1, v3

    .line 50
    mul-int/2addr v1, v2

    .line 51
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->f:Ljava/lang/String;

    .line 52
    .line 53
    if-nez v3, :cond_3

    .line 54
    .line 55
    move v3, v0

    .line 56
    goto :goto_3

    .line 57
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    :goto_3
    add-int/2addr v1, v3

    .line 62
    mul-int/2addr v1, v2

    .line 63
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->g:Z

    .line 64
    .line 65
    invoke-static {v1, v2, v3}, Len;->h(IIZ)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->h:Ljava/util/List;

    .line 70
    .line 71
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->i:Ljava/lang/Boolean;

    .line 76
    .line 77
    if-nez v3, :cond_4

    .line 78
    .line 79
    move v3, v0

    .line 80
    goto :goto_4

    .line 81
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    :goto_4
    add-int/2addr v1, v3

    .line 86
    mul-int/2addr v1, v2

    .line 87
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->j:Ljava/util/List;

    .line 88
    .line 89
    if-nez v3, :cond_5

    .line 90
    .line 91
    move v3, v0

    .line 92
    goto :goto_5

    .line 93
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    :goto_5
    add-int/2addr v1, v3

    .line 98
    mul-int/2addr v1, v2

    .line 99
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->k:Ljava/lang/Boolean;

    .line 100
    .line 101
    if-nez p0, :cond_6

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    :goto_6
    add-int/2addr v1, v0

    .line 109
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ServiceConsentTemplate(isDeactivated="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->a:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", defaultConsentStatus="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->b:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", templateId="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", version="

    .line 29
    .line 30
    const-string v2, ", categorySlug="

    .line 31
    .line 32
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", description="

    .line 40
    .line 41
    const-string v2, ", isHidden="

    .line 42
    .line 43
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->e:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->f:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->g:Z

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", subConsents="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->h:Ljava/util/List;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", isAutoUpdateAllowed="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->i:Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", legalBasisList="

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->j:Ljava/util/List;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", disableLegalBasis="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->k:Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p0, ")"

    .line 96
    .line 97
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0
.end method
