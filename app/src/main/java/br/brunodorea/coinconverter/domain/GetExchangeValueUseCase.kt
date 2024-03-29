package br.brunodorea.coinconverter.domain

import br.brunodorea.coinconverter.core.UseCase
import br.brunodorea.coinconverter.data.model.ExchangeResponseValue
import br.brunodorea.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class GetExchangeValueUseCase(
    private val repository: CoinRepository
) : UseCase<String, ExchangeResponseValue>() {

    override suspend fun execute(param: String): Flow<ExchangeResponseValue> {
        return repository.getExchangeValue(param)
    }

}