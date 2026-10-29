
/* RVA 47db68 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined1  [16]
Inspect_47db68(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
              undefined8 param_5)

{
  ulong uVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  byte bVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined1 *puVar13;
  int iVar14;
  long lVar15;
  ulong uVar16;
  ulong uVar17;
  byte bVar18;
  int *piVar19;
  long lVar20;
  ulong uVar21;
  ulong uVar22;
  long lVar23;
  int iVar24;
  ulong uVar25;
  ulong uVar26;
  long lVar27;
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 uVar35;
  undefined1 uVar36;
  undefined1 uVar37;
  undefined1 uVar38;
  undefined1 uVar39;
  undefined1 uVar40;
  undefined1 uVar41;
  undefined1 uVar42;
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined1 auVar52 [16];
  undefined1 auVar53 [16];
  undefined1 auVar54 [16];
  undefined1 auVar55 [16];
  undefined1 auVar56 [16];
  undefined1 auVar57 [16];
  undefined1 auVar58 [16];
  undefined1 auVar59 [16];
  long lVar60;
  long lVar61;
  undefined1 auVar62 [16];
  ulong uVar63;
  undefined1 auVar64 [16];
  undefined1 auVar65 [16];
  undefined1 auVar66 [16];
  undefined1 auVar67 [12];
  undefined1 auStack_158 [72];
  byte abStack_110 [32];
  ulong uStack_f0;
  undefined1 *puStack_e8;
  int *piStack_e0;
  ulong uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  byte bStack_c0;
  byte bStack_bf;
  byte bStack_be;
  byte bStack_bd;
  byte bStack_bc;
  byte bStack_bb;
  byte bStack_ba;
  byte bStack_b9;
  byte bStack_b8;
  byte bStack_b7;
  byte bStack_b6;
  byte bStack_b5;
  byte bStack_b4;
  byte bStack_b3;
  byte bStack_b2;
  byte bStack_b1;
  byte bStack_b0;
  byte bStack_af;
  byte bStack_ae;
  byte bStack_ad;
  byte bStack_ac;
  byte bStack_ab;
  byte bStack_aa;
  byte bStack_a9;
  byte bStack_a8;
  byte bStack_a7;
  byte bStack_a6;
  byte bStack_a5;
  byte bStack_a4;
  byte bStack_a3;
  byte bStack_a2;
  byte bStack_a1;
  undefined8 uStack_a0;
  undefined1 uStack_98;
  undefined1 uStack_97;
  undefined1 uStack_96;
  undefined1 uStack_95;
  undefined1 uStack_94;
  undefined1 uStack_93;
  undefined1 uStack_92;
  undefined1 uStack_91;
  undefined1 uStack_90;
  undefined1 uStack_8f;
  undefined1 uStack_8e;
  undefined1 uStack_8d;
  undefined1 uStack_8c;
  undefined1 uStack_8b;
  undefined1 uStack_8a;
  undefined1 uStack_89;
  undefined1 uStack_88;
  undefined1 uStack_87;
  undefined1 uStack_86;
  undefined1 uStack_85;
  undefined1 uStack_84;
  undefined1 uStack_83;
  undefined1 uStack_82;
  undefined1 uStack_81;
  ulong auStack_80 [2];
  byte bStack_70;
  byte bStack_6f;
  byte bStack_6e;
  byte bStack_6d;
  byte bStack_6c;
  byte bStack_6b;
  byte bStack_6a;
  byte bStack_69;
  byte bStack_68;
  byte bStack_67;
  byte bStack_66;
  byte bStack_65;
  byte bStack_64;
  byte bStack_63;
  byte bStack_62;
  byte bStack_61;
  
  lVar15 = FUN_0065aa30();
  FUN_00574ce8(auStack_158,param_1,param_4,param_5,lVar15);
  uStack_f0 = 0;
  puStack_e8 = (undefined1 *)0x0;
  uStack_d8 = _UNK_0081cac8;
  piStack_e0 = _UNK_0081cac0;
  iVar14 = FUN_00574e08(auStack_158,&UNK_008106ae,&uStack_d0);
  if (iVar14 == 0) {
    FUN_002f9018();
    uVar21 = 0;
    auVar29 = ZEXT816(6) << 0x40;
    goto LAB_0057e628;
  }
  iVar14 = FUN_007955e0(*(undefined8 *)(*(long *)(lVar15 + 0x10) + 8),&UNK_00816ded);
  if (iVar14 == 0) {
    iVar14 = func_0x002ca1e0(&puStack_e8,&uStack_f0,abStack_110);
    if (((iVar14 != 0) || (puStack_e8 == (undefined1 *)0x0)) || (uStack_f0 == 0)) {
      uVar21 = uStack_f0;
      puVar13 = puStack_e8;
      if (puStack_e8 != (undefined1 *)0x0) {
        for (; uVar21 != 0; uVar21 = uVar21 - 1) {
          *puVar13 = 0;
          puVar13 = puVar13 + 1;
        }
        thunk_FUN_0053d3b8(puStack_e8);
      }
      abStack_110[0] = 0;
      abStack_110[1] = 0;
      abStack_110[2] = 0;
      abStack_110[3] = 0;
      abStack_110[4] = 0;
      abStack_110[5] = 0;
      abStack_110[6] = 0;
      abStack_110[7] = 0;
      abStack_110[8] = 0;
      abStack_110[9] = 0;
      abStack_110[10] = 0;
      abStack_110[0xb] = 0;
      abStack_110[0xc] = 0;
      abStack_110[0xd] = 0;
      abStack_110[0xe] = 0;
      abStack_110[0xf] = 0;
      abStack_110[0x10] = 0;
      abStack_110[0x11] = 0;
      abStack_110[0x12] = 0;
      abStack_110[0x13] = 0;
      abStack_110[0x14] = 0;
      abStack_110[0x15] = 0;
      abStack_110[0x16] = 0;
      abStack_110[0x17] = 0;
      abStack_110[0x18] = 0;
      abStack_110[0x19] = 0;
      abStack_110[0x1a] = 0;
      abStack_110[0x1b] = 0;
      abStack_110[0x1c] = 0;
      abStack_110[0x1d] = 0;
      abStack_110[0x1e] = 0;
      abStack_110[0x1f] = 0;
LAB_0057e60c:
      FUN_002f9018();
      goto LAB_0057e610;
    }
    iVar14 = FUN_005802a8(&puStack_e8,&uStack_f0,abStack_110);
    puVar13 = puStack_e8;
    uVar21 = uStack_f0;
    if (iVar14 != 0) goto LAB_0057e610;
    if ((puStack_e8 != (undefined1 *)0x0) && (0x3f < uStack_f0)) {
      bVar18 = 0x6d;
      lVar20 = -0x4bf72a3ace66500d;
      uVar22 = 0x9e3779b185ebca87;
      uVar16 = 0;
      do {
        uVar25 = uVar22 ^ uStack_f0;
        uVar22 = uVar22 + 0x9e3779b185ebca87;
        uVar17 = 0;
        if (uStack_f0 != 0) {
          uVar17 = uVar25 / uStack_f0;
        }
        uVar26 = lVar20 + (uStack_f0 << (uVar16 & 7));
        lVar20 = lVar20 + 0x2917014799a6026d;
        uVar63 = 0;
        if (uStack_f0 != 0) {
          uVar63 = uVar26 / uStack_f0;
        }
        uVar2 = (uint)uVar16 & 7;
        uVar1 = uVar16 + 1;
        bVar10 = bVar18 ^ (byte)(uStack_f0 >> (uVar2 << 3));
        bVar18 = bVar18 + 0x3b;
        *(byte *)((long)auStack_80 + (uVar16 - 0x20)) =
             bVar10 ^ puStack_e8[uVar25 - uVar17 * uStack_f0] ^
             (puStack_e8[uVar26 - uVar63 * uStack_f0] << (ulong)((uint)uVar1 & 7) |
             (byte)puStack_e8[uVar26 - uVar63 * uStack_f0] >> (ulong)(uVar2 ^ 7));
        uVar16 = uVar1;
      } while (uVar1 != 0x20);
      thunk_FUN_0014f4e0(&uStack_a0,0x86f1a3c7,&bStack_c0);
      lVar20 = 0;
      auVar29._8_8_ = _UNK_0081c938;
      auVar29._0_8_ = _UNK_0081c930;
      auVar31._8_8_ = _UNK_0081c9f8;
      auVar31._0_8_ = _UNK_0081c9f0;
      uVar35 = (undefined1)_UNK_0081ce18;
      uVar36 = (undefined1)((ulong)_UNK_0081ce18 >> 8);
      uVar37 = (undefined1)((ulong)_UNK_0081ce18 >> 0x10);
      uVar38 = (undefined1)((ulong)_UNK_0081ce18 >> 0x18);
      uVar39 = (undefined1)((ulong)_UNK_0081ce18 >> 0x20);
      uVar40 = (undefined1)((ulong)_UNK_0081ce18 >> 0x28);
      uVar41 = (undefined1)((ulong)_UNK_0081ce18 >> 0x30);
      uVar42 = (undefined1)((ulong)_UNK_0081ce18 >> 0x38);
      auVar33._8_8_ = _UNK_0081cd28;
      auVar33._0_8_ = _UNK_0081cd20;
      do {
        uVar25 = lVar20 * -0x61c8864e7a143579;
        lVar23 = 0;
        lVar27 = lVar20 * -0x1abc800000000000;
        uVar26 = uVar25 ^ 0x2904378d1e380000;
        uVar17 = uVar26 >> 0x21;
        lVar60 = uVar26 << 0x1f;
        bVar18 = (byte)(uVar26 >> 0x38);
        uVar16 = uVar26 >> 0x11;
        lVar61 = uVar26 << 0x11;
        uVar22 = 0xd6e8feb86659fd93;
        auVar64[0] = (byte)uVar17 ^ (byte)_UNK_0081cb50;
        auVar64[1] = (byte)(uVar17 >> 8) ^ (byte)((ulong)_UNK_0081cb50 >> 8);
        auVar64[2] = (byte)(uVar17 >> 0x10) ^ (byte)((ulong)_UNK_0081cb50 >> 0x10);
        auVar64[3] = (bVar18 >> 1 | (byte)((ulong)lVar60 >> 0x18)) ^
                     (byte)((ulong)_UNK_0081cb50 >> 0x18);
        auVar64[4] = (byte)((ulong)lVar60 >> 0x20) ^ (byte)((ulong)_UNK_0081cb50 >> 0x20);
        auVar64[5] = (byte)((ulong)lVar60 >> 0x28) ^ (byte)((ulong)_UNK_0081cb50 >> 0x28);
        auVar64[6] = (byte)((ulong)lVar60 >> 0x30) ^ (byte)((ulong)_UNK_0081cb50 >> 0x30);
        auVar64[7] = (byte)((ulong)lVar60 >> 0x38) ^ (byte)((ulong)_UNK_0081cb50 >> 0x38);
        auVar64[8] = (byte)uVar25 ^ (byte)_UNK_0081cb58;
        auVar64[9] = (byte)(uVar25 >> 8) ^ (byte)((ulong)_UNK_0081cb58 >> 8);
        auVar64[10] = (byte)(uVar25 >> 0x10) ^ (byte)((ulong)_UNK_0081cb58 >> 0x10);
        auVar64[0xb] = (byte)(uVar25 >> 0x18) ^ (byte)((ulong)_UNK_0081cb58 >> 0x18);
        auVar64[0xc] = (byte)(uVar25 >> 0x20) ^ (byte)((ulong)_UNK_0081cb58 >> 0x20);
        auVar64[0xd] = (byte)(uVar25 >> 0x28) ^ (byte)((ulong)_UNK_0081cb58 >> 0x28);
        auVar64[0xe] = (byte)(uVar25 >> 0x30) ^ (byte)((ulong)_UNK_0081cb58 >> 0x30);
        auVar64[0xf] = (byte)(uVar25 >> 0x38) ^ (byte)((ulong)_UNK_0081cb58 >> 0x38);
        auVar44[0] = (byte)uVar16 ^ (byte)_UNK_0081cb20;
        auVar44[1] = (byte)(uVar16 >> 8) ^ (byte)((ulong)_UNK_0081cb20 >> 8);
        auVar44[2] = (byte)(uVar16 >> 0x10) ^ (byte)((ulong)_UNK_0081cb20 >> 0x10);
        auVar44[3] = (byte)(uVar16 >> 0x18) ^ (byte)((ulong)_UNK_0081cb20 >> 0x18);
        auVar44[4] = (byte)(uVar16 >> 0x20) ^ (byte)((ulong)_UNK_0081cb20 >> 0x20);
        auVar44[5] = ((byte)((ulong)lVar27 >> 0x28) | bVar18 >> 1) ^
                     (byte)((ulong)_UNK_0081cb20 >> 0x28);
        auVar44[6] = (byte)((ulong)lVar27 >> 0x30) ^ (byte)((ulong)_UNK_0081cb20 >> 0x30);
        auVar44[7] = (byte)((ulong)lVar27 >> 0x38) ^ (byte)((ulong)_UNK_0081cb20 >> 0x38);
        auVar44[8] = (byte)(uVar26 >> 0x2f) ^ (byte)_UNK_0081cb28;
        auVar44[9] = (byte)((uVar26 >> 0x2f) >> 8) ^ (byte)((ulong)_UNK_0081cb28 >> 8);
        auVar44[10] = (bVar18 >> 7 | (byte)((ulong)lVar61 >> 0x10)) ^
                      (byte)((ulong)_UNK_0081cb28 >> 0x10);
        auVar44[0xb] = (byte)((ulong)lVar61 >> 0x18) ^ (byte)((ulong)_UNK_0081cb28 >> 0x18);
        auVar44[0xc] = (byte)((ulong)lVar61 >> 0x20) ^ (byte)((ulong)_UNK_0081cb28 >> 0x20);
        auVar44[0xd] = (byte)((ulong)lVar61 >> 0x28) ^ (byte)((ulong)_UNK_0081cb28 >> 0x28);
        auVar44[0xe] = (byte)((ulong)lVar61 >> 0x30) ^ (byte)((ulong)_UNK_0081cb28 >> 0x30);
        auVar44[0xf] = (byte)((ulong)lVar61 >> 0x38) ^ (byte)((ulong)_UNK_0081cb28 >> 0x38);
        do {
          lVar60 = lVar23 + -0x20;
          uVar17 = uVar22 ^ uVar26;
          lVar23 = lVar23 + 8;
          uVar22 = uVar22 + 0xd6e8feb86659fd93;
          uVar17 = uVar17 ^ *(ulong *)((long)auStack_80 + lVar60);
          uVar16 = uVar17 ^ auVar44._0_8_;
          auVar43._8_8_ = auVar44._8_8_;
          auVar43._0_8_ = uVar16;
          lVar60 = uVar16 + auVar64._0_8_;
          uVar16 = auVar43._8_8_ + auVar64._8_8_;
          auVar64 = NEON_ushl(auVar43,auVar29,8);
          auVar44 = NEON_ushl(auVar43,auVar31,8);
          auVar45._0_8_ =
               CONCAT17((auVar44[7] | auVar64[7]) ^ (byte)((ulong)lVar60 >> 0x38),
                        CONCAT16((auVar44[6] | auVar64[6]) ^ (byte)((ulong)lVar60 >> 0x30),
                                 CONCAT15((auVar44[5] | auVar64[5]) ^ (byte)((ulong)lVar60 >> 0x28),
                                          CONCAT14((auVar44[4] | auVar64[4]) ^
                                                   (byte)((ulong)lVar60 >> 0x20),
                                                   CONCAT13((auVar44[3] | auVar64[3]) ^
                                                            (byte)((ulong)lVar60 >> 0x18),
                                                            CONCAT12((auVar44[2] | auVar64[2]) ^
                                                                     (byte)((ulong)lVar60 >> 0x10),
                                                                     CONCAT11((auVar44[1] |
                                                                              auVar64[1]) ^
                                                                              (byte)((ulong)lVar60
                                                                                    >> 8),
                                                                              (auVar44[0] |
                                                                              auVar64[0]) ^
                                                                              (byte)lVar60)))))));
          auVar45[8] = (auVar44[8] | auVar64[8]) ^ (byte)uVar16;
          auVar45[9] = (auVar44[9] | auVar64[9]) ^ (byte)(uVar16 >> 8);
          auVar45[10] = (auVar44[10] | auVar64[10]) ^ (byte)(uVar16 >> 0x10);
          auVar45[0xb] = (auVar44[0xb] | auVar64[0xb]) ^ (byte)(uVar16 >> 0x18);
          auVar45[0xc] = (auVar44[0xc] | auVar64[0xc]) ^ (byte)(uVar16 >> 0x20);
          auVar45[0xd] = (auVar44[0xd] | auVar64[0xd]) ^ (byte)(uVar16 >> 0x28);
          auVar45[0xe] = (auVar44[0xe] | auVar64[0xe]) ^ (byte)(uVar16 >> 0x30);
          auVar45[0xf] = (auVar44[0xf] | auVar64[0xf]) ^ (byte)(uVar16 >> 0x38);
          auVar64 = NEON_ushl(auVar45,auVar33,8);
          lVar61 = auVar45._0_8_ + (uVar16 >> 0x20 | uVar16 << 0x20);
          uVar16 = auVar45._8_8_ + lVar60;
          auVar65[8] = uVar35;
          auVar65._0_8_ = _UNK_0081ce10;
          auVar65[9] = uVar36;
          auVar65[10] = uVar37;
          auVar65[0xb] = uVar38;
          auVar65[0xc] = uVar39;
          auVar65[0xd] = uVar40;
          auVar65[0xe] = uVar41;
          auVar65[0xf] = uVar42;
          auVar44 = NEON_ushl(auVar45,auVar65,8);
          auVar46._0_8_ =
               CONCAT17((auVar44[7] | auVar64[7]) ^ (byte)((ulong)lVar61 >> 0x38),
                        CONCAT16((auVar44[6] | auVar64[6]) ^ (byte)((ulong)lVar61 >> 0x30),
                                 CONCAT15((auVar44[5] | auVar64[5]) ^ (byte)((ulong)lVar61 >> 0x28),
                                          CONCAT14((auVar44[4] | auVar64[4]) ^
                                                   (byte)((ulong)lVar61 >> 0x20),
                                                   CONCAT13((auVar44[3] | auVar64[3]) ^
                                                            (byte)((ulong)lVar61 >> 0x18),
                                                            CONCAT12((auVar44[2] | auVar64[2]) ^
                                                                     (byte)((ulong)lVar61 >> 0x10),
                                                                     CONCAT11((auVar44[1] |
                                                                              auVar64[1]) ^
                                                                              (byte)((ulong)lVar61
                                                                                    >> 8),
                                                                              (auVar44[0] |
                                                                              auVar64[0]) ^
                                                                              (byte)lVar61)))))));
          auVar46[8] = (auVar44[8] | auVar64[8]) ^ (byte)uVar16;
          auVar46[9] = (auVar44[9] | auVar64[9]) ^ (byte)(uVar16 >> 8);
          auVar46[10] = (auVar44[10] | auVar64[10]) ^ (byte)(uVar16 >> 0x10);
          auVar46[0xb] = (auVar44[0xb] | auVar64[0xb]) ^ (byte)(uVar16 >> 0x18);
          auVar46[0xc] = (auVar44[0xc] | auVar64[0xc]) ^ (byte)(uVar16 >> 0x20);
          auVar46[0xd] = (auVar44[0xd] | auVar64[0xd]) ^ (byte)(uVar16 >> 0x28);
          auVar46[0xe] = (auVar44[0xe] | auVar64[0xe]) ^ (byte)(uVar16 >> 0x30);
          auVar46[0xf] = (auVar44[0xf] | auVar64[0xf]) ^ (byte)(uVar16 >> 0x38);
          auVar64 = NEON_ushl(auVar46,auVar29,8);
          lVar60 = auVar46._0_8_ + (uVar16 >> 0x20 | uVar16 << 0x20);
          uVar16 = auVar46._8_8_ + lVar61;
          auVar44 = NEON_ushl(auVar46,auVar31,8);
          auVar47._0_8_ =
               CONCAT17((auVar44[7] | auVar64[7]) ^ (byte)((ulong)lVar60 >> 0x38),
                        CONCAT16((auVar44[6] | auVar64[6]) ^ (byte)((ulong)lVar60 >> 0x30),
                                 CONCAT15((auVar44[5] | auVar64[5]) ^ (byte)((ulong)lVar60 >> 0x28),
                                          CONCAT14((auVar44[4] | auVar64[4]) ^
                                                   (byte)((ulong)lVar60 >> 0x20),
                                                   CONCAT13((auVar44[3] | auVar64[3]) ^
                                                            (byte)((ulong)lVar60 >> 0x18),
                                                            CONCAT12((auVar44[2] | auVar64[2]) ^
                                                                     (byte)((ulong)lVar60 >> 0x10),
                                                                     CONCAT11((auVar44[1] |
                                                                              auVar64[1]) ^
                                                                              (byte)((ulong)lVar60
                                                                                    >> 8),
                                                                              (auVar44[0] |
                                                                              auVar64[0]) ^
                                                                              (byte)lVar60)))))));
          auVar47[8] = (auVar44[8] | auVar64[8]) ^ (byte)uVar16;
          auVar47[9] = (auVar44[9] | auVar64[9]) ^ (byte)(uVar16 >> 8);
          auVar47[10] = (auVar44[10] | auVar64[10]) ^ (byte)(uVar16 >> 0x10);
          auVar47[0xb] = (auVar44[0xb] | auVar64[0xb]) ^ (byte)(uVar16 >> 0x18);
          auVar47[0xc] = (auVar44[0xc] | auVar64[0xc]) ^ (byte)(uVar16 >> 0x20);
          auVar47[0xd] = (auVar44[0xd] | auVar64[0xd]) ^ (byte)(uVar16 >> 0x28);
          auVar47[0xe] = (auVar44[0xe] | auVar64[0xe]) ^ (byte)(uVar16 >> 0x30);
          auVar47[0xf] = (auVar44[0xf] | auVar64[0xf]) ^ (byte)(uVar16 >> 0x38);
          auVar65 = NEON_ushl(auVar47,auVar33,8);
          uVar63 = auVar47._0_8_ + (uVar16 >> 0x20 | uVar16 << 0x20);
          uVar16 = auVar47._8_8_ + lVar60;
          auVar3[8] = uVar35;
          auVar3._0_8_ = _UNK_0081ce10;
          auVar3[9] = uVar36;
          auVar3[10] = uVar37;
          auVar3[0xb] = uVar38;
          auVar3[0xc] = uVar39;
          auVar3[0xd] = uVar40;
          auVar3[0xe] = uVar41;
          auVar3[0xf] = uVar42;
          auVar64 = NEON_ushl(auVar47,auVar3,8);
          auVar44._0_8_ =
               CONCAT17((auVar64[7] | auVar65[7]) ^ (byte)(uVar63 >> 0x38),
                        CONCAT16((auVar64[6] | auVar65[6]) ^ (byte)(uVar63 >> 0x30),
                                 CONCAT15((auVar64[5] | auVar65[5]) ^ (byte)(uVar63 >> 0x28),
                                          CONCAT14((auVar64[4] | auVar65[4]) ^
                                                   (byte)(uVar63 >> 0x20),
                                                   CONCAT13((auVar64[3] | auVar65[3]) ^
                                                            (byte)(uVar63 >> 0x18),
                                                            CONCAT12((auVar64[2] | auVar65[2]) ^
                                                                     (byte)(uVar63 >> 0x10),
                                                                     CONCAT11((auVar64[1] |
                                                                              auVar65[1]) ^
                                                                              (byte)(uVar63 >> 8),
                                                                              (auVar64[0] |
                                                                              auVar65[0]) ^
                                                                              (byte)uVar63)))))));
          auVar44[8] = (auVar64[8] | auVar65[8]) ^ (byte)uVar16;
          auVar44[9] = (auVar64[9] | auVar65[9]) ^ (byte)(uVar16 >> 8);
          auVar44[10] = (auVar64[10] | auVar65[10]) ^ (byte)(uVar16 >> 0x10);
          auVar44[0xb] = (auVar64[0xb] | auVar65[0xb]) ^ (byte)(uVar16 >> 0x18);
          auVar44[0xc] = (auVar64[0xc] | auVar65[0xc]) ^ (byte)(uVar16 >> 0x20);
          auVar44[0xd] = (auVar64[0xd] | auVar65[0xd]) ^ (byte)(uVar16 >> 0x28);
          auVar44[0xe] = (auVar64[0xe] | auVar65[0xe]) ^ (byte)(uVar16 >> 0x30);
          auVar44[0xf] = (auVar64[0xf] | auVar65[0xf]) ^ (byte)(uVar16 >> 0x38);
          uVar16 = uVar16 >> 0x20 | uVar16 << 0x20;
          uVar63 = uVar63 ^ uVar17;
          auVar64._8_8_ = uVar63;
          auVar64._0_8_ = uVar16;
        } while (lVar23 != 0x20);
        auVar48._8_8_ = auVar44._8_8_;
        uVar22 = auVar44._0_8_ ^ uVar25 ^ 0x904378d1e380000;
        auVar48._0_8_ = uVar22;
        auVar64 = NEON_ushl(auVar48,auVar29,8);
        auVar44 = NEON_ushl(auVar48,auVar31,8);
        lVar23 = uVar22 + uVar16;
        uVar63 = uVar63 + auVar48._8_8_;
        auVar49._0_8_ =
             CONCAT17((auVar44[7] | auVar64[7]) ^ (byte)((ulong)lVar23 >> 0x38),
                      CONCAT16((auVar44[6] | auVar64[6]) ^ (byte)((ulong)lVar23 >> 0x30),
                               CONCAT15((auVar44[5] | auVar64[5]) ^ (byte)((ulong)lVar23 >> 0x28),
                                        CONCAT14((auVar44[4] | auVar64[4]) ^
                                                 (byte)((ulong)lVar23 >> 0x20),
                                                 CONCAT13((auVar44[3] | auVar64[3]) ^
                                                          (byte)((ulong)lVar23 >> 0x18),
                                                          CONCAT12((auVar44[2] | auVar64[2]) ^
                                                                   (byte)((ulong)lVar23 >> 0x10),
                                                                   CONCAT11((auVar44[1] | auVar64[1]
                                                                            ) ^ (byte)((ulong)lVar23
                                                                                      >> 8),
                                                                            (auVar44[0] | auVar64[0]
                                                                            ) ^ (byte)lVar23)))))));
        auVar49[8] = (auVar44[8] | auVar64[8]) ^ (byte)uVar63;
        auVar49[9] = (auVar44[9] | auVar64[9]) ^ (byte)(uVar63 >> 8);
        auVar49[10] = (auVar44[10] | auVar64[10]) ^ (byte)(uVar63 >> 0x10);
        auVar49[0xb] = (auVar44[0xb] | auVar64[0xb]) ^ (byte)(uVar63 >> 0x18);
        auVar49[0xc] = (auVar44[0xc] | auVar64[0xc]) ^ (byte)(uVar63 >> 0x20);
        auVar49[0xd] = (auVar44[0xd] | auVar64[0xd]) ^ (byte)(uVar63 >> 0x28);
        auVar49[0xe] = (auVar44[0xe] | auVar64[0xe]) ^ (byte)(uVar63 >> 0x30);
        auVar49[0xf] = (auVar44[0xf] | auVar64[0xf]) ^ (byte)(uVar63 >> 0x38);
        auVar64 = NEON_ushl(auVar49,auVar33,8);
        lVar60 = auVar49._0_8_ + (uVar63 >> 0x20 | uVar63 << 0x20);
        uVar22 = auVar49._8_8_ + lVar23;
        auVar4[8] = uVar35;
        auVar4._0_8_ = _UNK_0081ce10;
        auVar4[9] = uVar36;
        auVar4[10] = uVar37;
        auVar4[0xb] = uVar38;
        auVar4[0xc] = uVar39;
        auVar4[0xd] = uVar40;
        auVar4[0xe] = uVar41;
        auVar4[0xf] = uVar42;
        auVar44 = NEON_ushl(auVar49,auVar4,8);
        auVar50._0_8_ =
             CONCAT17((auVar44[7] | auVar64[7]) ^ (byte)((ulong)lVar60 >> 0x38),
                      CONCAT16((auVar44[6] | auVar64[6]) ^ (byte)((ulong)lVar60 >> 0x30),
                               CONCAT15((auVar44[5] | auVar64[5]) ^ (byte)((ulong)lVar60 >> 0x28),
                                        CONCAT14((auVar44[4] | auVar64[4]) ^
                                                 (byte)((ulong)lVar60 >> 0x20),
                                                 CONCAT13((auVar44[3] | auVar64[3]) ^
                                                          (byte)((ulong)lVar60 >> 0x18),
                                                          CONCAT12((auVar44[2] | auVar64[2]) ^
                                                                   (byte)((ulong)lVar60 >> 0x10),
                                                                   CONCAT11((auVar44[1] | auVar64[1]
                                                                            ) ^ (byte)((ulong)lVar60
                                                                                      >> 8),
                                                                            (auVar44[0] | auVar64[0]
                                                                            ) ^ (byte)lVar60)))))));
        auVar50[8] = (auVar44[8] | auVar64[8]) ^ (byte)uVar22;
        auVar50[9] = (auVar44[9] | auVar64[9]) ^ (byte)(uVar22 >> 8);
        auVar50[10] = (auVar44[10] | auVar64[10]) ^ (byte)(uVar22 >> 0x10);
        auVar50[0xb] = (auVar44[0xb] | auVar64[0xb]) ^ (byte)(uVar22 >> 0x18);
        auVar50[0xc] = (auVar44[0xc] | auVar64[0xc]) ^ (byte)(uVar22 >> 0x20);
        auVar50[0xd] = (auVar44[0xd] | auVar64[0xd]) ^ (byte)(uVar22 >> 0x28);
        auVar50[0xe] = (auVar44[0xe] | auVar64[0xe]) ^ (byte)(uVar22 >> 0x30);
        auVar50[0xf] = (auVar44[0xf] | auVar64[0xf]) ^ (byte)(uVar22 >> 0x38);
        auVar64 = NEON_ushl(auVar50,auVar29,8);
        lVar23 = auVar50._0_8_ + (uVar22 >> 0x20 | uVar22 << 0x20);
        uVar22 = auVar50._8_8_ + lVar60;
        auVar44 = NEON_ushl(auVar50,auVar31,8);
        auVar51._0_8_ =
             CONCAT17((auVar44[7] | auVar64[7]) ^ (byte)((ulong)lVar23 >> 0x38),
                      CONCAT16((auVar44[6] | auVar64[6]) ^ (byte)((ulong)lVar23 >> 0x30),
                               CONCAT15((auVar44[5] | auVar64[5]) ^ (byte)((ulong)lVar23 >> 0x28),
                                        CONCAT14((auVar44[4] | auVar64[4]) ^
                                                 (byte)((ulong)lVar23 >> 0x20),
                                                 CONCAT13((auVar44[3] | auVar64[3]) ^
                                                          (byte)((ulong)lVar23 >> 0x18),
                                                          CONCAT12((auVar44[2] | auVar64[2]) ^
                                                                   (byte)((ulong)lVar23 >> 0x10),
                                                                   CONCAT11((auVar44[1] | auVar64[1]
                                                                            ) ^ (byte)((ulong)lVar23
                                                                                      >> 8),
                                                                            (auVar44[0] | auVar64[0]
                                                                            ) ^ (byte)lVar23)))))));
        auVar51[8] = (auVar44[8] | auVar64[8]) ^ (byte)uVar22;
        auVar51[9] = (auVar44[9] | auVar64[9]) ^ (byte)(uVar22 >> 8);
        auVar51[10] = (auVar44[10] | auVar64[10]) ^ (byte)(uVar22 >> 0x10);
        auVar51[0xb] = (auVar44[0xb] | auVar64[0xb]) ^ (byte)(uVar22 >> 0x18);
        auVar51[0xc] = (auVar44[0xc] | auVar64[0xc]) ^ (byte)(uVar22 >> 0x20);
        auVar51[0xd] = (auVar44[0xd] | auVar64[0xd]) ^ (byte)(uVar22 >> 0x28);
        auVar51[0xe] = (auVar44[0xe] | auVar64[0xe]) ^ (byte)(uVar22 >> 0x30);
        auVar51[0xf] = (auVar44[0xf] | auVar64[0xf]) ^ (byte)(uVar22 >> 0x38);
        auVar64 = NEON_ushl(auVar51,auVar33,8);
        uVar22 = auVar51._0_8_ + (uVar22 >> 0x20 | uVar22 << 0x20);
        uVar16 = auVar51._8_8_ + lVar23;
        auVar5[8] = uVar35;
        auVar5._0_8_ = _UNK_0081ce10;
        auVar5[9] = uVar36;
        auVar5[10] = uVar37;
        auVar5[0xb] = uVar38;
        auVar5[0xc] = uVar39;
        auVar5[0xd] = uVar40;
        auVar5[0xe] = uVar41;
        auVar5[0xf] = uVar42;
        auVar44 = NEON_ushl(auVar51,auVar5,8);
        auVar52._0_8_ =
             CONCAT17((auVar44[7] | auVar64[7]) ^ (byte)(uVar22 >> 0x38),
                      CONCAT16((auVar44[6] | auVar64[6]) ^ (byte)(uVar22 >> 0x30),
                               CONCAT15((auVar44[5] | auVar64[5]) ^ (byte)(uVar22 >> 0x28),
                                        CONCAT14((auVar44[4] | auVar64[4]) ^ (byte)(uVar22 >> 0x20),
                                                 CONCAT13((auVar44[3] | auVar64[3]) ^
                                                          (byte)(uVar22 >> 0x18),
                                                          CONCAT12((auVar44[2] | auVar64[2]) ^
                                                                   (byte)(uVar22 >> 0x10),
                                                                   CONCAT11((auVar44[1] | auVar64[1]
                                                                            ) ^ (byte)(uVar22 >> 8),
                                                                            (auVar44[0] | auVar64[0]
                                                                            ) ^ (byte)uVar22)))))));
        auVar52[8] = (auVar44[8] | auVar64[8]) ^ (byte)uVar16;
        auVar52[9] = (auVar44[9] | auVar64[9]) ^ (byte)(uVar16 >> 8);
        auVar52[10] = (auVar44[10] | auVar64[10]) ^ (byte)(uVar16 >> 0x10);
        auVar52[0xb] = (auVar44[0xb] | auVar64[0xb]) ^ (byte)(uVar16 >> 0x18);
        auVar52[0xc] = (auVar44[0xc] | auVar64[0xc]) ^ (byte)(uVar16 >> 0x20);
        auVar52[0xd] = (auVar44[0xd] | auVar64[0xd]) ^ (byte)(uVar16 >> 0x28);
        auVar52[0xe] = (auVar44[0xe] | auVar64[0xe]) ^ (byte)(uVar16 >> 0x30);
        auVar52[0xf] = (auVar44[0xf] | auVar64[0xf]) ^ (byte)(uVar16 >> 0x38);
        auVar64 = NEON_ushl(auVar52,auVar29,8);
        auVar44 = NEON_ushl(auVar52,auVar31,8);
        lVar23 = auVar52._0_8_ + ((uVar16 >> 0x20 | uVar16 << 0x20) ^ 0x290086f1a338);
        uVar22 = (uVar22 ^ uVar25 ^ 0x904378d1e380000) + auVar52._8_8_;
        auVar53._0_8_ =
             CONCAT17((auVar44[7] | auVar64[7]) ^ (byte)((ulong)lVar23 >> 0x38),
                      CONCAT16((auVar44[6] | auVar64[6]) ^ (byte)((ulong)lVar23 >> 0x30),
                               CONCAT15((auVar44[5] | auVar64[5]) ^ (byte)((ulong)lVar23 >> 0x28),
                                        CONCAT14((auVar44[4] | auVar64[4]) ^
                                                 (byte)((ulong)lVar23 >> 0x20),
                                                 CONCAT13((auVar44[3] | auVar64[3]) ^
                                                          (byte)((ulong)lVar23 >> 0x18),
                                                          CONCAT12((auVar44[2] | auVar64[2]) ^
                                                                   (byte)((ulong)lVar23 >> 0x10),
                                                                   CONCAT11((auVar44[1] | auVar64[1]
                                                                            ) ^ (byte)((ulong)lVar23
                                                                                      >> 8),
                                                                            (auVar44[0] | auVar64[0]
                                                                            ) ^ (byte)lVar23)))))));
        auVar53[8] = (auVar44[8] | auVar64[8]) ^ (byte)uVar22;
        auVar53[9] = (auVar44[9] | auVar64[9]) ^ (byte)(uVar22 >> 8);
        auVar53[10] = (auVar44[10] | auVar64[10]) ^ (byte)(uVar22 >> 0x10);
        auVar53[0xb] = (auVar44[0xb] | auVar64[0xb]) ^ (byte)(uVar22 >> 0x18);
        auVar53[0xc] = (auVar44[0xc] | auVar64[0xc]) ^ (byte)(uVar22 >> 0x20);
        auVar53[0xd] = (auVar44[0xd] | auVar64[0xd]) ^ (byte)(uVar22 >> 0x28);
        auVar53[0xe] = (auVar44[0xe] | auVar64[0xe]) ^ (byte)(uVar22 >> 0x30);
        auVar53[0xf] = (auVar44[0xf] | auVar64[0xf]) ^ (byte)(uVar22 >> 0x38);
        auVar64 = NEON_ushl(auVar53,auVar33,8);
        lVar60 = (uVar22 >> 0x20 | uVar22 << 0x20) + auVar53._0_8_;
        uVar22 = lVar23 + auVar53._8_8_;
        auVar6[8] = uVar35;
        auVar6._0_8_ = _UNK_0081ce10;
        auVar6[9] = uVar36;
        auVar6[10] = uVar37;
        auVar6[0xb] = uVar38;
        auVar6[0xc] = uVar39;
        auVar6[0xd] = uVar40;
        auVar6[0xe] = uVar41;
        auVar6[0xf] = uVar42;
        auVar44 = NEON_ushl(auVar53,auVar6,8);
        auVar54._0_8_ =
             CONCAT17((auVar44[7] | auVar64[7]) ^ (byte)((ulong)lVar60 >> 0x38),
                      CONCAT16((auVar44[6] | auVar64[6]) ^ (byte)((ulong)lVar60 >> 0x30),
                               CONCAT15((auVar44[5] | auVar64[5]) ^ (byte)((ulong)lVar60 >> 0x28),
                                        CONCAT14((auVar44[4] | auVar64[4]) ^
                                                 (byte)((ulong)lVar60 >> 0x20),
                                                 CONCAT13((auVar44[3] | auVar64[3]) ^
                                                          (byte)((ulong)lVar60 >> 0x18),
                                                          CONCAT12((auVar44[2] | auVar64[2]) ^
                                                                   (byte)((ulong)lVar60 >> 0x10),
                                                                   CONCAT11((auVar44[1] | auVar64[1]
                                                                            ) ^ (byte)((ulong)lVar60
                                                                                      >> 8),
                                                                            (auVar44[0] | auVar64[0]
                                                                            ) ^ (byte)lVar60)))))));
        auVar54[8] = (auVar44[8] | auVar64[8]) ^ (byte)uVar22;
        auVar54[9] = (auVar44[9] | auVar64[9]) ^ (byte)(uVar22 >> 8);
        auVar54[10] = (auVar44[10] | auVar64[10]) ^ (byte)(uVar22 >> 0x10);
        auVar54[0xb] = (auVar44[0xb] | auVar64[0xb]) ^ (byte)(uVar22 >> 0x18);
        auVar54[0xc] = (auVar44[0xc] | auVar64[0xc]) ^ (byte)(uVar22 >> 0x20);
        auVar54[0xd] = (auVar44[0xd] | auVar64[0xd]) ^ (byte)(uVar22 >> 0x28);
        auVar54[0xe] = (auVar44[0xe] | auVar64[0xe]) ^ (byte)(uVar22 >> 0x30);
        auVar54[0xf] = (auVar44[0xf] | auVar64[0xf]) ^ (byte)(uVar22 >> 0x38);
        auVar64 = NEON_ushl(auVar54,auVar29,8);
        lVar23 = (uVar22 >> 0x20 | uVar22 << 0x20) + auVar54._0_8_;
        uVar22 = lVar60 + auVar54._8_8_;
        auVar44 = NEON_ushl(auVar54,auVar31,8);
        auVar55._0_8_ =
             CONCAT17((auVar44[7] | auVar64[7]) ^ (byte)((ulong)lVar23 >> 0x38),
                      CONCAT16((auVar44[6] | auVar64[6]) ^ (byte)((ulong)lVar23 >> 0x30),
                               CONCAT15((auVar44[5] | auVar64[5]) ^ (byte)((ulong)lVar23 >> 0x28),
                                        CONCAT14((auVar44[4] | auVar64[4]) ^
                                                 (byte)((ulong)lVar23 >> 0x20),
                                                 CONCAT13((auVar44[3] | auVar64[3]) ^
                                                          (byte)((ulong)lVar23 >> 0x18),
                                                          CONCAT12((auVar44[2] | auVar64[2]) ^
                                                                   (byte)((ulong)lVar23 >> 0x10),
                                                                   CONCAT11((auVar44[1] | auVar64[1]
                                                                            ) ^ (byte)((ulong)lVar23
                                                                                      >> 8),
                                                                            (auVar44[0] | auVar64[0]
                                                                            ) ^ (byte)lVar23)))))));
        auVar55[8] = (auVar44[8] | auVar64[8]) ^ (byte)uVar22;
        auVar55[9] = (auVar44[9] | auVar64[9]) ^ (byte)(uVar22 >> 8);
        auVar55[10] = (auVar44[10] | auVar64[10]) ^ (byte)(uVar22 >> 0x10);
        auVar55[0xb] = (auVar44[0xb] | auVar64[0xb]) ^ (byte)(uVar22 >> 0x18);
        auVar55[0xc] = (auVar44[0xc] | auVar64[0xc]) ^ (byte)(uVar22 >> 0x20);
        auVar55[0xd] = (auVar44[0xd] | auVar64[0xd]) ^ (byte)(uVar22 >> 0x28);
        auVar55[0xe] = (auVar44[0xe] | auVar64[0xe]) ^ (byte)(uVar22 >> 0x30);
        auVar55[0xf] = (auVar44[0xf] | auVar64[0xf]) ^ (byte)(uVar22 >> 0x38);
        auVar64 = NEON_ushl(auVar55,auVar33,8);
        lVar60 = (uVar22 >> 0x20 | uVar22 << 0x20) + auVar55._0_8_;
        uVar22 = lVar23 + auVar55._8_8_;
        auVar7[8] = uVar35;
        auVar7._0_8_ = _UNK_0081ce10;
        auVar7[9] = uVar36;
        auVar7[10] = uVar37;
        auVar7[0xb] = uVar38;
        auVar7[0xc] = uVar39;
        auVar7[0xd] = uVar40;
        auVar7[0xe] = uVar41;
        auVar7[0xf] = uVar42;
        auVar44 = NEON_ushl(auVar55,auVar7,8);
        auVar56._0_8_ =
             CONCAT17((auVar44[7] | auVar64[7]) ^ (byte)((ulong)lVar60 >> 0x38),
                      CONCAT16((auVar44[6] | auVar64[6]) ^ (byte)((ulong)lVar60 >> 0x30),
                               CONCAT15((auVar44[5] | auVar64[5]) ^ (byte)((ulong)lVar60 >> 0x28),
                                        CONCAT14((auVar44[4] | auVar64[4]) ^
                                                 (byte)((ulong)lVar60 >> 0x20),
                                                 CONCAT13((auVar44[3] | auVar64[3]) ^
                                                          (byte)((ulong)lVar60 >> 0x18),
                                                          CONCAT12((auVar44[2] | auVar64[2]) ^
                                                                   (byte)((ulong)lVar60 >> 0x10),
                                                                   CONCAT11((auVar44[1] | auVar64[1]
                                                                            ) ^ (byte)((ulong)lVar60
                                                                                      >> 8),
                                                                            (auVar44[0] | auVar64[0]
                                                                            ) ^ (byte)lVar60)))))));
        auVar56[8] = (auVar44[8] | auVar64[8]) ^ (byte)uVar22;
        auVar56[9] = (auVar44[9] | auVar64[9]) ^ (byte)(uVar22 >> 8);
        auVar56[10] = (auVar44[10] | auVar64[10]) ^ (byte)(uVar22 >> 0x10);
        auVar56[0xb] = (auVar44[0xb] | auVar64[0xb]) ^ (byte)(uVar22 >> 0x18);
        auVar56[0xc] = (auVar44[0xc] | auVar64[0xc]) ^ (byte)(uVar22 >> 0x20);
        auVar56[0xd] = (auVar44[0xd] | auVar64[0xd]) ^ (byte)(uVar22 >> 0x28);
        auVar56[0xe] = (auVar44[0xe] | auVar64[0xe]) ^ (byte)(uVar22 >> 0x30);
        auVar56[0xf] = (auVar44[0xf] | auVar64[0xf]) ^ (byte)(uVar22 >> 0x38);
        auVar64 = NEON_ushl(auVar56,auVar29,8);
        lVar23 = (uVar22 >> 0x20 | uVar22 << 0x20) + auVar56._0_8_;
        uVar22 = lVar60 + auVar56._8_8_;
        auVar44 = NEON_ushl(auVar56,auVar31,8);
        auVar57._0_8_ =
             CONCAT17((auVar44[7] | auVar64[7]) ^ (byte)((ulong)lVar23 >> 0x38),
                      CONCAT16((auVar44[6] | auVar64[6]) ^ (byte)((ulong)lVar23 >> 0x30),
                               CONCAT15((auVar44[5] | auVar64[5]) ^ (byte)((ulong)lVar23 >> 0x28),
                                        CONCAT14((auVar44[4] | auVar64[4]) ^
                                                 (byte)((ulong)lVar23 >> 0x20),
                                                 CONCAT13((auVar44[3] | auVar64[3]) ^
                                                          (byte)((ulong)lVar23 >> 0x18),
                                                          CONCAT12((auVar44[2] | auVar64[2]) ^
                                                                   (byte)((ulong)lVar23 >> 0x10),
                                                                   CONCAT11((auVar44[1] | auVar64[1]
                                                                            ) ^ (byte)((ulong)lVar23
                                                                                      >> 8),
                                                                            (auVar44[0] | auVar64[0]
                                                                            ) ^ (byte)lVar23)))))));
        auVar57[8] = (auVar44[8] | auVar64[8]) ^ (byte)uVar22;
        auVar57[9] = (auVar44[9] | auVar64[9]) ^ (byte)(uVar22 >> 8);
        auVar57[10] = (auVar44[10] | auVar64[10]) ^ (byte)(uVar22 >> 0x10);
        auVar57[0xb] = (auVar44[0xb] | auVar64[0xb]) ^ (byte)(uVar22 >> 0x18);
        auVar57[0xc] = (auVar44[0xc] | auVar64[0xc]) ^ (byte)(uVar22 >> 0x20);
        auVar57[0xd] = (auVar44[0xd] | auVar64[0xd]) ^ (byte)(uVar22 >> 0x28);
        auVar57[0xe] = (auVar44[0xe] | auVar64[0xe]) ^ (byte)(uVar22 >> 0x30);
        auVar57[0xf] = (auVar44[0xf] | auVar64[0xf]) ^ (byte)(uVar22 >> 0x38);
        lVar60 = (uVar22 >> 0x20 | uVar22 << 0x20) + auVar57._0_8_;
        uVar22 = lVar23 + auVar57._8_8_;
        auVar64 = NEON_ushl(auVar57,auVar33,8);
        auVar8[8] = uVar35;
        auVar8._0_8_ = _UNK_0081ce10;
        auVar8[9] = uVar36;
        auVar8[10] = uVar37;
        auVar8[0xb] = uVar38;
        auVar8[0xc] = uVar39;
        auVar8[0xd] = uVar40;
        auVar8[0xe] = uVar41;
        auVar8[0xf] = uVar42;
        auVar44 = NEON_ushl(auVar57,auVar8,8);
        auVar58._0_8_ =
             CONCAT17((auVar44[7] | auVar64[7]) ^ (byte)((ulong)lVar60 >> 0x38),
                      CONCAT16((auVar44[6] | auVar64[6]) ^ (byte)((ulong)lVar60 >> 0x30),
                               CONCAT15((auVar44[5] | auVar64[5]) ^ (byte)((ulong)lVar60 >> 0x28),
                                        CONCAT14((auVar44[4] | auVar64[4]) ^
                                                 (byte)((ulong)lVar60 >> 0x20),
                                                 CONCAT13((auVar44[3] | auVar64[3]) ^
                                                          (byte)((ulong)lVar60 >> 0x18),
                                                          CONCAT12((auVar44[2] | auVar64[2]) ^
                                                                   (byte)((ulong)lVar60 >> 0x10),
                                                                   CONCAT11((auVar44[1] | auVar64[1]
                                                                            ) ^ (byte)((ulong)lVar60
                                                                                      >> 8),
                                                                            (auVar44[0] | auVar64[0]
                                                                            ) ^ (byte)lVar60)))))));
        auVar58[8] = (auVar44[8] | auVar64[8]) ^ (byte)uVar22;
        auVar58[9] = (auVar44[9] | auVar64[9]) ^ (byte)(uVar22 >> 8);
        auVar58[10] = (auVar44[10] | auVar64[10]) ^ (byte)(uVar22 >> 0x10);
        auVar58[0xb] = (auVar44[0xb] | auVar64[0xb]) ^ (byte)(uVar22 >> 0x18);
        auVar58[0xc] = (auVar44[0xc] | auVar64[0xc]) ^ (byte)(uVar22 >> 0x20);
        auVar58[0xd] = (auVar44[0xd] | auVar64[0xd]) ^ (byte)(uVar22 >> 0x28);
        auVar58[0xe] = (auVar44[0xe] | auVar64[0xe]) ^ (byte)(uVar22 >> 0x30);
        auVar58[0xf] = (auVar44[0xf] | auVar64[0xf]) ^ (byte)(uVar22 >> 0x38);
        auVar44 = NEON_ushl(auVar58,auVar29,8);
        auVar64 = NEON_ushl(auVar58,auVar31,8);
        lVar23 = (uVar22 >> 0x20 | uVar22 << 0x20) + auVar58._0_8_;
        lVar60 = lVar60 + auVar58._8_8_;
        auVar62[0] = (auVar64[0] | auVar44[0]) ^ (byte)lVar23;
        auVar62[1] = (auVar64[1] | auVar44[1]) ^ (byte)((ulong)lVar23 >> 8);
        auVar62[2] = (auVar64[2] | auVar44[2]) ^ (byte)((ulong)lVar23 >> 0x10);
        auVar62[3] = (auVar64[3] | auVar44[3]) ^ (byte)((ulong)lVar23 >> 0x18);
        auVar62[4] = (auVar64[4] | auVar44[4]) ^ (byte)((ulong)lVar23 >> 0x20);
        auVar62[5] = (auVar64[5] | auVar44[5]) ^ (byte)((ulong)lVar23 >> 0x28);
        auVar62[6] = (auVar64[6] | auVar44[6]) ^ (byte)((ulong)lVar23 >> 0x30);
        auVar62[7] = (auVar64[7] | auVar44[7]) ^ (byte)((ulong)lVar23 >> 0x38);
        auVar62[8] = (auVar64[8] | auVar44[8]) ^ (byte)lVar60;
        auVar62[9] = (auVar64[9] | auVar44[9]) ^ (byte)((ulong)lVar60 >> 8);
        auVar62[10] = (auVar64[10] | auVar44[10]) ^ (byte)((ulong)lVar60 >> 0x10);
        auVar62[0xb] = (auVar64[0xb] | auVar44[0xb]) ^ (byte)((ulong)lVar60 >> 0x18);
        auVar62[0xc] = (auVar64[0xc] | auVar44[0xc]) ^ (byte)((ulong)lVar60 >> 0x20);
        auVar62[0xd] = (auVar64[0xd] | auVar44[0xd]) ^ (byte)((ulong)lVar60 >> 0x28);
        auVar62[0xe] = (auVar64[0xe] | auVar44[0xe]) ^ (byte)((ulong)lVar60 >> 0x30);
        auVar62[0xf] = (auVar64[0xf] | auVar44[0xf]) ^ (byte)((ulong)lVar60 >> 0x38);
        auVar64 = NEON_ushl(auVar62,auVar33,8);
        auVar9[8] = uVar35;
        auVar9._0_8_ = _UNK_0081ce10;
        auVar9[9] = uVar36;
        auVar9[10] = uVar37;
        auVar9[0xb] = uVar38;
        auVar9[0xc] = uVar39;
        auVar9[0xd] = uVar40;
        auVar9[0xe] = uVar41;
        auVar9[0xf] = uVar42;
        auVar44 = NEON_ushl(auVar62,auVar9,8);
        uVar22 = auVar62._8_8_ + lVar23;
        auStack_80[lVar20] =
             CONCAT17((auVar44[7] | auVar64[7]) ^ (auVar44[0xf] | auVar64[0xf]),
                      CONCAT16((auVar44[6] | auVar64[6]) ^ (auVar44[0xe] | auVar64[0xe]),
                               CONCAT15((auVar44[5] | auVar64[5]) ^ (auVar44[0xd] | auVar64[0xd]),
                                        CONCAT14((auVar44[4] | auVar64[4]) ^
                                                 (auVar44[0xc] | auVar64[0xc]),
                                                 CONCAT13((auVar44[3] | auVar64[3]) ^
                                                          (auVar44[0xb] | auVar64[0xb]),
                                                          CONCAT12((auVar44[2] | auVar64[2]) ^
                                                                   (auVar44[10] | auVar64[10]),
                                                                   CONCAT11((auVar44[1] | auVar64[1]
                                                                            ) ^ (auVar44[9] |
                                                                                auVar64[9]),
                                                                            (auVar44[0] | auVar64[0]
                                                                            ) ^ (auVar44[8] |
                                                                                auVar64[8])))))))) ^
             (uVar22 >> 0x20 | uVar22 << 0x20) ^ uVar22;
        lVar20 = lVar20 + 1;
      } while (lVar20 != 4);
      uVar11 = CONCAT17(bStack_69,
                        CONCAT16(bStack_6a,
                                 CONCAT15(bStack_6b,
                                          CONCAT14(bStack_6c,
                                                   CONCAT13(bStack_6d,
                                                            CONCAT12(bStack_6e,
                                                                     CONCAT11(bStack_6f,bStack_70)))
                                                  ))));
      uVar12 = CONCAT17(bStack_61,
                        CONCAT16(bStack_62,
                                 CONCAT15(bStack_63,
                                          CONCAT14(bStack_64,
                                                   CONCAT13(bStack_65,
                                                            CONCAT12(bStack_66,
                                                                     CONCAT11(bStack_67,bStack_68)))
                                                  ))));
      uVar16 = 0;
      auVar30._8_8_ = _UNK_0081d278;
      auVar30._0_8_ = _UNK_0081d270;
      auVar32._8_8_ = uVar11;
      auVar32._0_8_ = uVar11;
      auVar28._8_8_ = _UNK_0081d208;
      auVar28._0_8_ = _UNK_0081d200;
      auVar64 = NEON_ushl(auVar32,auVar30,8);
      auVar59._8_8_ = uVar12;
      auVar59._0_8_ = uVar12;
      auVar33 = NEON_ushl(auVar32,auVar28,8);
      auVar34._8_8_ = auStack_80[1];
      auVar34._0_8_ = auStack_80[1];
      auVar65 = NEON_ushl(auVar34,auVar30,8);
      auVar31 = NEON_ushl(auVar59,auVar30,8);
      auVar44 = NEON_ushl(auVar34,auVar28,8);
      auVar29 = NEON_ushl(auVar59,auVar28,8);
      uVar17 = 0x9e3779b185ebca87;
      uVar22 = 0x12;
      uVar21 = uVar21 >> 5;
      auStack_80[1] =
           CONCAT17((byte)(auStack_80[1] >> 0x38) ^ bStack_b1,
                    CONCAT16((byte)(auStack_80[1] >> 0x30) ^ bStack_b2,
                             CONCAT15((byte)(auStack_80[1] >> 0x28) ^ bStack_b3,
                                      CONCAT14(auVar44[8] ^ bStack_b4,
                                               CONCAT13(auVar44[0] ^ bStack_b5,
                                                        CONCAT12(auVar65[8] ^ bStack_b6,
                                                                 CONCAT11(auVar65[0] ^ bStack_b7,
                                                                          (byte)auStack_80[1] ^
                                                                          bStack_b8)))))));
      auStack_80[0] =
           CONCAT17((byte)(auStack_80[0] >> 0x38) ^ bStack_b9,
                    CONCAT16((byte)(auStack_80[0] >> 0x30) ^ bStack_ba,
                             CONCAT15((byte)(auStack_80[0] >> 0x28) ^ bStack_bb,
                                      CONCAT14(((byte)(auStack_80[0] >> 0x20) | 0x40) ^ bStack_bc,
                                               CONCAT13((byte)(auStack_80[0] >> 0x18) ^ bStack_bd,
                                                        CONCAT12((byte)(auStack_80[0] >> 0x10) ^
                                                                 bStack_be,
                                                                 CONCAT11((byte)(auStack_80[0] >> 8)
                                                                          ^ bStack_bf,
                                                                          (byte)auStack_80[0] ^
                                                                          bStack_c0)))))));
      bStack_68 = bStack_68 ^ bStack_a8;
      bStack_67 = auVar31[0] ^ bStack_a7;
      bStack_66 = auVar31[8] ^ bStack_a6;
      bStack_65 = auVar29[0] ^ bStack_a5;
      bStack_64 = auVar29[8] ^ bStack_a4;
      bStack_63 = bStack_63 ^ bStack_a3;
      bStack_62 = bStack_62 ^ bStack_a2;
      bStack_61 = bStack_61 ^ bStack_a1;
      bStack_70 = bStack_70 ^ bStack_b0;
      bStack_6f = auVar64[0] ^ bStack_af;
      bStack_6e = auVar64[8] ^ bStack_ae;
      bStack_6d = auVar33[0] ^ bStack_ad;
      bStack_6c = auVar33[8] ^ bStack_ac;
      bStack_6b = bStack_6b ^ bStack_ab;
      bStack_6a = bStack_6a ^ bStack_aa;
      bStack_69 = bStack_69 ^ bStack_a9;
      do {
        uVar25 = uVar22 & 0x1f;
        iVar14 = (int)uVar22;
        uVar22 = uVar22 + 0xd;
        iVar24 = (int)((uVar16 & 0xffffffff) * 0x24924925 >> 0x20);
        uVar26 = (ulong)*(byte *)((long)auStack_80 + uVar25) * -0x2917014799a6026d ^ uVar17;
        uVar17 = uVar17 + 0x9e3779b185ebca87;
        uVar25 = 0;
        if (uVar21 != 0) {
          uVar25 = uVar26 / uVar21;
        }
        uVar2 = (int)uVar16 + (iVar24 + ((uint)((int)uVar16 - iVar24) >> 1) >> 2) * -7;
        bVar18 = *(byte *)((long)auStack_80 + ((ulong)(iVar14 - 0xb) & 0x1f));
        lVar20 = (uVar26 - uVar25 * uVar21) + uVar16 * uVar21;
        uVar16 = uVar16 + 1;
        puVar13[lVar20] =
             puVar13[lVar20] ^
             (bVar18 << (ulong)(uVar2 + 1 & 0x1f) | bVar18 >> (ulong)((uVar2 ^ 7) & 0x1f));
      } while (uVar22 != 0x1b2);
      auStack_80[0] = 0;
      auStack_80[1] = 0;
      bStack_70 = 0;
      bStack_6f = 0;
      bStack_6e = 0;
      bStack_6d = 0;
      bStack_6c = 0;
      bStack_6b = 0;
      bStack_6a = 0;
      bStack_69 = 0;
      bStack_68 = 0;
      bStack_67 = 0;
      bStack_66 = 0;
      bStack_65 = 0;
      bStack_64 = 0;
      bStack_63 = 0;
      bStack_62 = 0;
      bStack_61 = 0;
      uStack_a0._0_1_ = 0;
      uStack_a0._1_1_ = 0;
      uStack_a0._2_1_ = 0;
      uStack_a0._3_1_ = 0;
      uStack_a0._4_1_ = 0;
      uStack_a0._5_1_ = 0;
      uStack_a0._6_1_ = 0;
      uStack_a0._7_1_ = 0;
      uStack_98 = 0;
      uStack_97 = 0;
      uStack_96 = 0;
      uStack_95 = 0;
      uStack_94 = 0;
      uStack_93 = 0;
      uStack_92 = 0;
      uStack_91 = 0;
      uStack_90 = 0;
      uStack_8f = 0;
      uStack_8e = 0;
      uStack_8d = 0;
      uStack_8c = 0;
      uStack_8b = 0;
      uStack_8a = 0;
      uStack_89 = 0;
      uStack_88 = 0;
      uStack_87 = 0;
      uStack_86 = 0;
      uStack_85 = 0;
      uStack_84 = 0;
      uStack_83 = 0;
      uStack_82 = 0;
      uStack_81 = 0;
    }
    if ((0x3f < uStack_f0) && (puStack_e8 != (undefined1 *)0x0)) {
      uVar22 = 0;
      uVar17 = uStack_f0 >> 5;
      uVar21 = 0x13;
      uVar16 = 0x94d049bb133111eb;
      do {
        iVar14 = (int)uVar21;
        uVar63 = uVar16 ^ uStack_f0;
        uVar26 = uVar21 & 0x1f;
        uVar21 = uVar21 + 7;
        uVar16 = uVar16 + 0x94d049bb133111eb;
        uVar63 = uVar63 ^ (ulong)abStack_110[(ulong)(iVar14 - 0x13) & 0x1f] * -0x40a7b892e31b1a47;
        uVar25 = 0;
        if (uVar17 != 0) {
          uVar25 = uVar63 / uVar17;
        }
        iVar14 = (int)((uVar22 & 0xffffffff) * 0x24924925 >> 0x20);
        lVar20 = (uVar63 - uVar25 * uVar17) + uVar22 * uVar17;
        uVar2 = (int)uVar22 + (iVar14 + ((uint)((int)uVar22 - iVar14) >> 1) >> 2) * -7;
        uVar22 = uVar22 + 1;
        puStack_e8[lVar20] =
             puStack_e8[lVar20] ^
             (abStack_110[uVar26] << (ulong)(uVar2 + 1 & 0x1f) |
             abStack_110[uVar26] >> (ulong)((uVar2 ^ 7) & 0x1f));
      } while (uVar21 != 0xf3);
    }
    abStack_110[0] = 0;
    abStack_110[1] = 0;
    abStack_110[2] = 0;
    abStack_110[3] = 0;
    abStack_110[4] = 0;
    abStack_110[5] = 0;
    abStack_110[6] = 0;
    abStack_110[7] = 0;
    abStack_110[8] = 0;
    abStack_110[9] = 0;
    abStack_110[10] = 0;
    abStack_110[0xb] = 0;
    abStack_110[0xc] = 0;
    abStack_110[0xd] = 0;
    abStack_110[0xe] = 0;
    abStack_110[0xf] = 0;
    abStack_110[0x10] = 0;
    abStack_110[0x11] = 0;
    abStack_110[0x12] = 0;
    abStack_110[0x13] = 0;
    abStack_110[0x14] = 0;
    abStack_110[0x15] = 0;
    abStack_110[0x16] = 0;
    abStack_110[0x17] = 0;
    abStack_110[0x18] = 0;
    abStack_110[0x19] = 0;
    abStack_110[0x1a] = 0;
    abStack_110[0x1b] = 0;
    abStack_110[0x1c] = 0;
    abStack_110[0x1d] = 0;
    abStack_110[0x1e] = 0;
    abStack_110[0x1f] = 0;
    iVar14 = FUN_0067d700(param_1,puStack_e8,uStack_f0,&piStack_e0,&UNK_00816ded);
    puVar13 = puStack_e8;
    for (uVar21 = uStack_f0; uVar21 != 0; uVar21 = uVar21 - 1) {
      *puVar13 = 0;
      puVar13 = puVar13 + 1;
    }
    thunk_FUN_0053d3b8(puStack_e8);
    lVar20 = FUN_004d9808();
    if (lVar20 != 0) {
      if ((uStack_d8 & 0xffffffff) == 6) {
        auVar67 = FUN_0065e8c0(param_1);
        piVar19 = auVar67._0_8_;
        if ((0xfffffff4 < auVar67._8_4_) && (iVar14 = *piVar19, *piVar19 = iVar14 + -1, iVar14 < 2))
        {
LAB_0057e6cc:
          FUN_0065e640(param_1,piVar19);
        }
      }
      else if ((((uStack_d8 & 0xffffffff) != 3) && (0xfffffff4 < (uint)uStack_d8)) &&
              (iVar14 = *piStack_e0, iVar24 = iVar14 + -1, *piStack_e0 = iVar24,
              piVar19 = piStack_e0, iVar24 == 0 || iVar14 < 1)) goto LAB_0057e6cc;
      goto LAB_0057e610;
    }
    if (iVar14 != 0) {
      if ((uint)uStack_d8 == 6) {
        auVar67 = FUN_0065e8c0(param_1);
        piVar19 = auVar67._0_8_;
        if ((0xfffffff4 < auVar67._8_4_) &&
           (iVar14 = *piVar19, iVar24 = iVar14 + -1, *piVar19 = iVar24, iVar24 == 0 || iVar14 < 1))
        {
          FUN_0065e640(param_1,piVar19);
        }
      }
      goto LAB_0057e60c;
    }
    auVar29 = FUN_0057bc28(param_1,lVar15,&UNK_00816ded,piStack_e0,uStack_d8,uStack_d0,uStack_c8,1);
  }
  else {
LAB_0057e610:
    auVar29 = FUN_005787e8(param_1,&UNK_008124b5);
  }
  uVar21 = auVar29._0_8_ & 0xffffffff00000000;
LAB_0057e628:
  FUN_00574d04(auStack_158);
  auVar66._8_8_ = auVar29._8_8_;
  auVar66._0_8_ = uVar21 | auVar29._0_8_ & 0xffffffff;
  return auVar66;
}



/* RVA 47e700 */

undefined4
Inspect_47e700(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
              undefined8 param_5)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined1 auStack_78 [72];
  
  uVar2 = FUN_0065aa30();
  FUN_00574ce8(auStack_78,param_1,param_4,param_5,uVar2);
  uVar1 = func_0x002f445c();
  FUN_00574d04(auStack_78);
  return uVar1;
}



/* RVA 47d734 */

undefined1  [16]
Inspect_47d734(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
              undefined8 param_5)

{
  int iVar1;
  undefined8 uVar2;
  int iVar3;
  long lVar4;
  undefined1 *puVar5;
  int *piVar6;
  long lVar7;
  ulong uVar8;
  undefined8 uVar9;
  undefined1 auVar10 [16];
  undefined1 auVar11 [12];
  undefined1 auStack_d8 [72];
  undefined8 uStack_90;
  undefined8 uStack_88;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  int iStack_68;
  undefined4 uStack_64;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_28;
  
  lVar4 = FUN_0065aa30();
  FUN_00574ce8(auStack_d8,param_1,param_4,param_5,lVar4);
  uVar9 = *(undefined8 *)(*(long *)(lVar4 + 0x10) + 8);
  iVar3 = FUN_00574e08(auStack_d8,&UNK_0080f6a4,&uStack_28,&uStack_50,&uStack_60);
  uVar2 = uStack_28;
  if (iVar3 == 0) {
    uVar8 = 0;
    auVar10 = ZEXT816(6) << 0x40;
    goto LAB_0057d7f0;
  }
  iVar3 = FUN_0050dde4(uStack_28,&UNK_0081765c);
  if ((iVar3 == 0) && (iVar3 = FUN_007955e0(uVar9,uVar2), iVar3 == 0)) {
    lStack_78 = 0;
    puVar5 = (undefined1 *)FUN_0067a380(param_1,&lStack_78,uStack_50,uStack_48);
    if (puVar5 == (undefined1 *)0x0) {
      lStack_70 = 0;
      uStack_88 = 0;
      lStack_80 = 0;
      auVar10 = FUN_0067a4b0(param_1,uStack_50,uStack_48,&lStack_70,&lStack_80,&uStack_88);
      piVar6 = auVar10._0_8_;
      if (auVar10._8_4_ != 6) {
        uStack_90 = 0;
        lVar7 = FUN_0067a380(param_1,&uStack_90,piVar6,auVar10._8_8_);
        if ((0xfffffff4 < auVar10._8_4_) &&
           (iVar3 = *piVar6, iVar1 = iVar3 + -1, *piVar6 = iVar1, iVar1 == 0 || iVar3 < 1)) {
          FUN_0065e640(param_1,piVar6,auVar10._8_8_);
        }
        if (lVar7 != 0) {
          puVar5 = (undefined1 *)(lVar7 + lStack_70);
          lStack_78 = lStack_80;
          goto LAB_0057d840;
        }
      }
      goto LAB_0057d7c8;
    }
LAB_0057d840:
    iVar3 = FUN_003405a8(puVar5,lStack_78);
    lVar7 = lStack_78;
    if (iVar3 == 0) {
      for (; lVar7 != 0; lVar7 = lVar7 + -1) {
        *puVar5 = 0;
        puVar5 = puVar5 + 1;
      }
      goto LAB_0057d7c8;
    }
    iVar3 = FUN_0067d700(param_1,puVar5,lStack_78,&lStack_70,&UNK_0081765c);
    for (lVar7 = lStack_78; lVar7 != 0; lVar7 = lVar7 + -1) {
      *puVar5 = 0;
      puVar5 = puVar5 + 1;
    }
    if (iVar3 != 0) {
      if (iStack_68 == 6) {
        auVar11 = FUN_0065e8c0(param_1);
        piVar6 = auVar11._0_8_;
        if ((0xfffffff4 < auVar11._8_4_) &&
           (iVar3 = *piVar6, iVar1 = iVar3 + -1, *piVar6 = iVar1, iVar1 == 0 || iVar3 < 1)) {
          FUN_0065e640(param_1,piVar6);
        }
      }
      goto LAB_0057d7c8;
    }
    auVar10 = FUN_0057bc28(param_1,lVar4,uStack_28,lStack_70,CONCAT44(uStack_64,iStack_68),uStack_60
                           ,uStack_58,0);
  }
  else {
LAB_0057d7c8:
    auVar10 = FUN_005787e8(param_1,&UNK_008124b5);
  }
  uVar8 = auVar10._0_8_ & 0xffffffff00000000;
LAB_0057d7f0:
  FUN_00574d04(auStack_d8);
  auVar10._8_8_ = auVar10._8_8_;
  auVar10._0_8_ = uVar8 | auVar10._0_8_ & 0xffffffff;
  return auVar10;
}



/* RVA 47d984 */

undefined1  [16]
Inspect_47d984(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
              undefined8 param_5)

{
  int iVar1;
  undefined8 uVar2;
  char *pcVar3;
  undefined1 *puVar4;
  long lVar5;
  ulong uVar6;
  undefined1 uVar7;
  undefined1 uVar8;
  undefined1 auVar9 [16];
  undefined1 auStack_90 [72];
  ulong uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  ulong uStack_18;
  
  uVar2 = FUN_0065aa30();
  FUN_00574ce8(auStack_90,param_1,param_4,param_5,uVar2);
  iVar1 = FUN_00574e08(auStack_90,&UNK_00818de4,&uStack_40);
  if (iVar1 == 0) {
    uVar6 = 0;
    auVar9 = ZEXT816(6) << 0x40;
  }
  else {
    pcVar3 = (char *)FUN_0067a380(param_1,&uStack_18,uStack_40,uStack_38);
    if (((((pcVar3 != (char *)0x0) && (3 < uStack_18)) && (*pcVar3 == '\x02')) &&
        ((pcVar3[1] == ' ' && (*(short *)(pcVar3 + 2) == 0x20)))) && (uStack_18 == 0x24)) {
      puVar4 = (undefined1 *)FUN_0079a510(0x56);
      uStack_48 = 0x50;
      iVar1 = func_0x004f9bb0(pcVar3 + 4,0x20,puVar4 + 6,&uStack_48);
      if ((uStack_48 < 0x51) && ((iVar1 != 0 || (uStack_48 == 0x50)))) {
        *puVar4 = 2;
        puVar4[1] = pcVar3[1];
        if (iVar1 == 0) {
          uVar7 = 0;
          uVar8 = 0;
        }
        else {
          uVar7 = 0xfe;
          if (iVar1 != -5) {
            uVar7 = 0xfc;
          }
          uVar8 = 0xff;
          uStack_48 = 0;
        }
        puVar4[2] = uVar7;
        puVar4[3] = uVar8;
        puVar4[4] = (char)uStack_48;
        puVar4[5] = (char)(uStack_48 >> 8);
        auVar9 = FUN_0067a330(param_1,puVar4,uStack_48 + 6);
        lVar5 = 0;
        do {
          puVar4[lVar5] = 0;
          lVar5 = lVar5 + 1;
        } while (lVar5 != 0x56);
        FUN_0079a554(puVar4);
        uVar6 = auVar9._0_8_ & 0xffffffff00000000;
        goto LAB_0057dab0;
      }
      lVar5 = 0;
      do {
        puVar4[lVar5] = 0;
        lVar5 = lVar5 + 1;
      } while (lVar5 != 0x56);
      FUN_0079a554(puVar4);
    }
    auVar9 = FUN_00577080(param_1,&UNK_008124b5);
    uVar6 = auVar9._0_8_ & 0xffffffff00000000;
  }
LAB_0057dab0:
  FUN_00574d04(auStack_90);
  auVar9._8_8_ = auVar9._8_8_;
  auVar9._0_8_ = uVar6 | auVar9._0_8_ & 0xffffffff;
  return auVar9;
}



/* RVA 47f69c */

undefined1  [16]
Inspect_47f69c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
              undefined8 param_5)

{
  undefined8 uVar1;
  double dVar2;
  int iVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  int *piVar13;
  undefined8 uVar14;
  undefined1 auVar15 [16];
  undefined1 auStack_a8 [72];
  ulong uStack_60;
  ulong uStack_58;
  ulong uStack_50;
  uint uStack_44;
  uint uStack_28;
  uint uStack_24;
  
  lVar10 = FUN_0065aa30();
  FUN_00574ce8(auStack_a8,param_1,param_4,param_5,lVar10);
  iVar3 = FUN_00326c90(&uStack_24,&uStack_50,&uStack_58,&uStack_60,&uStack_28,&uStack_44);
  if (iVar3 == 0) {
    uVar12 = 0;
    uVar11 = 0;
    uVar14 = 2;
  }
  else {
    uVar14 = *(undefined8 *)(lVar10 + 0x90);
    if ((int)uVar14 == 3) {
      auVar15 = FUN_0065dd00(param_1);
      uVar14 = auVar15._8_8_;
      *(undefined1 (*) [16])(lVar10 + 0x88) = auVar15;
      if (auVar15._8_4_ == 6) {
        uVar12 = 0;
        uVar11 = 0;
        uVar14 = 6;
        *(undefined4 *)(lVar10 + 0x88) = 0;
        *(undefined8 *)(lVar10 + 0x90) = 3;
        goto LAB_0057f8e8;
      }
    }
    if (uStack_60 != *(ulong *)(lVar10 + 0x98)) {
      uVar1 = 0;
      dVar2 = (double)(ulong)uStack_24;
      if ((int)uStack_24 < 0) {
        uVar1 = 7;
        dVar2 = (double)uStack_24;
      }
      uVar4 = FUN_00665d20(param_1,*(undefined8 *)(lVar10 + 0x88),uVar14,0,dVar2,uVar1,7);
      uVar14 = 0;
      dVar2 = (double)(uStack_50 & 0xffffffff);
      if ((long)(int)uStack_50 != uStack_50) {
        uVar14 = 7;
        dVar2 = (double)(long)uStack_50;
      }
      uVar5 = FUN_00665d20(param_1,*(undefined8 *)(lVar10 + 0x88),*(undefined8 *)(lVar10 + 0x90),1,
                           dVar2,uVar14,7);
      uVar14 = 0;
      dVar2 = (double)(uStack_58 & 0xffffffff);
      if ((long)(int)uStack_58 != uStack_58) {
        uVar14 = 7;
        dVar2 = (double)(long)uStack_58;
      }
      uVar6 = FUN_00665d20(param_1,*(undefined8 *)(lVar10 + 0x88),*(undefined8 *)(lVar10 + 0x90),2,
                           dVar2,uVar14,7);
      uVar14 = 0;
      dVar2 = (double)(uStack_60 & 0xffffffff);
      if ((long)(int)uStack_60 != uStack_60) {
        uVar14 = 7;
        dVar2 = (double)(long)uStack_60;
      }
      uVar7 = FUN_00665d20(param_1,*(undefined8 *)(lVar10 + 0x88),*(undefined8 *)(lVar10 + 0x90),3,
                           dVar2,uVar14,7);
      uVar14 = 0;
      dVar2 = (double)(ulong)uStack_28;
      if ((int)uStack_28 < 0) {
        uVar14 = 7;
        dVar2 = (double)uStack_28;
      }
      uVar8 = FUN_00665d20(param_1,*(undefined8 *)(lVar10 + 0x88),*(undefined8 *)(lVar10 + 0x90),4,
                           dVar2,uVar14,7);
      uVar14 = 0;
      dVar2 = (double)(ulong)uStack_44;
      if ((int)uStack_44 < 0) {
        uVar14 = 7;
        dVar2 = (double)uStack_44;
      }
      uVar9 = FUN_00665d20(param_1,*(undefined8 *)(lVar10 + 0x88),*(undefined8 *)(lVar10 + 0x90),5,
                           dVar2,uVar14,7);
      if ((int)(uVar5 | uVar4 | uVar6 | uVar7 | uVar8 | uVar9) < 0) {
        uVar12 = 0;
        uVar11 = 0;
        uVar14 = 6;
        goto LAB_0057f8e8;
      }
      uVar14 = *(undefined8 *)(lVar10 + 0x90);
      *(ulong *)(lVar10 + 0x98) = uStack_60;
    }
    piVar13 = *(int **)(lVar10 + 0x88);
    if (0xfffffff4 < (uint)uVar14) {
      *piVar13 = *piVar13 + 1;
    }
    uVar11 = (ulong)piVar13 & 0xffffffff00000000;
    uVar12 = (ulong)piVar13 & 0xffffffff;
  }
LAB_0057f8e8:
  FUN_00574d04(auStack_a8);
  auVar15._8_8_ = uVar14;
  auVar15._0_8_ = uVar11 | uVar12;
  return auVar15;
}



/* RVA 47f914 */

bool Inspect_47f914(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
                   undefined8 param_5)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  undefined1 auStack_78 [72];
  int iStack_14;
  
  uVar3 = FUN_0065aa30();
  FUN_00574ce8(auStack_78,param_1,param_4,param_5,uVar3);
  iVar2 = FUN_00574e08(auStack_78,&UNK_0081774b,&iStack_14);
  if (iVar2 == 0) {
    bVar1 = false;
  }
  else {
    if (iStack_14 == 1) {
      iVar2 = FUN_00355808();
    }
    else {
      if (iStack_14 != 0) {
        bVar1 = false;
        goto LAB_0057f9a8;
      }
      iVar2 = FUN_00479e04();
    }
    bVar1 = iVar2 != 0;
  }
LAB_0057f9a8:
  FUN_00574d04(auStack_78);
  return bVar1;
}



/* RVA 47fa78 */

undefined4
Inspect_47fa78(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
              undefined8 param_5)

{
  int iVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  undefined1 auStack_78 [8];
  int iStack_70;
  int iStack_14;
  
  uVar3 = FUN_0065aa30();
  FUN_00574ce8(auStack_78,param_1,param_4,param_5,uVar3);
  if (iStack_70 == 0) {
    uVar2 = FUN_0046aa3c();
  }
  else {
    iVar1 = FUN_00574e08(auStack_78,&UNK_0081774b,&iStack_14);
    if (iVar1 == 0) {
      uVar2 = 0;
    }
    else if ((iStack_14 == -1) || (iStack_14 == 1)) {
      FUN_00255cd0(0,iStack_14,0x98c0f0);
      uVar2 = 1;
    }
    else if (iStack_14 == 0) {
      uVar2 = uRam000000000098c0f0;
    }
    else {
      uVar2 = 0;
    }
  }
  FUN_00574d04(auStack_78);
  return uVar2;
}



/* RVA 47fb5c */

bool Inspect_47fb5c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
                   undefined8 param_5)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  undefined1 auStack_78 [8];
  int iStack_70;
  undefined8 *puStack_68;
  
  uVar3 = FUN_0065aa30();
  FUN_00574ce8(auStack_78,param_1,param_4,param_5,uVar3);
  if (iStack_70 == 1) {
    iVar2 = FUN_00667030(param_1,*puStack_68,puStack_68[1]);
    if (-1 < iVar2) {
      FUN_004d6570(iVar2 != 0);
      iVar2 = FUN_002e7f40();
      bVar1 = iVar2 != 0;
      goto LAB_0057fbe0;
    }
  }
  bVar1 = false;
LAB_0057fbe0:
  FUN_00574d04(auStack_78);
  return bVar1;
}



/* RVA 47fc04 */

undefined1  [16]
Inspect_47fc04(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
              undefined8 param_5)

{
  long lVar1;
  undefined1 auStack_78 [72];
  
  lVar1 = FUN_0065aa30();
  FUN_00574ce8(auStack_78,param_1,param_4,param_5,lVar1);
  if ((*(long *)(lVar1 + 0x20) != 0) && (lVar1 = *(long *)(*(long *)(lVar1 + 0x20) + 8), lVar1 != 0)
     ) {
    FUN_0052d4a0(lVar1);
    FUN_005347a4(lVar1);
  }
  FUN_003186e0();
  FUN_00574d04(auStack_78);
  return ZEXT816(3) << 0x40;
}



/* RVA 47fc8c */

undefined1  [16]
Inspect_47fc8c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
              undefined8 param_5)

{
  long lVar1;
  undefined1 auStack_78 [72];
  
  lVar1 = FUN_0065aa30();
  FUN_00574ce8(auStack_78,param_1,param_4,param_5,lVar1);
  if ((*(long *)(lVar1 + 0x20) != 0) && (lVar1 = *(long *)(*(long *)(lVar1 + 0x20) + 8), lVar1 != 0)
     ) {
    FUN_0052d4a0(lVar1);
    FUN_005347a4(lVar1);
  }
  FUN_003031a8();
  FUN_00574d04(auStack_78);
  return ZEXT816(3) << 0x40;
}



/* RVA 85834 */

/* WARNING: Removing unreachable block (ram,0x001858ac) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

byte Inspect_85834(undefined8 param_1)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  byte bVar6;
  char cVar7;
  bool bVar8;
  uint uVar9;
  byte bVar10;
  int iVar11;
  ulong uVar12;
  int *piVar13;
  int iVar14;
  long lVar15;
  uint uVar16;
  uint uVar17;
  uint uVar18;
  uint uVar19;
  ulong uVar20;
  ulong uVar21;
  uint uVar22;
  byte local_134;
  byte local_120 [32];
  undefined8 local_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 local_e0;
  undefined8 uStack_d8;
  byte local_d0 [56];
  undefined1 auStack_98 [32];
  ulong local_78;
  ulong uStack_70;
  
  iVar11 = _DAT_00988f50;
  if (_DAT_00988f50 == 0) {
    do {
      iVar11 = _DAT_0098b298;
      cVar7 = '\x01';
      bVar8 = (bool)ExclusiveMonitorPass(0x98b298,0x10);
      if (bVar8) {
        _DAT_0098b298 = 1;
        cVar7 = ExclusiveMonitorsStatus();
      }
    } while (cVar7 != '\0' || iVar11 != 0);
    uStack_f8 = 0;
    local_100 = 0;
    uStack_e8 = 0;
    uStack_f0 = 0;
    uStack_d8 = 0;
    local_e0 = 0;
    local_d0[8] = 0;
    local_d0[9] = 0;
    local_d0[10] = 0;
    local_d0[0xb] = 0;
    local_d0[0xc] = 0;
    local_d0[0xd] = 0;
    local_d0[0xe] = 0;
    local_d0[0xf] = 0;
    local_d0[0] = 0;
    local_d0[1] = 0;
    local_d0[2] = 0;
    local_d0[3] = 0;
    local_d0[4] = 0;
    local_d0[5] = 0;
    local_d0[6] = 0;
    local_d0[7] = 0;
    local_d0[0x18] = 0;
    local_d0[0x19] = 0;
    local_d0[0x1a] = 0;
    local_d0[0x1b] = 0;
    local_d0[0x1c] = 0;
    local_d0[0x1d] = 0;
    local_d0[0x1e] = 0;
    local_d0[0x1f] = 0;
    local_d0[0x10] = 0;
    local_d0[0x11] = 0;
    local_d0[0x12] = 0;
    local_d0[0x13] = 0;
    local_d0[0x14] = 0;
    local_d0[0x15] = 0;
    local_d0[0x16] = 0;
    local_d0[0x17] = 0;
    local_d0[0x28] = 0;
    local_d0[0x29] = 0;
    local_d0[0x2a] = 0;
    local_d0[0x2b] = 0;
    local_d0[0x2c] = 0;
    local_d0[0x2d] = 0;
    local_d0[0x2e] = 0;
    local_d0[0x2f] = 0;
    local_d0[0x20] = 0;
    local_d0[0x21] = 0;
    local_d0[0x22] = 0;
    local_d0[0x23] = 0;
    local_d0[0x24] = 0;
    local_d0[0x25] = 0;
    local_d0[0x26] = 0;
    local_d0[0x27] = 0;
    iVar11 = FUN_00114020(auStack_98);
    if ((iVar11 == 0) || (uVar12 = thunk_FUN_001378fc(auStack_98,&local_100), (uVar12 & 1) == 0)) {
      FUN_00236c8c(0x988f54,0,0x20);
      FUN_00236c8c(0x989f74,0,0x20);
      _DAT_00988f50 = 2;
      FUN_00239498(auStack_98,0x20);
      FUN_00239498(&local_100,0x60);
      local_134 = 0;
      _DAT_0098b298 = 0;
    }
    else {
      uVar22 = 0;
      do {
        iVar11 = thunk_FUN_0014861c(param_1,local_120);
        if (iVar11 == 0) {
          if (uVar22 < 3) {
            local_78 = (ulong)((uint)(&DAT_008257f8)[uVar22] / 1000000);
            uStack_70 = (ulong)(((uint)(&DAT_008257f8)[uVar22] % 1000000) * 1000);
            do {
              while( true ) {
                uVar12 = FUN_0010ee7c(&DAT_0050ea30,&local_78,&local_78,0,0,0,0);
                uVar17 = (uint)uVar12;
                if (0xfffffffffffff000 < uVar12) break;
                if ((uVar17 == 0) || (piVar13 = (int *)FUN_00509664(), *piVar13 != 4))
                goto LAB_0018594c;
              }
              uVar1 = uVar17 + 1;
              uVar3 = ~uVar17 | 1;
              uVar4 = uVar1 + ~uVar17 * 2;
              uVar2 = (uVar1 + uVar3) * 2;
              iVar14 = uVar3 + uVar17;
              uVar3 = (uVar1 + uVar4 * 2) * 2;
              uVar2 = ((uVar2 | uVar17) ^ 1) + (uVar2 & uVar17);
              uVar4 = (uVar4 ^ 1) + (uVar1 & 1);
              uVar19 = iVar14 * 2;
              uVar1 = ((uVar4 ^ uVar1) + (uVar4 & uVar1) * 2) * 2;
              uVar4 = uVar19 - uVar17;
              uVar1 = (uVar17 << 1 | 1) + iVar14 * -2 + ~uVar19 + uVar1 + (uVar1 | uVar4) +
                      (uVar4 | uVar1 ^ 0xffffffff);
              uVar17 = (uVar2 + (uVar3 | uVar2 ^ 0xffffffff) + (uVar2 | uVar3)) * 2 + 2;
              iVar14 = (uVar1 + 1 + ~uVar1 * 2 | uVar17) + uVar1;
              uVar17 = uVar1 + 1 + uVar17 + (uVar17 + ~uVar17 * 2 | uVar1 ^ 0xffffffff | 1);
              uVar1 = -iVar14 - 2;
              iVar14 = uVar17 + iVar14 * 2 + (uVar1 | uVar17) + (uVar1 | uVar17 ^ 0xffffffff);
              uVar17 = iVar14 + 4;
              uVar1 = iVar14 + 5 + ~uVar17 * 2;
              uVar1 = (uVar17 & 1) + uVar1 + ~uVar1 * 2 + (~uVar17 * 2 + uVar17 | 1) + 1;
              uVar1 = uVar17 + iVar14 + 5 + uVar1 + (uVar1 | -iVar14 - 6U) +
                      (-iVar14 - 6U | uVar1 ^ 0xffffffff);
              uVar17 = uVar1 + 4;
              iVar14 = (uVar17 * 2 & 4) + (uVar17 ^ 2);
              uVar17 = ((uVar1 | 0xfffffffe) + (-iVar14 | 1U) + iVar14 * 2) - 2;
              uVar17 = (uVar17 * 2 & 4) + (uVar17 ^ 2);
              iVar14 = ~uVar17 + uVar17 * 2;
              piVar13 = (int *)FUN_00509664();
              *piVar13 = iVar14;
            } while (iVar14 == 4);
            goto LAB_0018594c;
          }
        }
        else {
          lVar15 = 0;
          uVar17 = (uint)(iVar11 != 1);
          do {
            bVar6 = local_120[lVar15];
            bVar10 = local_d0[lVar15];
            *(byte *)(lVar15 + 0x988f54) = bVar6;
            uVar16 = (uint)bVar6;
            uVar19 = uVar16 + 1 + ~(uint)bVar6 * 2;
            uVar9 = (uVar16 - 1) * 2 & 2;
            uVar2 = uVar19 + uVar16 + 1 + ((uint)bVar10 ^ uVar19 ^ 0xffffffff) +
                    (~uVar19 | bVar10 ^ 0xffffffff);
            uVar3 = uVar9 + (uVar16 - 1 ^ 1);
            uVar18 = (uint)bVar10;
            uVar1 = uVar2 + 2;
            uVar4 = ~uVar2 + uVar18 + (uVar2 + 1 | uVar18 ^ 0xffffffff);
            uVar19 = uVar19 + uVar16;
            uVar16 = (uVar4 ^ uVar1) + (uVar4 & uVar1) * 2;
            uVar4 = uVar3 + uVar19 + (-uVar3 & (uVar19 ^ 0xffffffff)) * 2 +
                    (uVar19 + (-uVar3 | uVar19 ^ 0xffffffff)) * 2 + 2;
            uVar19 = (uint)bVar10;
            uVar1 = uVar1 + uVar18 + (0xfe - uVar2 | uVar18 ^ 0xffffffff);
            uVar4 = (uVar4 - uVar19) + (uVar19 & (uVar4 ^ 0xffffffff));
            uVar4 = (uVar4 ^ uVar19 + 1) + (uVar4 & uVar19 + 1) * 2;
            uVar2 = (uVar3 ^ 0xfffffffe) + uVar9 + uVar3 * 2;
            iVar14 = uVar16 + (uVar1 | uVar16 ^ 0xffffffff) + (uVar16 | uVar1);
            uVar1 = iVar14 + 1;
            uVar4 = (uVar2 | -uVar4) + uVar4 + (~uVar4 + uVar4 * 2 | uVar2);
            iVar14 = iVar14 + 2;
            uVar4 = uVar4 + ~uVar4 * 2;
            uVar2 = uVar1 & (uVar4 ^ 0xffffffff);
            uVar2 = ((iVar14 + ~uVar1 * 2 & (uVar4 ^ 0xffffffff)) - (uVar1 + uVar2)) +
                    (iVar14 + uVar4 + uVar2) * 2;
            uVar3 = uVar2 + uVar17;
            uVar1 = (uVar17 ^ 1) + ~uVar17 * 2 + (uVar17 & 1) * 2;
            iVar14 = (uVar2 | uVar17) + 1;
            uVar4 = uVar2 + (uVar2 * 2 ^ 0xffffffff);
            uVar19 = (uVar2 | uVar17 ^ 0xffffffff) + uVar17 + iVar14;
            uVar16 = (~uVar3 | 1) + (uVar2 | uVar17) + (uVar3 | 1);
            iVar5 = (uVar19 * 2 & 4) + (uVar19 ^ 2);
            uVar1 = (uVar4 | uVar1 ^ 0xffffffff) + uVar2 + (uVar4 | uVar1) * 2 + 2;
            uVar19 = iVar5 + uVar1 + (-iVar5 | uVar1 ^ 0xffffffff) + (iVar5 - 1U & uVar1);
            uVar1 = (uVar2 + 1) * 3 + ~uVar2 * 4;
            iVar5 = uVar19 + ~uVar19 * 2;
            uVar4 = iVar5 + (uVar17 - uVar1) + 1;
            uVar18 = -(iVar5 + 2U | uVar17 + ~uVar1);
            uVar9 = (uVar17 - uVar1) + (uVar1 - uVar17) * 2;
            iVar5 = (uVar4 ^ uVar18) + (uVar4 & uVar18) * 2;
            uVar1 = uVar19 + uVar17 + ~uVar1 + (uVar9 + (-uVar19 | uVar9 ^ 0xffffffff)) * 2 + 2;
            uVar4 = (iVar5 * 2 ^ 0xffffffffU) + iVar5 * 4 + 2;
            uVar17 = ((uVar2 & uVar17 ^ 1) + (uVar2 & uVar17 & 1) * 2 + (iVar14 - uVar3) * 2) - 3;
            uVar1 = (uVar4 ^ uVar1) + (uVar4 & uVar1) * 2;
            uVar4 = (uVar17 ^ uVar16) + (uVar17 & uVar16) * 2;
            uVar2 = ~uVar1 + uVar1 * 2;
            uVar3 = uVar2 + (uVar4 & -uVar1);
            uVar17 = uVar4 + (uVar2 | uVar4 ^ 0xffffffff) + uVar3 + 1;
            uVar19 = uVar2 + uVar4;
            uVar16 = ~uVar17;
            uVar1 = ((uVar1 - 1 | uVar4) - (uVar4 + uVar1)) + uVar19;
            uVar17 = uVar1 + uVar17 * 3 + (uVar16 & (uVar1 ^ 0xffffffff)) * 2 +
                     (uVar16 | uVar1 ^ 0xffffffff) * 2 + 3;
            uVar12 = lVar15 + 2;
            uVar1 = (uVar19 ^ -uVar3) + (uVar3 ^ -(uVar2 & uVar4)) +
                    ((uVar19 & -uVar3) + (uVar3 & -(uVar2 & uVar4))) * 2;
            uVar21 = -lVar15 - 2U | 1;
            lVar15 = (-lVar15 - 2U | 0xfffffffffffffffe) + uVar12;
            uVar21 = (uVar21 ^ uVar12) + (uVar21 & uVar12) * 2;
            uVar12 = lVar15 + 1;
            uVar21 = (uVar21 & -lVar15 - 2U) + uVar12 + (uVar21 & uVar12);
            uVar12 = ~uVar21 * 2;
            uVar17 = uVar17 + uVar1 + 1 + (uVar17 & uVar1) +
                     (uVar17 + ~uVar17 * 2 + 1 | uVar1 + 1 + ~uVar1 * 2);
            uVar12 = uVar21 + (-uVar21 - 2 | uVar12) + (uVar21 + 1 | uVar12) + 2;
            uVar21 = (((uVar21 ^ 0x7ffffffffffffffe) + ~uVar21 * -2) - (uVar21 * 2 & 2)) * 2;
            uVar20 = uVar21 | uVar12;
            lVar15 = uVar21 + uVar12 + 1;
            uVar12 = (uVar21 + uVar12 | 1) + (uVar12 & 1) +
                     (uVar12 + ~uVar12 * 2 + 1 | uVar21 ^ 0xffffffffffffffff);
            lVar15 = (lVar15 - uVar20) + uVar12 + (uVar20 - lVar15 | uVar12 ^ 0xffffffffffffffff) +
                     (uVar12 & lVar15 + ~uVar20);
          } while (lVar15 != 0x20);
          local_134 = uVar17 == 0;
          iVar14 = 1;
          if (!(bool)local_134) {
            iVar14 = 2;
          }
          thunk_FUN_00188d44(auStack_98,&local_100,iVar14,local_120,0x989f74);
          _DAT_00988f50 = iVar14;
          FUN_00239498(local_120,0x20);
          FUN_00239498(auStack_98,0x20);
          FUN_00239498(&local_100,0x60);
          _DAT_0098b298 = 0;
LAB_0018594c:
          if (iVar11 != 0) goto LAB_001858d0;
        }
        iVar11 = uVar22 + (~uVar22 | 2) + 1;
        iVar14 = uVar22 + (~uVar22 | 0xfffffffd) + 3;
        iVar5 = (uVar22 ^ 0xfffffffd) + 1;
        uVar17 = iVar14 + iVar11;
        uVar1 = iVar5 - iVar11;
        iVar11 = (uVar17 ^ uVar1) + ((iVar14 + iVar5) - (uVar17 | uVar1)) * 2;
        iVar14 = (uVar22 << 1 | 4) - uVar22;
        uVar1 = iVar11 * 2;
        uVar4 = iVar14 - 2;
        uVar22 = iVar11 * 2 | 1;
        uVar17 = (iVar14 + uVar22) - 3;
        uVar17 = (uVar17 ^ -(uVar1 | uVar4)) + (uVar17 & -(uVar1 | uVar4)) * 2;
        uVar22 = (uVar4 & 1) + (uVar1 + uVar4 | 1) + (uVar22 + ~uVar1 * 2 | 1U - iVar14) + 1;
        uVar22 = (uVar17 ^ uVar22) + (uVar17 & uVar22) * 2;
        uVar17 = ~uVar22 * 2 + uVar22 * 3;
        uVar22 = uVar17 + 1 + ~uVar17 * 2 + uVar17 * 2;
        iVar11 = (uVar22 | 1) + (uVar17 + 1 & 1) + ((uVar22 ^ 0xffffffff) & 0xfffffffe);
        uVar22 = (~uVar22 | 1) + (uVar17 * 2 & 2) + uVar22 * 2;
        uVar17 = -iVar11 - 2;
        uVar22 = uVar22 + iVar11 * 2 + (uVar17 | uVar22) + (uVar17 | uVar22 ^ 0xffffffff) + 4;
      } while (uVar22 != 4);
      FUN_00239498(local_120,0x20);
      FUN_00239498(auStack_98,0x20);
      FUN_00239498(&local_100,0x60);
      local_134 = 0;
      _DAT_0098b298 = 0;
    }
  }
  else {
    bVar10 = thunk_FUN_001bfb20(_DAT_00988f50,0,0,0);
    local_134 = bVar10 & iVar11 == 1;
  }
LAB_001858d0:
  return local_134 & 1;
}


