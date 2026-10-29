.class public final Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization$$serializer;,
        Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization$Companion;

.field public static final d:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;

.field public final b:Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;

.field public final c:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->Companion:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization$Companion;

    .line 7
    .line 8
    new-instance v0, Lrt0;

    .line 9
    .line 10
    sget-object v1, Lvh2;->a:Lvh2;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v1, v2}, Lrt0;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;I)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    new-array v1, v1, [Lkotlinx/serialization/KSerializer;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    aput-object v4, v1, v3

    .line 22
    .line 23
    aput-object v4, v1, v2

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    aput-object v0, v1, v2

    .line 27
    .line 28
    sput-object v1, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->d:[Lkotlinx/serialization/KSerializer;

    .line 29
    .line 30
    return-void
.end method

.method public synthetic constructor <init>(ILcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;Ljava/util/Map;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v2, v0, :cond_2

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->a:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;

    .line 11
    .line 12
    and-int/lit8 p2, p1, 0x2

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->b:Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->b:Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;

    .line 20
    .line 21
    :goto_0
    and-int/lit8 p1, p1, 0x4

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->c:Ljava/util/Map;

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iput-object p4, p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->c:Ljava/util/Map;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    sget-object p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization$$serializer;

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p1, v2, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 38
    .line 39
    .line 40
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
    instance-of v1, p1, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

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
    check-cast p1, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->a:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->a:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->b:Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->b:Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;

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
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->c:Ljava/util/Map;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->c:Ljava/util/Map;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->a:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->b:Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    move v2, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v2}, Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    :goto_0
    add-int/2addr v0, v2

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->c:Ljava/util/Map;

    .line 24
    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    :goto_1
    add-int/2addr v0, v1

    .line 33
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "LegalBasisLocalization(labels="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->a:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", labelsAria="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->b:Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", data="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->c:Ljava/util/Map;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, ")"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
