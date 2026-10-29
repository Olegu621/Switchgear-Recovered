.class public final Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction$$serializer;,
        Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction$Companion;

.field public static final c:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:I

.field public final b:Ll42;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->Companion:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction$Companion;

    .line 7
    .line 8
    new-instance v0, Lb10;

    .line 9
    .line 10
    const-class v1, Ll42;

    .line 11
    .line 12
    invoke-static {v1}, Lj22;->a(Ljava/lang/Class;)Ldv;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Loe0;

    .line 17
    .line 18
    const-string v3, "com.usercentrics.tcf.core.model.RestrictionType"

    .line 19
    .line 20
    invoke-static {}, Ll42;->values()[Ll42;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-direct {v2, v3, v4}, Loe0;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    new-array v4, v3, [Lkotlinx/serialization/KSerializer;

    .line 29
    .line 30
    invoke-direct {v0, v1, v2, v4}, Lb10;-><init>(Ldv;Lkotlinx/serialization/KSerializer;[Lkotlinx/serialization/KSerializer;)V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x2

    .line 34
    new-array v1, v1, [Lkotlinx/serialization/KSerializer;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    aput-object v2, v1, v3

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    aput-object v0, v1, v2

    .line 41
    .line 42
    sput-object v1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->c:[Lkotlinx/serialization/KSerializer;

    .line 43
    .line 44
    return-void
.end method

.method public synthetic constructor <init>(IILl42;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x3

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v1, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->a:I

    .line 10
    .line 11
    iput-object p3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->b:Ll42;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget-object p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction$$serializer;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p1, v1, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    throw p0
.end method

.method public constructor <init>(ILl42;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->a:I

    .line 27
    iput-object p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->b:Ll42;

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
    instance-of v1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;

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
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;

    .line 12
    .line 13
    iget v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->a:I

    .line 14
    .line 15
    iget v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object p0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->b:Ll42;

    .line 21
    .line 22
    iget-object p1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->b:Ll42;

    .line 23
    .line 24
    if-eq p0, p1, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->b:Ll42;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TCFVendorRestriction(purposeId="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->a:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", restrictionType="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->b:Ll42;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, ")"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
