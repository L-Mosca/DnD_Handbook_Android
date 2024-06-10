package com.example.dndhandbook.presentation.screen.monster_detail.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dndhandbook.R
import com.example.dndhandbook.common.extensions_functions.extractArmorClass
import com.example.dndhandbook.domain.models.ArmorClass
import com.example.dndhandbook.presentation.base_components.BaseText

@Composable
fun MonsterArmorClass(armorClass: List<ArmorClass> = emptyList()) {

    if (armorClass.isEmpty()) return

    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.BottomStart) {
        Row {
            BaseText(
                text = stringResource(id = R.string.armor_class),
                fontSize = 14.sp,
                color = colorResource(id = R.color.crimson_800),
                fontWeight = FontWeight.W600,
            )
            Spacer(modifier = Modifier.width(8.dp))
            BaseText(
                text = armorClass.extractArmorClass(),
                fontSize = 14.sp,
                fontWeight = FontWeight.W600,
                color = colorResource(id = R.color.gray_400)
            )
        }
    }
}

@Preview
@Composable
fun MonsterArmorClassPreview() {
    val immunities =
        listOf(ArmorClass(type = "Natural", value = 20), ArmorClass(type = "plate", value = 10))

    MonsterArmorClass(immunities)
}