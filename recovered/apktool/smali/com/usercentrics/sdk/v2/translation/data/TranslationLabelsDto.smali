.class public final Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto$$serializer;,
        Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto$Companion;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->Companion:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto$Companion;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    and-int/lit16 v0, p1, 0xff

    .line 2
    .line 3
    const/16 v1, 0xff

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->b:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p4, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p5, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->d:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p6, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->e:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p7, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->f:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p8, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->g:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p9, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->h:Ljava/lang/String;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto$$serializer;

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p1, v1, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    throw p0
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
    instance-of v1, p1, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;

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
    check-cast p1, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->a:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->b:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->c:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->d:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->e:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->f:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->g:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->g:Ljava/lang/String;

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
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->h:Ljava/lang/String;

    .line 91
    .line 92
    iget-object p1, p1, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->h:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-nez p0, :cond_9

    .line 99
    .line 100
    return v2

    .line 101
    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    add-int/2addr p0, v0

    .line 53
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", cookieStorage="

    .line 2
    .line 3
    const-string v1, ", cnilDenyLinkText="

    .line 4
    .line 5
    const-string v2, "TranslationLabelsDto(cookieRefresh="

    .line 6
    .line 7
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Len;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", vendorsOutsideEU="

    .line 16
    .line 17
    const-string v2, ", details="

    .line 18
    .line 19
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", controllerIdTitle="

    .line 27
    .line 28
    const-string v2, ", tcfMaxDurationText="

    .line 29
    .line 30
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->f:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", tcfMaxDurationTitle="

    .line 38
    .line 39
    const-string v2, ")"

    .line 40
    .line 41
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->g:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->h:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, v3, v1, p0, v2}, Lfm0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method
